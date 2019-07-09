package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectSymbol3DLayerProperties extends Symbol3DLayerProperties {
  /**
    * The positioning of the symbol relative to the geometry. The default behavior (`origin`) depends on the resource:
    *   * For `sphere`, `cube` and `diamond` primitives, the origin is at the center.
    *   * For `cylinder`, `cone`, `inverted-cone` and `tetrahedron` primitives, the origin is at the bottom.
    *   * For `href` resources, the origin coincides with the origin of the 3D model.
    *
    *
    * If `anchor` is set to `relative`, the anchor is defined by [`anchorPosition`](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchorPosition) as a fraction of the symbol's bounding box.  **Possible Values:** center | top | bottom | origin | relative
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchor)
    *
    * @default origin
    */
  var anchor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines the [anchor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchor) relative to the center of the [symbol layer resource](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#resource). It is specified as a ratio of the resource's bounding box dimensions. For example, a value of `{ x: 0, y: 0, z: 0 }` designates the center, while a value of `{ x: -0.5, y: -0.5, z: -0.5 }` places the symbol at the lower south-west corner of the symbol's bounding box.  This property only applies when [anchor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchor) is set to `relative`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchorPosition)
    */
  var anchorPosition: js.UndefOr[ObjectSymbol3DLayerAnchorPosition] = js.undefined
  /**
    * Indicates whether the symbol layer geometry casts shadows in the scene. Setting this property to `false` will disable shadows for the symbol layer even if direct shadows are enabled in [SceneView.environment](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#castShadows)
    *
    * @default true
    */
  var castShadows: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The depth, or diameter from north to south, of the object in meters. If `undefined`, the depth will be calculated to maintain the original proportions of the object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#depth)
    *
    * @default 10
    */
  var depth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The clockwise rotation of the symbol in the horizontal plane (i.e., around the z axis). The rotation is specified in degrees and is relative to the y-axis.  If the symbol resource is aligned such that its forward facing side points in the direction of the y-axis (the y-axis always points North in WGS84 or WebMercator coordinates), its upwards facing side is pointing in the direction of the z-axis, and its right-hand side points in the direction of the x-axis (the x-axis always points East in WGS84 or WebMercator coordinates), then this angle corresponds to the heading of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#heading)
    */
  var heading: js.UndefOr[scala.Double] = js.undefined
  /**
    * The height of the object in meters. If `undefined`, the height will be calculated to maintain the original proportions of the object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#height)
    *
    * @default 10
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * The material used to shade the object. This property defines the object's color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[ObjectSymbol3DLayerMaterialProperties] = js.undefined
  /**
    * The primitive shape (`primitive`) or external 3D model (`href`) used to visualize the points. If both properties are present, `primitive` takes precedence and `href` is ignored. When using the `href` property, external 3D models must be present in glTF format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#resource)
    *
    * @default { primitive: "sphere" }
    */
  var resource: js.UndefOr[ObjectSymbol3DLayerResource] = js.undefined
  /**
    * The rotation of the symbol in the lateral vertical plane (i.e., around the y axis). The rotation is specified in degrees and is relative to the x-axis. At 0 degrees, the model is level. A positive value lifts the left part and lowers the right part of the model.  If the symbol resource is aligned such that its forward facing side points in the direction of the y-axis (the y-axis always points North in WGS84 or WebMercator coordinates), its upwards facing side is pointing in the direction of the z-axis, and its right-hand side points in the direction of the x-axis (the x-axis always points East in WGS84 or WebMercator coordinates), then this angle corresponds to the roll of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#roll)
    */
  var roll: js.UndefOr[scala.Double] = js.undefined
  /**
    * The rotation of the symbol in the longitudinal vertical plane (i.e., around the x axis). The rotation is specified in degrees and is relative to the y-axis. At 0 degrees, the model is level. A positive value points lifts the front and lowers the back of the model.  If the symbol resource is aligned such that its forward facing side points in the direction of the y-axis (the y-axis always points North in WGS84 or WebMercator coordinates), its upwards facing side is pointing in the direction of the z-axis, and its right-hand side points in the direction of the x-axis (the x-axis always points East in WGS84 or WebMercator coordinates), then this angle corresponds to the tilt of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#tilt)
    */
  var tilt: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width, or diameter from east to west, of the object in meters. If `undefined`, the width will be calculated to maintain the original proportions of the object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#width)
    *
    * @default 10
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ObjectSymbol3DLayerProperties {
  @scala.inline
  def apply(
    anchor: java.lang.String = null,
    anchorPosition: ObjectSymbol3DLayerAnchorPosition = null,
    castShadows: js.UndefOr[scala.Boolean] = js.undefined,
    depth: scala.Int | scala.Double = null,
    heading: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    material: ObjectSymbol3DLayerMaterialProperties = null,
    resource: ObjectSymbol3DLayerResource = null,
    roll: scala.Int | scala.Double = null,
    tilt: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): ObjectSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (anchorPosition != null) __obj.updateDynamic("anchorPosition")(anchorPosition)
    if (!js.isUndefined(castShadows)) __obj.updateDynamic("castShadows")(castShadows)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (material != null) __obj.updateDynamic("material")(material)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (roll != null) __obj.updateDynamic("roll")(roll.asInstanceOf[js.Any])
    if (tilt != null) __obj.updateDynamic("tilt")(tilt.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectSymbol3DLayerProperties]
  }
}

