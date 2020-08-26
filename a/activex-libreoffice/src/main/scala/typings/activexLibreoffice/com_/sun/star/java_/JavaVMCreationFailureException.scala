package typings.activexLibreoffice.com_.sun.star.java_

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * indicates that the Java Virtual Machine could not be created
  *
  * This exception can be thrown when the creation of the Java Virtual Machine failed, even if the runtime library could be loaded. Possible reasons for a
  * failure are that JNI_CreateJavaVM returns an error code that reflects a failure, JNI_CreateJavaVM does not return because it tries to quit the process
  * ( _exit), the shared library is corrupted, so that the symbols for JNI_GetDefaultVMInitArgs or JNI_CreateJavaVM cannot be found, etc.
  * @since OOo 1.1.2
  */
@js.native
trait JavaVMCreationFailureException extends Exception {
  /**
    * contains an error code that reflects the returned error code of JNI_CreateJavaVM or other errors. A negative value represents the returned error code
    * of JNI_CreateJavaVM. All other values indicate a different cause.
    */
  var ErrorCode: Double = js.native
}

object JavaVMCreationFailureException {
  @scala.inline
  def apply(Context: XInterface, ErrorCode: Double, Message: String): JavaVMCreationFailureException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrorCode = ErrorCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[JavaVMCreationFailureException]
  }
  @scala.inline
  implicit class JavaVMCreationFailureExceptionOps[Self <: JavaVMCreationFailureException] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: Double): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
  }
  
}

