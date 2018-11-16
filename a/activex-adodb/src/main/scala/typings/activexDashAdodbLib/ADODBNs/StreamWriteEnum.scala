package typings
package activexDashAdodbLib.ADODBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StreamWriteEnum extends js.Object

@JSGlobal("ADODB.StreamWriteEnum")
@js.native
object StreamWriteEnum extends js.Object {
  @js.native
  sealed trait adWriteChar
    extends activexDashAdodbLib.ADODBNs.StreamWriteEnum
  
  @js.native
  sealed trait adWriteLine
    extends activexDashAdodbLib.ADODBNs.StreamWriteEnum
  
  @js.native
  sealed trait stWriteChar
    extends activexDashAdodbLib.ADODBNs.StreamWriteEnum
  
  @js.native
  sealed trait stWriteLine
    extends activexDashAdodbLib.ADODBNs.StreamWriteEnum
  
  /* 0 */ val adWriteChar: adWriteChar with scala.Double = js.native
  /* 1 */ val adWriteLine: adWriteLine with scala.Double = js.native
  /* 0 */ val stWriteChar: stWriteChar with scala.Double = js.native
  /* 1 */ val stWriteLine: stWriteLine with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashAdodbLib.ADODBNs.StreamWriteEnum with scala.Double] = js.native
}

