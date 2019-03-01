package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
  var mmax: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum possible `m` value of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#mmin)
    *
    * @default undefined
    */
  var mmin: js.UndefOr[scala.Double] = js.undefined
  /**
    * The bottom-right X-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#xmax)
    *
    * @default 0
    */
  var xmax: js.UndefOr[scala.Double] = js.undefined
  /**
    * The top-left X-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#xmin)
    *
    * @default 0
    */
  var xmin: js.UndefOr[scala.Double] = js.undefined
  /**
    * The top-right Y-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#ymax)
    *
    * @default 0
    */
  var ymax: js.UndefOr[scala.Double] = js.undefined
  /**
    * The bottom-left Y-coordinate of an extent envelope.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#ymin)
    *
    * @default 0
    */
  var ymin: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum possible `z`, or elevation, value in an extent envelope.
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#zmax)
    *
    * @default undefined
    */
  var zmax: js.UndefOr[scala.Double] = js.undefined
  /**
    * The minimum possible `z`, or elevation, value of an extent envelope.
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#zmin)
    *
    * @default undefined
    */
  var zmin: js.UndefOr[scala.Double] = js.undefined
}

object ExtentProperties {
  @scala.inline
  def apply(
    hasM: js.UndefOr[scala.Boolean] = js.undefined,
    hasZ: js.UndefOr[scala.Boolean] = js.undefined,
    mmax: scala.Int | scala.Double = null,
    mmin: scala.Int | scala.Double = null,
    spatialReference: SpatialReferenceProperties = null,
    xmax: scala.Int | scala.Double = null,
    xmin: scala.Int | scala.Double = null,
    ymax: scala.Int | scala.Double = null,
    ymin: scala.Int | scala.Double = null,
    zmax: scala.Int | scala.Double = null,
    zmin: scala.Int | scala.Double = null
  ): ExtentProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasM)) __obj.updateDynamic("hasM")(hasM)
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ)
    if (mmax != null) __obj.updateDynamic("mmax")(mmax.asInstanceOf[js.Any])
    if (mmin != null) __obj.updateDynamic("mmin")(mmin.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    if (xmax != null) __obj.updateDynamic("xmax")(xmax.asInstanceOf[js.Any])
    if (xmin != null) __obj.updateDynamic("xmin")(xmin.asInstanceOf[js.Any])
    if (ymax != null) __obj.updateDynamic("ymax")(ymax.asInstanceOf[js.Any])
    if (ymin != null) __obj.updateDynamic("ymin")(ymin.asInstanceOf[js.Any])
    if (zmax != null) __obj.updateDynamic("zmax")(zmax.asInstanceOf[js.Any])
    if (zmin != null) __obj.updateDynamic("zmin")(zmin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtentProperties]
  }
}

