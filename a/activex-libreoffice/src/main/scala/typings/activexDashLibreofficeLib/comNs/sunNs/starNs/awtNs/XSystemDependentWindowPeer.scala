package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the system dependent implementation of the window.
  * @see com.sun.star.lang.SystemDependent
  * @see WindowAttribute
  * @see WindowAttribute.SYSTEMDEPENDENT
  */
trait XSystemDependentWindowPeer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns a system-specific window handle.
    * @param ProcessId the process identifier. Use the sal_getGlobalProcessId function of the RTL library.
    * @param SystemType one constant out of the constant group {@link com.sun.star.lang.SystemDependent} .
    * @returns a system-specific handle to a window or 0 if the window is not in the same process.  You must check the machine ID and the process ID. ;  WIN32:
    */
  def getWindowHandle(
    ProcessId: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    SystemType: scala.Double
  ): js.Any
}

object XSystemDependentWindowPeer {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getWindowHandle: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Double) => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XSystemDependentWindowPeer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getWindowHandle = js.Any.fromFunction2(getWindowHandle), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSystemDependentWindowPeer]
  }
}

