package typings
package arcgisDashRestDashApiLib.arcgisDashRestDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Envelope extends Geometry {
  var mmax: js.UndefOr[scala.Double] = js.undefined
  var mmin: js.UndefOr[scala.Double] = js.undefined
  var xmax: scala.Double
  var xmin: scala.Double
  var ymax: scala.Double
  var ymin: scala.Double
  var zmax: js.UndefOr[scala.Double] = js.undefined
  var zmin: js.UndefOr[scala.Double] = js.undefined
}

object Envelope {
  @scala.inline
  def apply(
    xmax: scala.Double,
    xmin: scala.Double,
    ymax: scala.Double,
    ymin: scala.Double,
    mmax: scala.Int | scala.Double = null,
    mmin: scala.Int | scala.Double = null,
    spatialReference: SpatialReference = null,
    zmax: scala.Int | scala.Double = null,
    zmin: scala.Int | scala.Double = null
  ): Envelope = {
    val __obj = js.Dynamic.literal(xmax = xmax, xmin = xmin, ymax = ymax, ymin = ymin)
    if (mmax != null) __obj.updateDynamic("mmax")(mmax.asInstanceOf[js.Any])
    if (mmin != null) __obj.updateDynamic("mmin")(mmin.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    if (zmax != null) __obj.updateDynamic("zmax")(zmax.asInstanceOf[js.Any])
    if (zmin != null) __obj.updateDynamic("zmin")(zmin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Envelope]
  }
}

