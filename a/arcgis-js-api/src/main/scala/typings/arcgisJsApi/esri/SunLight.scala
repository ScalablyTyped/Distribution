package typings.arcgisJsApi.esri

import typings.std.ArrayLike
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SunLight extends Object {
  /**
    * The ambient light color and intensity.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#SunLight)
    */
  var ambient: ColorAndIntensity = js.native
  /**
    * The diffuse light color and intensity.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#SunLight)
    */
  var diffuse: ColorAndIntensity = js.native
  /**
    * The incident light direction in render coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#SunLight)
    */
  var direction: ArrayLike[Double] = js.native
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
  @scala.inline
  implicit class SunLightOps[Self <: SunLight] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmbient(value: ColorAndIntensity): Self = this.set("ambient", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiffuse(value: ColorAndIntensity): Self = this.set("diffuse", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: ArrayLike[Double]): Self = this.set("direction", value.asInstanceOf[js.Any])
  }
  
}

