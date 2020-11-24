package typings.activexLibreoffice.com_.sun.star.java_

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * must be implemented by the user of the {@link XJavaThreadRegister_11} .
  * @deprecated Deprecated
  */
@js.native
trait XJavaThreadRegister11 extends XInterface {
  
  /** returns `TRUE` if the current thread is already attached to the VM otherwise `FALSE` . */
  def isThreadAttached(): Boolean = js.native
  
  /**
    * registers the current thread.
    *
    * This method should be called every time a JNI function is called from Java.
    */
  def registerThread(): Unit = js.native
  
  /**
    * revokes the current thread from the list of registered threads.
    *
    * This method should be called at the end of every JNI call from Java.
    */
  def revokeThread(): Unit = js.native
}
object XJavaThreadRegister11 {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    isThreadAttached: () => Boolean,
    queryInterface: `type` => js.Any,
    registerThread: () => Unit,
    release: () => Unit,
    revokeThread: () => Unit
  ): XJavaThreadRegister11 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), isThreadAttached = js.Any.fromFunction0(isThreadAttached), queryInterface = js.Any.fromFunction1(queryInterface), registerThread = js.Any.fromFunction0(registerThread), release = js.Any.fromFunction0(release), revokeThread = js.Any.fromFunction0(revokeThread))
    __obj.asInstanceOf[XJavaThreadRegister11]
  }
  
  @scala.inline
  implicit class XJavaThreadRegister11Ops[Self <: XJavaThreadRegister11] (val x: Self) extends AnyVal {
    
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
    def setIsThreadAttached(value: () => Boolean): Self = this.set("isThreadAttached", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegisterThread(value: () => Unit): Self = this.set("registerThread", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRevokeThread(value: () => Unit): Self = this.set("revokeThread", js.Any.fromFunction0(value))
  }
}
