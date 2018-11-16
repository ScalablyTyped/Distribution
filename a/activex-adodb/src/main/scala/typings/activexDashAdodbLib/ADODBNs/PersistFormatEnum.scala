package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PersistFormatEnum extends js.Object

@JSGlobal("ADODB.PersistFormatEnum")
@js.native
object PersistFormatEnum extends js.Object {
  @js.native
  sealed trait adPersistADTG
    extends activexDashAdodbLib.ADODBNs.PersistFormatEnum
  
  @js.native
  sealed trait adPersistXML
    extends activexDashAdodbLib.ADODBNs.PersistFormatEnum
  
  /* 0 */ val adPersistADTG: adPersistADTG with scala.Double = js.native
  /* 1 */ val adPersistXML: adPersistXML with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.PersistFormatEnum with scala.Double] = js.native
}

