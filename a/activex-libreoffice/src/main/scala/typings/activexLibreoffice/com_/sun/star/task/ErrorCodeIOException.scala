package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IOException that carries a legacy error code (not only I/O related). */
@js.native
trait ErrorCodeIOException extends Exception {
  
  /** specifies the error code; see tools/errcode.hxx for details. */
  var ErrCode: Double = js.native
}
object ErrorCodeIOException {
  
  @scala.inline
  def apply(Context: XInterface, ErrCode: Double, Message: String): ErrorCodeIOException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrCode = ErrCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCodeIOException]
  }
  
  @scala.inline
  implicit class ErrorCodeIOExceptionMutableBuilder[Self <: ErrorCodeIOException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrCode(value: Double): Self = StObject.set(x, "ErrCode", value.asInstanceOf[js.Any])
  }
}
