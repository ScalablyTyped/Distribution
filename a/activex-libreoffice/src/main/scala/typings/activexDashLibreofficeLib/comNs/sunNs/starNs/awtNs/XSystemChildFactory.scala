package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a factory interface for creating system child windows. */
trait XSystemChildFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a system child window.
    * @param Parent a system-specific handle to a window.  You must check the machine ID and the process ID. ;  WIN32: HWND. ;  WIN16: HWND. ;   JAVA: global
    * @param ProcessId Ignored.
    * @param SystemType one constant out of the constant group {@link com.sun.star.lang.SystemDependent} .
    * @returns the created window.
    */
  def createSystemChild(
    Parent: js.Any,
    ProcessId: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    SystemType: scala.Double
  ): XWindowPeer
}

object XSystemChildFactory {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    createSystemChild: (js.Any, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Double) => XWindowPeer,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XSystemChildFactory = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createSystemChild = js.Any.fromFunction3(createSystemChild), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSystemChildFactory]
  }
}

