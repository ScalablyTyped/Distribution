package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.javaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * must be implemented by the user of the {@link XJavaThreadRegister_11} .
  * @deprecated Deprecated
  */
trait XJavaThreadRegister_11
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns `TRUE` if the current thread is already attached to the VM otherwise `FALSE` . */
  def isThreadAttached(): scala.Boolean
  /**
    * registers the current thread.
    *
    * This method should be called every time a JNI function is called from Java.
    */
  def registerThread(): scala.Unit
  /**
    * revokes the current thread from the list of registered threads.
    *
    * This method should be called at the end of every JNI call from Java.
    */
  def revokeThread(): scala.Unit
}

