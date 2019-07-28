package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconSymbol3DLayerResource extends Object {
  /**
    * The URL or data URI for the image. If the external resource is an SVG then the SVG root node must have a set width and height, otherwise it will not render at the correct size. SVG is not supported in IE11.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#resource)
    */
  var href: js.UndefOr[String] = js.undefined
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
  var primitive: js.UndefOr[String] = js.undefined
}

object IconSymbol3DLayerResource {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    href: String = null,
    primitive: String = null
  ): IconSymbol3DLayerResource = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (href != null) __obj.updateDynamic("href")(href)
    if (primitive != null) __obj.updateDynamic("primitive")(primitive)
    __obj.asInstanceOf[IconSymbol3DLayerResource]
  }
}

