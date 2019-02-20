package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes the cropping of graphic objects. Cropping means to show only parts of the object.
  *
  * Negative values cut the visible area; positive values extend the visible area by filling it with background color. The absolute sum of top and bottom
  * crop must be smaller than the objects original height. The absolute sum of the left and right crop must be smaller than the object's original width.
  *
  * If this property is applied to a graphic object, then this object will correct these values if necessary.
  */
trait GraphicCrop extends js.Object {
  /** contains the bottom value to cut (if negative) or to extend (if positive) */
  var Bottom: scala.Double
  /** contains the left value to cut (if negative) or to extend (if positive) */
  var Left: scala.Double
  /** contains the right value to cut (if negative) or to extend (if positive) */
  var Right: scala.Double
  /** contains the top value to cut (if negative) or to extend (if positive) */
  var Top: scala.Double
}

