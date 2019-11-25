package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`bottom-left`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`bottom-right`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`top-left`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`top-right`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.bottom
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.center
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.left
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.relative
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.right
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconSymbol3DLayerProperties extends Symbol3DLayerProperties {
  /**
    * The positioning of the icon relative to the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchor)
    *
    * @default center
    */
  var anchor: js.UndefOr[
    center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right` | relative
  ] = js.undefined
  /**
    * Defines the [anchor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchor) relative to the center of the icon. It is specified as a ratio of the icon's dimensions. For example, a value of `{ x: 0, y: 0 }` designates the center of the icon, while a value of `{ x: -0.5, y: -0.5 }` causes the top-left corner of the icon to coincide with the feature geometry.  This property only applies when [anchor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchor) is set to `relative`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchorPosition)
    */
  var anchorPosition: js.UndefOr[IconSymbol3DLayerAnchorPosition] = js.undefined
  /**
    * The material used to shade the icon. This property defines the icon's color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[IconSymbol3DLayerMaterialProperties] = js.undefined
  /**
    * The outline of the icon. The color property of this object directly modifies the overall color of IconSymbol3DLayer defined with the `cross` or `x` primitive.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#outline)
    */
  var outline: js.UndefOr[IconSymbol3DLayerOutlineProperties] = js.undefined
  /**
    * The shape (`primitive`) or image URL (`href`) used to visualize the features. If both properties are present, `href` takes precedence and `primitive` is ignored.
    * > **Known Limitations**  Using this property to render an SVG path is not supported in IE11.
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
  var size: js.UndefOr[Double | String] = js.undefined
}

object IconSymbol3DLayerProperties {
  @scala.inline
  def apply(
    anchor: center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right` | relative = null,
    anchorPosition: IconSymbol3DLayerAnchorPosition = null,
    material: IconSymbol3DLayerMaterialProperties = null,
    outline: IconSymbol3DLayerOutlineProperties = null,
    resource: IconSymbol3DLayerResource = null,
    size: Double | String = null
  ): IconSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (anchorPosition != null) __obj.updateDynamic("anchorPosition")(anchorPosition.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material.asInstanceOf[js.Any])
    if (outline != null) __obj.updateDynamic("outline")(outline.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconSymbol3DLayerProperties]
  }
}

