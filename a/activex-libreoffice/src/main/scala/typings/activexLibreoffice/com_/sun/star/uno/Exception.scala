package typings.activexLibreoffice.com_.sun.star.uno

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * the base of all UNO exceptions
  *
  * All exceptions defined in UNO idl should derive from this exception.
  */
@js.native
trait Exception extends js.Object {
  
  /**
    * should contain a reference to the original, which raised the exception.
    *
    * May be NULL.
    */
  var Context: XInterface = js.native
  
  /**
    * gives a detailed description of the reason, why the exception was thrown.
    *
    * The description should be as detailed as possible.
    */
  var Message: String = js.native
}
object Exception {
  
  @scala.inline
  def apply(Context: XInterface, Message: String): Exception = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exception]
  }
  
  @scala.inline
  implicit class ExceptionOps[Self <: Exception] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(value: XInterface): Self = this.set("Context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
  }
}
