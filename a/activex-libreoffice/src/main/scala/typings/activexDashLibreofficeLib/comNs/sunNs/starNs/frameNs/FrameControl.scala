package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains a frame with a desktop component
  *
  * If the control is visible and has a valid (loadable) component URL, then the {@link FrameControl.Frame} property is set. Normally this control can be
  * used for preview functionality inside any UI.
  */
trait FrameControl
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.UnoControl {
  /** contains the type of the component which is loaded into the frame, or the document which implicitly specifies the type */
  var ComponentUrl: java.lang.String
  /**
    * the frame held by this control
    *
    * The {@link Frame} is created if the control is shown and the {@link ComponentUrl} is set.
    */
  var Frame: java.lang.String
}

