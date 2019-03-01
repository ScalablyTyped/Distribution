package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SunLight
  extends stdLib.Object {
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
  var direction: stdLib.ArrayLike[scala.Double]
}

object SunLight {
  @scala.inline
  def apply(
    ambient: ColorAndIntensity,
    constructor: js.Function,
    diffuse: ColorAndIntensity,
    direction: stdLib.ArrayLike[scala.Double],
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): SunLight = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ambient")(ambient)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("diffuse")(diffuse)
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.asInstanceOf[SunLight]
  }
}

