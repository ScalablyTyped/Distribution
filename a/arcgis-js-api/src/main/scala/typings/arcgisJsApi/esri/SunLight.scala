package typings.arcgisJsApi.esri

import typings.std.ArrayLike
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SunLight extends Object {
  /**
    * The ambient light color and intensity.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#SunLight)
    */
  var ambient: ColorAndIntensity
  /**
    * The diffuse light color and intensity.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#SunLight)
    */
  var diffuse: ColorAndIntensity
  /**
    * The incident light direction in render coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#SunLight)
    */
  var direction: ArrayLike[Double]
}

object SunLight {
  @scala.inline
  def apply(
    ambient: ColorAndIntensity,
    constructor: js.Function,
    diffuse: ColorAndIntensity,
    direction: ArrayLike[Double],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SunLight = {
    val __obj = js.Dynamic.literal(ambient = ambient.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], diffuse = diffuse.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[SunLight]
  }
}

