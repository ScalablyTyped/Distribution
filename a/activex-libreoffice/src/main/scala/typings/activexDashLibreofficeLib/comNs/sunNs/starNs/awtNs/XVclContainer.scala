package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a VCL container window.
  * @deprecated Deprecated
  */
trait XVclContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns all windows. */
  val Windows: stdLib.SafeArray[XWindow]
  /** adds the specified container listener to receive container events from this container. */
  def addVclContainerListener(l: XVclContainerListener): scala.Unit
  /** returns all windows. */
  def getWindows(): stdLib.SafeArray[XWindow]
  /** removes the specified container listener so that it no longer receives container events from this container. */
  def removeVclContainerListener(l: XVclContainerListener): scala.Unit
}

object XVclContainer {
  @scala.inline
  def apply(
    Windows: stdLib.SafeArray[XWindow],
    acquire: () => scala.Unit,
    addVclContainerListener: XVclContainerListener => scala.Unit,
    getWindows: () => stdLib.SafeArray[XWindow],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeVclContainerListener: XVclContainerListener => scala.Unit
  ): XVclContainer = {
    val __obj = js.Dynamic.literal(Windows = Windows, acquire = js.Any.fromFunction0(acquire), addVclContainerListener = js.Any.fromFunction1(addVclContainerListener), getWindows = js.Any.fromFunction0(getWindows), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeVclContainerListener = js.Any.fromFunction1(removeVclContainerListener))
  
    __obj.asInstanceOf[XVclContainer]
  }
}

