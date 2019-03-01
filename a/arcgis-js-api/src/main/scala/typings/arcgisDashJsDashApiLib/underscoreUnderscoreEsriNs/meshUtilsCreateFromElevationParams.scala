package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait meshUtilsCreateFromElevationParams
  extends stdLib.Object {
  /**
    * Controls the horizontal resolution (cell size) in meters from which elevation data is sampled (defaults to `auto`). See [ElevationLayer.queryElevation](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#queryElevation) for more details on the different settings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#createFromElevation)
    *
    * @default auto
    */
  var demResolution: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * The material.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#createFromElevation)
    */
  var material: js.UndefOr[meshUtilsCreateFromElevationParamsMaterial] = js.undefined
}

object meshUtilsCreateFromElevationParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    demResolution: scala.Double | java.lang.String = null,
    material: meshUtilsCreateFromElevationParamsMaterial = null
  ): meshUtilsCreateFromElevationParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (demResolution != null) __obj.updateDynamic("demResolution")(demResolution.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material)
    __obj.asInstanceOf[meshUtilsCreateFromElevationParams]
  }
}

