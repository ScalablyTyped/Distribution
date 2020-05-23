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
    mmax: js.UndefOr[Double] = js.undefined,
    mmin: js.UndefOr[Double] = js.undefined,
    spatialReference: SpatialReference = null,
    zmax: js.UndefOr[Double] = js.undefined,
    zmin: js.UndefOr[Double] = js.undefined
  ): Envelope = {
    val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], ymax = ymax.asInstanceOf[js.Any], ymin = ymin.asInstanceOf[js.Any])
    if (!js.isUndefined(mmax)) __obj.updateDynamic("mmax")(mmax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mmin)) __obj.updateDynamic("mmin")(mmin.get.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference.asInstanceOf[js.Any])
    if (!js.isUndefined(zmax)) __obj.updateDynamic("zmax")(zmax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zmin)) __obj.updateDynamic("zmin")(zmin.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Envelope]
  }
}

