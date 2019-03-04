package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorAndIntensity
  extends stdLib.Object {
  /**
    * RGB color with values between 0 and 1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ColorAndIntensity)
    */
  var color: stdLib.ArrayLike[scala.Double]
  /**
    * Scalar intensity value by which the color should be scaled for compositing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ColorAndIntensity)
    */
  var intensity: scala.Double
}

object ColorAndIntensity {
  @scala.inline
  def apply(
    color: stdLib.ArrayLike[scala.Double],
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    intensity: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): ColorAndIntensity = {
    val __obj = js.Dynamic.literal(color = color, constructor = constructor, hasOwnProperty = hasOwnProperty, intensity = intensity, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[ColorAndIntensity]
  }
}

