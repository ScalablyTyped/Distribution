package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.javaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * must be implemented by the user of the {@link XJavaVM} .
  * @deprecated DeprecatedA UNO interface seems to be at the wrong abstraction level for this functionality (also, the C++ classes jvmaccess::VirtualMachine and
  */
trait XJavaVM
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the address of the Java Virtual Machine.
    *
    * If the VM is not already instantiated, it will be now.
    *
    * If the `processID` is a normal 16-byte ID, the returned `any` contains a JNI `JavaVM` pointer as a `long` or `hyper` integer (depending on the
    * platform). If the `processID` does not match the current process, or if the VM cannot be instantiated for whatever reason, a `VOID``any` is returned.
    *
    * If the `processID` has an additional 17th byte of value  `0` , the returned `any` contains a non  -  reference-counted pointer to a
    * (reference-counted) instance of the C++ `jvmaccess::VirtualMachine` class, always represented as a `hyper` integer. The pointer is guaranteed to be
    * valid as long as the reference to this {@link com.sun.star.java.XJavaVM} is valid (but the pointer should be converted into a reference-counted
    * reference as soon as possible). Again, if the first 16 bytes of the `processID` do not match the current process, or if the VM cannot be instantiated
    * for whatever reason, a `VOID``any` is returned.
    *
    * If the `processID` has an additional 17th byte of value  `1` , the returned `any` contains a non  -  reference-counted pointer to a
    * (reference-counted) instance of the C++ `jvmaccess::UnoVirtualMachine` class, always represented as a `hyper` integer. The pointer is guaranteed to be
    * valid as long as the reference to this {@link com.sun.star.java.XJavaVM} is valid. Again, if the first 16 bytes of the `processID` do not match the
    * current process, or if the VM cannot be instantiated for whatever reason, a `VOID``any` is returned.
    *
    * The first form (returning a JNI `JavaVM` pointer) is mainly for backwards compatibility, new code should use the second form (returning a pointer to a
    * `jvmaccess::VirtualMachine` ) if it does not want to use the Java UNO environment, and it should use the third form (returning a pointer to a
    * `jvmaccess::UnoVirtualMachine` ) if it wants to use the Java UNO environment. For example, one advantage of using `jvmaccess::VirtualMachine` instead
    * of the raw `JavaVM` pointer is that whenever you attach a native thread to the Java virtual machine, that thread's context `ClassLoader` (see
    * `java.lang.Thread.getContextClassLoader` ) will automatically be set to a meaningful value.
    * @param processID The process ID of the caller's process, possibly extended by a 17th byte of value `0` or  `1` .
    * @returns On success, the `any` contains a pointer represented as `long` or `hyper` , otherwise the `any` is `VOID` .
    */
  def getJavaVM(processID: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): js.Any
  /**
    * Returns `TRUE` if the VM is enabled.
    *
    * It is only possible to get the VM, if this method return 0.
    */
  def isVMEnabled(): scala.Boolean
  /** returns `TRUE` if the VM is started successfully, otherwise `FALSE` . */
  def isVMStarted(): scala.Boolean
}

object XJavaVM {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getJavaVM: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => js.Any,
    isVMEnabled: () => scala.Boolean,
    isVMStarted: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XJavaVM = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getJavaVM = js.Any.fromFunction1(getJavaVM), isVMEnabled = js.Any.fromFunction0(isVMEnabled), isVMStarted = js.Any.fromFunction0(isVMStarted), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XJavaVM]
  }
}

