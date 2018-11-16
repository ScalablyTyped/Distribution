package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FieldEnum extends js.Object

@JSGlobal("ADODB.FieldEnum")
@js.native
object FieldEnum extends js.Object {
  @js.native
  sealed trait adDefaultStream
    extends activexDashAdodbLib.ADODBNs.FieldEnum
  
  @js.native
  sealed trait adRecordURL
    extends activexDashAdodbLib.ADODBNs.FieldEnum
  
  /* -1 */ val adDefaultStream: adDefaultStream with scala.Double = js.native
  /* -2 */ val adRecordURL: adRecordURL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.FieldEnum with scala.Double] = js.native
}

