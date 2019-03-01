package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconSymbol3DLayerProperties extends Symbol3DLayerProperties {
  /**
    * The positioning of the icon relative to the geometry.  **Possible values:** center | left | right | top | bottom | top-left | top-right | bottom-left | bottom-right
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchor)
    *
    * @default center
    */
  var anchor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The outline of the icon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#outline)
    */
  var outline: js.UndefOr[IconSymbol3DLayerOutlineProperties] = js.undefined
  /**
    * The shape (`primitive`) or image URL (`href`) used to visualize the features. If both properties are present, `href` takes precedence and `primitive` is ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#resource)
    *
    * @default { primitive: "circle" }
    */
  var resource: js.UndefOr[IconSymbol3DLayerResource] = js.undefined
  /**
    * The size of the icon in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#size)
    *
    * @default 12
    */
  var size: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object IconSymbol3DLayerProperties {
  @scala.inline
  def apply(
    anchor: java.lang.String = null,
    material: js.Any = null,
    outline: IconSymbol3DLayerOutlineProperties = null,
    resource: IconSymbol3DLayerResource = null,
    size: scala.Double | java.lang.String = null
  ): IconSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (material != null) __obj.updateDynamic("material")(material)
    if (outline != null) __obj.updateDynamic("outline")(outline)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconSymbol3DLayerProperties]
  }
}

