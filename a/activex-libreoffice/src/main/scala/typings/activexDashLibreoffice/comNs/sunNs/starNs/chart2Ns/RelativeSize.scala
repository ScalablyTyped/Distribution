package typings.activexDashLibreoffice.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gives a position relative to some size defined by other means. Values from 0 to 1 cover the entire reference rectangle. Values may also be greater
  * than one, meaning a bigger size than the reference size. Negative values are not allowed.
  */
trait RelativeSize extends js.Object {
  /**
    * The extension in the primary direction. The direction is defined by the object using this point.
    *
    * Typically, the direction is determined by an Orientation. Another typical use would be the direction of a given orientation-angle.
    *
    * The values are relative to the page or an object. Values between 0 and 1 span the complete bounding rectangle of the page/object.
    *
    * For a western Orientation this is the width.
    */
  var Primary: Double
  /**
    * The extension in the secondary direction. The direction is defined by the object using this point.
    *
    * Typically, the direction is determined by an Orientation. Another typical use would be the direction perpendicular to a given orientation-angle.
    *
    * The values are relative to the page or an object. Values between 0 and 1 span the complete bounding rectangle of the page/object.
    *
    * For a western Orientation this is the height.
    */
  var Secondary: Double
}

object RelativeSize {
  @scala.inline
  def apply(Primary: Double, Secondary: Double): RelativeSize = {
    val __obj = js.Dynamic.literal(Primary = Primary, Secondary = Secondary)
  
    __obj.asInstanceOf[RelativeSize]
  }
}

