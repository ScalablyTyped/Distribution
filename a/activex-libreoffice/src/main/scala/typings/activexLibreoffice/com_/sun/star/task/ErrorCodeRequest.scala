package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a general error exception. It can be used to transport the error code information. E.g. that can be useful for interactions.
  * @since OOo 1.1.2
  */
trait ErrorCodeRequest
  extends StObject
     with Exception {
  
  /** specifies the error code. */
  var ErrCode: Double
}
object ErrorCodeRequest {
  
  @scala.inline
  def apply(Context: XInterface, ErrCode: Double, Message: String): ErrorCodeRequest = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrCode = ErrCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCodeRequest]
  }
  
  @scala.inline
  implicit class ErrorCodeRequestMutableBuilder[Self <: ErrorCodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrCode(value: Double): Self = StObject.set(x, "ErrCode", value.asInstanceOf[js.Any])
  }
}
