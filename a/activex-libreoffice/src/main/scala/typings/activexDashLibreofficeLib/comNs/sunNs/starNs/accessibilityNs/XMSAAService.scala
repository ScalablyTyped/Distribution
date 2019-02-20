package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The interface must be implemented for a server that can support MSAA com objects and send win32 accessible events */
trait XMSAAService
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /**
    * Return com object pointer.
    * @returns A reference to the object that contains the actual accessibility information.
    * @see AccessibleContext
    */
  def getAccObjectPtr(hWnd: scala.Double, lParam: scala.Double, wParam: scala.Double): scala.Double
  def handleWindowOpened(i: scala.Double): scala.Unit
}

