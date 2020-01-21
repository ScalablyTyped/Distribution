package typings.arcgisJsApi.esri

import typings.std.ArrayLike
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorAndIntensity extends Object {
  /**
    * RGB color with values between 0 and 1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ColorAndIntensity)
    */
  var color: ArrayLike[Double]
  /**
    * Scalar intensity value by which the color should be scaled for compositing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ColorAndIntensity)
    */
  var intensity: Double
}

object ColorAndIntensity {
  @scala.inline
  def apply(
    color: ArrayLike[Double],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    intensity: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ColorAndIntensity = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), intensity = intensity.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[ColorAndIntensity]
  }
}

