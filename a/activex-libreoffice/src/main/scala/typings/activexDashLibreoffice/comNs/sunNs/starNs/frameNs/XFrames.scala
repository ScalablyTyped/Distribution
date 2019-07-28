package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * manages and creates frames.
  *
  * Frames may contain other frames (by implementing an {@link XFrames} interface) and may be contained in other frames.
  * @see XFrame
  * @see Frame
  */
trait XFrames extends XIndexAccess {
  /**
    * appends the specified {@link Frame} to the list of sub-frames.
    * @param xFrame new frame for inserting into this container
    */
  def append(xFrame: XFrame): Unit
  /**
    * provides access to the list of all currently existing frames inside this container and her sub frames
    * @param nSearchFlags use combinations of {@link FrameSearchFlag} to specify which frames should be found
    * @returns all frames of this container and all available frames of the whole frame tree which match search parameter **SearchFlags**
    */
  def queryFrames(nSearchFlags: Double): SafeArray[XFrame]
  /**
    * removes the frame from its container.
    *
    * Note: The method XComponent::dispose() is not called implicitly by this method.The creator attribute of the frame must be reset by the caller of this
    * method.
    * @param xFrame frame which should be removed from this container
    */
  def remove(xFrame: XFrame): Unit
}

object XFrames {
  @scala.inline
  def apply(
    Count: Double,
    ElementType: `type`,
    acquire: () => Unit,
    append: XFrame => Unit,
    getByIndex: Double => js.Any,
    getCount: () => Double,
    getElementType: () => `type`,
    hasElements: () => Boolean,
    queryFrames: Double => SafeArray[XFrame],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remove: XFrame => Unit
  ): XFrames = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = js.Any.fromFunction0(acquire), append = js.Any.fromFunction1(append), getByIndex = js.Any.fromFunction1(getByIndex), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), hasElements = js.Any.fromFunction0(hasElements), queryFrames = js.Any.fromFunction1(queryFrames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[XFrames]
  }
}

