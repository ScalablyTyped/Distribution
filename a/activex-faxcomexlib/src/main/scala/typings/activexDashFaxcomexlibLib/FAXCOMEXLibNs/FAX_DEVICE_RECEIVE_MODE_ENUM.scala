package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FAX_DEVICE_RECEIVE_MODE_ENUM extends js.Object

// tslint:disable-next-line:no-const-enum
@JSGlobal("FAXCOMEXLib.FAX_DEVICE_RECEIVE_MODE_ENUM")
@js.native
object FAX_DEVICE_RECEIVE_MODE_ENUM extends js.Object {
  @js.native
  sealed trait fdrmAUTO_ANSWER
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_DEVICE_RECEIVE_MODE_ENUM
  
  @js.native
  sealed trait fdrmMANUAL_ANSWER
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_DEVICE_RECEIVE_MODE_ENUM
  
  @js.native
  sealed trait fdrmNO_ANSWER
    extends activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_DEVICE_RECEIVE_MODE_ENUM
  
  /* 1 */ val fdrmAUTO_ANSWER: fdrmAUTO_ANSWER with scala.Double = js.native
  /* 2 */ val fdrmMANUAL_ANSWER: fdrmMANUAL_ANSWER with scala.Double = js.native
  /* 0 */ val fdrmNO_ANSWER: fdrmNO_ANSWER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashFaxcomexlibLib.FAXCOMEXLibNs.FAX_DEVICE_RECEIVE_MODE_ENUM with scala.Double
  ] = js.native
}

