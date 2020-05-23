package typings.activexLibreoffice.com_.sun.star.java_

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * must be implemented by the user of the {@link XJavaThreadRegister_11} .
  * @deprecated Deprecated
  */
trait XJavaThreadRegister11 extends XInterface {
  /** returns `TRUE` if the current thread is already attached to the VM otherwise `FALSE` . */
  def isThreadAttached(): Boolean
  /**
    * registers the current thread.
    *
    * This method should be called every time a JNI function is called from Java.
    */
  def registerThread(): Unit
  /**
    * revokes the current thread from the list of registered threads.
    *
    * This method should be called at the end of every JNI call from Java.
    */
  def revokeThread(): Unit
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
}

