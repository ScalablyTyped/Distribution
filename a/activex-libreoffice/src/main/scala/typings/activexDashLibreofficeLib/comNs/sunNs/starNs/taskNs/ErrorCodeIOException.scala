package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IOException that carries a legacy error code (not only I/O related). */
trait ErrorCodeIOException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** specifies the error code; see tools/errcode.hxx for details. */
  var ErrCode: scala.Double
}

object ErrorCodeIOException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ErrCode: scala.Double,
    Message: java.lang.String
  ): ErrorCodeIOException = {
    val __obj = js.Dynamic.literal(Context = Context, ErrCode = ErrCode, Message = Message)
  
    __obj.asInstanceOf[ErrorCodeIOException]
  }
}

