package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconSymbol3DLayerResource extends Object {
  /**
    * The URL or data URI for the image. If the external resource is an SVG then the SVG root node must have a set width and height, otherwise it will not render at the correct size. SVG is not supported in IE11.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#resource)
    */
  var href: js.UndefOr[String] = js.native
  /**
    * Uses a built-in shape. See the table below for list of possible values.
    *
    * Value | Description
    * ------|------------
    * circle | ![s3d-icon-circle](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-icon-circle.png)
    * square |  ![s3d-icon-square](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-icon-square.png)
    * cross | ![s3d-icon-cross](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-icon-cross.png)
    * x | ![s3d-icon-x](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-icon-x.png)
    * kite | ![s3d-icon-kite](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-icon-kite.png)
    * triangle | ![s3d-icon-triangle](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols3d-icon-triangle.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#resource)
    */
  var primitive: js.UndefOr[String] = js.native
}

object IconSymbol3DLayerResource {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): IconSymbol3DLayerResource = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[IconSymbol3DLayerResource]
  }
  @scala.inline
  implicit class IconSymbol3DLayerResourceOps[Self <: IconSymbol3DLayerResource] (val x: Self) extends AnyVal {
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
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setPrimitive(value: String): Self = this.set("primitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimitive: Self = this.set("primitive", js.undefined)
  }
  
}

