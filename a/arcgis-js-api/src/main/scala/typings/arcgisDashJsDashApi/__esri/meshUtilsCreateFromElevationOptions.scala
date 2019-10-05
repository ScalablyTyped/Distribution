package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait meshUtilsCreateFromElevationOptions extends Object {
  /**
    * Controls the horizontal resolution (cell size) in meters from which elevation data is sampled (defaults to `auto`). See [ElevationLayer.queryElevation](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ElevationLayer.html#queryElevation) for more details on the different settings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#createFromElevation)
    *
    * @default auto
    */
  var demResolution: js.UndefOr[Double | String] = js.undefined
  /**
    * The material.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#createFromElevation)
    */
  var material: js.UndefOr[meshUtilsCreateFromElevationOptionsMaterial] = js.undefined
}

object meshUtilsCreateFromElevationOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    demResolution: Double | String = null,
    material: meshUtilsCreateFromElevationOptionsMaterial = null
  ): meshUtilsCreateFromElevationOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (demResolution != null) __obj.updateDynamic("demResolution")(demResolution.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material)
    __obj.asInstanceOf[meshUtilsCreateFromElevationOptions]
  }
}

