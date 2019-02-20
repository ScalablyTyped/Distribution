package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface provides an easy access to a stream images using their position in the time. */
trait XFrameGrabber extends js.Object {
  /**
    * returns the image of the underlying stream at a given position
    * @param fMediaTime the time in seconds of the image to get. This time has to be a positive value inferior to the stream duration.
    */
  def grabFrame(fMediaTime: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.graphicNs.XGraphic
}

