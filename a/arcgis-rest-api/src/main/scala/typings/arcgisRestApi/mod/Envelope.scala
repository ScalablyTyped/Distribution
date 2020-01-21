package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Envelope extends Geometry {
  var mmax: js.UndefOr[Double] = js.undefined
  var mmin: js.UndefOr[Double] = js.undefined
  var xmax: Double
  var xmin: Double
  var ymax: Double
  var ymin: Double
  var zmax: js.UndefOr[Double] = js.undefined
  var zmin: js.UndefOr[Double] = js.undefined
}

object Envelope {
  @scala.inline
  def apply(
    xmax: Double,
    xmin: Double,
    ymax: Double,
    ymin: Double,
    mmax: Int | Double = null,
    mmin: Int | Double = null,
    spatialReference: SpatialReference = null,
    zmax: Int | Double = null,
    zmin: Int | Double = null
  ): Envelope = {
    val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], ymax = ymax.asInstanceOf[js.Any], ymin = ymin.asInstanceOf[js.Any])
    if (mmax != null) __obj.updateDynamic("mmax")(mmax.asInstanceOf[js.Any])
    if (mmin != null) __obj.updateDynamic("mmin")(mmin.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference.asInstanceOf[js.Any])
    if (zmax != null) __obj.updateDynamic("zmax")(zmax.asInstanceOf[js.Any])
    if (zmin != null) __obj.updateDynamic("zmin")(zmin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Envelope]
  }
}

