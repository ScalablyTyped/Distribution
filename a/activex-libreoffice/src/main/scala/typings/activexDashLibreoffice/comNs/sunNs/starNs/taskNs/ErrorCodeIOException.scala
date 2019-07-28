package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IOException that carries a legacy error code (not only I/O related). */
trait ErrorCodeIOException extends Exception {
  /** specifies the error code; see tools/errcode.hxx for details. */
  var ErrCode: Double
}

object ErrorCodeIOException {
  @scala.inline
  def apply(Context: XInterface, ErrCode: Double, Message: String): ErrorCodeIOException = {
    val __obj = js.Dynamic.literal(Context = Context, ErrCode = ErrCode, Message = Message)
  
    __obj.asInstanceOf[ErrorCodeIOException]
  }
}

