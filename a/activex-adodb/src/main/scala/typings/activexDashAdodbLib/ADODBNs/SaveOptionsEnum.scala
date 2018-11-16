package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SaveOptionsEnum extends js.Object

@JSGlobal("ADODB.SaveOptionsEnum")
@js.native
object SaveOptionsEnum extends js.Object {
  @js.native
  sealed trait adSaveCreateNotExist
    extends activexDashAdodbLib.ADODBNs.SaveOptionsEnum
  
  @js.native
  sealed trait adSaveCreateOverWrite
    extends activexDashAdodbLib.ADODBNs.SaveOptionsEnum
  
  /* 1 */ val adSaveCreateNotExist: adSaveCreateNotExist with scala.Double = js.native
  /* 2 */ val adSaveCreateOverWrite: adSaveCreateOverWrite with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.SaveOptionsEnum with scala.Double] = js.native
}

