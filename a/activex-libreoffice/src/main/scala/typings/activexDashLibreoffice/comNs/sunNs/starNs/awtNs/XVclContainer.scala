package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a VCL container window.
  * @deprecated Deprecated
  */
trait XVclContainer extends XInterface {
  /** returns all windows. */
  val Windows: SafeArray[XWindow]
  /** adds the specified container listener to receive container events from this container. */
  def addVclContainerListener(l: XVclContainerListener): Unit
  /** returns all windows. */
  def getWindows(): SafeArray[XWindow]
  /** removes the specified container listener so that it no longer receives container events from this container. */
  def removeVclContainerListener(l: XVclContainerListener): Unit
}

object XVclContainer {
  @scala.inline
  def apply(
    Windows: SafeArray[XWindow],
    acquire: () => Unit,
    addVclContainerListener: XVclContainerListener => Unit,
    getWindows: () => SafeArray[XWindow],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeVclContainerListener: XVclContainerListener => Unit
  ): XVclContainer = {
    val __obj = js.Dynamic.literal(Windows = Windows, acquire = js.Any.fromFunction0(acquire), addVclContainerListener = js.Any.fromFunction1(addVclContainerListener), getWindows = js.Any.fromFunction0(getWindows), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeVclContainerListener = js.Any.fromFunction1(removeVclContainerListener))
  
    __obj.asInstanceOf[XVclContainer]
  }
}

