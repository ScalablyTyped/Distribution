package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a Roadmap control. The model of the Roadmap control must be a {@link UnoControlRoadmapModel}
  *
  * The model properties are implemented in the control as follows: CurrentItem: The RGB code of the background color is RGB(194, 211, 238)ImageURL: The
  * image referenced by the URL is placed in the lower right corner of the control.Graphic: The graphic is placed in the lower right corner of the
  * control.Complete: When set to `FALSE` a non interactive {@link RoadmapItem} is appended after the last roadmap item, labeled with three dots,
  * indicating incompleteness.Interactive: When activating a {@link RoadmapItem} (see {@link RoadmapItem} ) the information about which Item has been
  * selected is passed over when an itemlistener has been registered at the control.
  */
trait UnoControlRoadmap
  extends UnoControl
     with XItemEventBroadcaster

