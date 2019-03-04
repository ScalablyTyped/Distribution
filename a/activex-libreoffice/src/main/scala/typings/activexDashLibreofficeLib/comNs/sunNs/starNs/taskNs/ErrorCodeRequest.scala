package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a general error exception. It can be used to transport the error code information. E.g. that can be useful for interactions.
  * @since OOo 1.1.2
  */
trait ErrorCodeRequest
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** specifies the error code. */
  var ErrCode: scala.Double
}

object ErrorCodeRequest {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ErrCode: scala.Double,
    Message: java.lang.String
  ): ErrorCodeRequest = {
    val __obj = js.Dynamic.literal(Context = Context, ErrCode = ErrCode, Message = Message)
  
    __obj.asInstanceOf[ErrorCodeRequest]
  }
}

