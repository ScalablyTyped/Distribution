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

