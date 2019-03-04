package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

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
trait XFrames
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess {
  /**
    * appends the specified {@link Frame} to the list of sub-frames.
    * @param xFrame new frame for inserting into this container
    */
  def append(xFrame: XFrame): scala.Unit
  /**
    * provides access to the list of all currently existing frames inside this container and her sub frames
    * @param nSearchFlags use combinations of {@link FrameSearchFlag} to specify which frames should be found
    * @returns all frames of this container and all available frames of the whole frame tree which match search parameter **SearchFlags**
    */
  def queryFrames(nSearchFlags: scala.Double): activexDashInteropLib.SafeArray[XFrame]
  /**
    * removes the frame from its container.
    *
    * Note: The method XComponent::dispose() is not called implicitly by this method.The creator attribute of the frame must be reset by the caller of this
    * method.
    * @param xFrame frame which should be removed from this container
    */
  def remove(xFrame: XFrame): scala.Unit
}

object XFrames {
  @scala.inline
  def apply(
    Count: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    acquire: js.Function0[scala.Unit],
    append: js.Function1[XFrame, scala.Unit],
    getByIndex: js.Function1[scala.Double, js.Any],
    getCount: js.Function0[scala.Double],
    getElementType: js.Function0[activexDashLibreofficeLib.`type`],
    hasElements: js.Function0[scala.Boolean],
    queryFrames: js.Function1[scala.Double, activexDashInteropLib.SafeArray[XFrame]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    remove: js.Function1[XFrame, scala.Unit]
  ): XFrames = {
    val __obj = js.Dynamic.literal(Count = Count, ElementType = ElementType, acquire = acquire, append = append, getByIndex = getByIndex, getCount = getCount, getElementType = getElementType, hasElements = hasElements, queryFrames = queryFrames, queryInterface = queryInterface, release = release, remove = remove)
  
    __obj.asInstanceOf[XFrames]
  }
}

