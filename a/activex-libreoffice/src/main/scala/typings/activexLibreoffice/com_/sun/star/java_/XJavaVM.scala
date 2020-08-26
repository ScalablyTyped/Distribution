package typings.activexLibreoffice.com_.sun.star.java_

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * must be implemented by the user of the {@link XJavaVM} .
  * @deprecated DeprecatedA UNO interface seems to be at the wrong abstraction level for this functionality (also, the C++ classes jvmaccess::VirtualMachine and
  */
@js.native
trait XJavaVM extends XInterface {
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
  def getJavaVM(processID: SeqEquiv[Double]): js.Any = js.native
  /**
    * Returns `TRUE` if the VM is enabled.
    *
    * It is only possible to get the VM, if this method return 0.
    */
  def isVMEnabled(): Boolean = js.native
  /** returns `TRUE` if the VM is started successfully, otherwise `FALSE` . */
  def isVMStarted(): Boolean = js.native
}

object XJavaVM {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getJavaVM: SeqEquiv[Double] => js.Any,
    isVMEnabled: () => Boolean,
    isVMStarted: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XJavaVM = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getJavaVM = js.Any.fromFunction1(getJavaVM), isVMEnabled = js.Any.fromFunction0(isVMEnabled), isVMStarted = js.Any.fromFunction0(isVMStarted), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XJavaVM]
  }
  @scala.inline
  implicit class XJavaVMOps[Self <: XJavaVM] (val x: Self) extends AnyVal {
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
    def setGetJavaVM(value: SeqEquiv[Double] => js.Any): Self = this.set("getJavaVM", js.Any.fromFunction1(value))
    @scala.inline
    def setIsVMEnabled(value: () => Boolean): Self = this.set("isVMEnabled", js.Any.fromFunction0(value))
    @scala.inline
    def setIsVMStarted(value: () => Boolean): Self = this.set("isVMStarted", js.Any.fromFunction0(value))
  }
  
}

