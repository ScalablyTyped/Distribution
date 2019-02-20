package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoadmapItem extends js.Object {
  /** determines whether a control is enabled or disabled. */
  var Enabled: scala.Boolean
  /**
    * The ID uniquely identifies the roadmap item. When the {@link RoadmapItem} is inserted into the Roadmap via "insertByIndex" the default value of the ID
    * is the first available absolute digit that has not yet been assigned to other existing RoadmapItems.
    */
  var ID: scala.Double
  /**
    * When "Interactive" is true the {@link RoadmapItem} supports a certain "HyperLabel; functionality": Moving the mouse pointer over the {@link
    * RoadmapItem} will change it to a Refhand and underline the Label for the time the mouse pointer resides over the {@link RoadmapItem} . Clicking with
    * mouse pointer will then notify the Roadmap Container. The property Interactive" is readonly because it is adapted from the container of the {@link
    * RoadmapItem} .
    */
  var Interactive: scala.Boolean
  /** The Label of the {@link RoadmapItem} does not include its Prefix that is automatically set after the following algorithm: (Index + 1) + ". " + Label */
  var Label: java.lang.String
}

