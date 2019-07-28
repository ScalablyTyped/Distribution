package typings.activexDashLibreoffice.comNs.sunNs.starNs.javaNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
trait JavaVMCreationFailureException extends Exception {
  /**
    * contains an error code that reflects the returned error code of JNI_CreateJavaVM or other errors. A negative value represents the returned error code
    * of JNI_CreateJavaVM. All other values indicate a different cause.
    */
  var ErrorCode: Double
}

object JavaVMCreationFailureException {
  @scala.inline
  def apply(Context: XInterface, ErrorCode: Double, Message: String): JavaVMCreationFailureException = {
    val __obj = js.Dynamic.literal(Context = Context, ErrorCode = ErrorCode, Message = Message)
  
    __obj.asInstanceOf[JavaVMCreationFailureException]
  }
}

