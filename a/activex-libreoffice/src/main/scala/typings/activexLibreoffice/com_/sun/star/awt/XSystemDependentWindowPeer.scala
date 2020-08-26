package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the system dependent implementation of the window.
  * @see com.sun.star.lang.SystemDependent
  * @see WindowAttribute
  * @see WindowAttribute.SYSTEMDEPENDENT
  */
@js.native
trait XSystemDependentWindowPeer extends XInterface {
  /**
    * returns a system-specific window handle.
    * @param ProcessId the process identifier. Use the sal_getGlobalProcessId function of the RTL library.
    * @param SystemType one constant out of the constant group {@link com.sun.star.lang.SystemDependent} .
    * @returns a system-specific handle to a window or 0 if the window is not in the same process.  You must check the machine ID and the process ID. ;  WIN32:
    */
  def getWindowHandle(ProcessId: SeqEquiv[Double], SystemType: Double): js.Any = js.native
}

object XSystemDependentWindowPeer {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getWindowHandle: (SeqEquiv[Double], Double) => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSystemDependentWindowPeer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getWindowHandle = js.Any.fromFunction2(getWindowHandle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSystemDependentWindowPeer]
  }
  @scala.inline
  implicit class XSystemDependentWindowPeerOps[Self <: XSystemDependentWindowPeer] (val x: Self) extends AnyVal {
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
    def setGetWindowHandle(value: (SeqEquiv[Double], Double) => js.Any): Self = this.set("getWindowHandle", js.Any.fromFunction2(value))
  }
  
}

