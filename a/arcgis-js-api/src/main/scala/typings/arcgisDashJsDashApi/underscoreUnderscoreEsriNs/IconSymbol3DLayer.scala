package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.icon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconSymbol3DLayer
  extends Symbol3DLayer
     with typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.symbolsNs.Symbol3DLayer
     with symbolsSymbol3DLayer {
  /**
    * The positioning of the icon relative to the geometry.  **Possible values:** center | left | right | top | bottom | top-left | top-right | bottom-left | bottom-right
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchor)
    *
    * @default center
    */
  var anchor: String = js.native
  /**
    * Defines the [anchor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchor) relative to the center of the icon. It is specified as a ratio of the icon's dimensions. For example, a value of `{ x: 0, y: 0 }` designates the center of the icon, while a value of `{ x: -0.5, y: -0.5 }` causes the top-left corner of the icon to coincide with the feature geometry.  This property only applies when [anchor](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchor) is set to `relative`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#anchorPosition)
    */
  var anchorPosition: IconSymbol3DLayerAnchorPosition = js.native
  /**
    * The material used to shade the icon. This property defines the icon's color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#material)
    */
  var material: IconSymbol3DLayerMaterial = js.native
  /**
    * The outline of the icon. The color property of this object directly modifies the overall color of IconSymbol3DLayer defined with the `cross` or `x` primitive.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#outline)
    */
  var outline: IconSymbol3DLayerOutline = js.native
  /**
    * The shape (`primitive`) or image URL (`href`) used to visualize the features. If both properties are present, `href` takes precedence and `primitive` is ignored.
    * > **Known Limitations**  Using this property to render an SVG path is not supported in IE11.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#resource)
    *
    * @default { primitive: "circle" }
    */
  var resource: IconSymbol3DLayerResource = js.native
  /**
    * The size of the icon in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#size)
    *
    * @default 12
    */
  var size: Double = js.native
  /**
    * For IconSymbol3DLayer the type is always `icon`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html#type)
    */
  @JSName("type")
  val type_IconSymbol3DLayer: icon = js.native
}

@JSGlobal("__esri.IconSymbol3DLayer")
@js.native
/**
  * IconSymbol3DLayer is used to render [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries using a flat 2D icon (e.g. a circle) with a [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html) in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) does not support 3D symbols. [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) features may also be rendered with IconSymbol3DLayers, but the icon symbol layer must be contained within a [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html), not a [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html) in that scenario.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html)
  */
class IconSymbol3DLayerCls () extends IconSymbol3DLayer {
  def this(properties: IconSymbol3DLayerProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

