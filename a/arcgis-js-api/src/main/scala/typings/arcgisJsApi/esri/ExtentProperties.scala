package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtentProperties extends GeometryProperties {
  /**
    * The maximum possible `m` value in an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#mmax)
    *
    * @default undefined
    */
  var mmax: js.UndefOr[Double] = js.undefined
  /**
    * The minimum possible `m` value of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#mmin)
    *
    * @default undefined
    */
  var mmin: js.UndefOr[Double] = js.undefined
  /**
    * The maximum X-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#xmax)
    *
    * @default 0
    */
  var xmax: js.UndefOr[Double] = js.undefined
  /**
    * The minimum X-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#xmin)
    *
    * @default 0
    */
  var xmin: js.UndefOr[Double] = js.undefined
  /**
    * The maximum Y-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#ymax)
    *
    * @default 0
    */
  var ymax: js.UndefOr[Double] = js.undefined
  /**
    * The minimum Y-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#ymin)
    *
    * @default 0
    */
  var ymin: js.UndefOr[Double] = js.undefined
  /**
    * The maximum possible `z`, or elevation, value in an extent envelope.
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#zmax)
    *
    * @default undefined
    */
  var zmax: js.UndefOr[Double] = js.undefined
  /**
    * The minimum possible `z`, or elevation, value of an extent envelope.
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#zmin)
    *
    * @default undefined
    */
  var zmin: js.UndefOr[Double] = js.undefined
}

object ExtentProperties {
  @scala.inline
  def apply(
    hasM: js.UndefOr[Boolean] = js.undefined,
    hasZ: js.UndefOr[Boolean] = js.undefined,
    mmax: js.UndefOr[Double] = js.undefined,
    mmin: js.UndefOr[Double] = js.undefined,
    spatialReference: SpatialReferenceProperties = null,
    xmax: js.UndefOr[Double] = js.undefined,
    xmin: js.UndefOr[Double] = js.undefined,
    ymax: js.UndefOr[Double] = js.undefined,
    ymin: js.UndefOr[Double] = js.undefined,
    zmax: js.UndefOr[Double] = js.undefined,
    zmin: js.UndefOr[Double] = js.undefined
  ): ExtentProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasM)) __obj.updateDynamic("hasM")(hasM.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mmax)) __obj.updateDynamic("mmax")(mmax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mmin)) __obj.updateDynamic("mmin")(mmin.get.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference.asInstanceOf[js.Any])
    if (!js.isUndefined(xmax)) __obj.updateDynamic("xmax")(xmax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(xmin)) __obj.updateDynamic("xmin")(xmin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ymax)) __obj.updateDynamic("ymax")(ymax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ymin)) __obj.updateDynamic("ymin")(ymin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zmax)) __obj.updateDynamic("zmax")(zmax.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zmin)) __obj.updateDynamic("zmin")(zmin.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtentProperties]
  }
}

