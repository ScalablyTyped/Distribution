package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Determines a position of an object relative to a size defined by other means. Values from 0 to 1 cover the entire reference rectangle. Values may also
  * be outside this range, especially negative.
  */
trait RelativePosition extends js.Object {
  /**
    * This indicates how the object is placed at the relative position.
    *
    * The Anchor indicates which point of the placed object will be placed at the coordinates given within Primary and Secondary.
    *
    * For example if Anchor is TOP_LEFT the top left corner of an object will be placed at the given coordinates. If Anchor is RIGHT the right middle corner
    * of the object will be placed at the given coordinates.
    */
  var Anchor: activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.Alignment
  /**
    * The position in the primary direction. The direction is defined by the object using this point.
    *
    * For example for western languages the primary direction may be the horizontal distance measured from left to right.
    *
    * The values are relative to a reference size (for example the page size). Values between 0 and 1 span the complete bounding rectangle.
    */
  var Primary: scala.Double
  /**
    * The position in the secondary direction. The direction is defined by the object using this point.
    *
    * For example for western languages the secondary direction may be the vertical distance measured from top to bottom.
    *
    * The values are relative to a reference size (for example the page size). Values between 0 and 1 span the complete bounding rectangle.
    */
  var Secondary: scala.Double
}

