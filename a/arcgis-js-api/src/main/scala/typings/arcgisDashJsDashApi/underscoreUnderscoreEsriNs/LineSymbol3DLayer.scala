package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.bevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.butt
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.line
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.miter
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.round
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineSymbol3DLayer
  extends Symbol3DLayer
     with typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.symbolsNs.Symbol3DLayer
     with symbolsSymbol3DLayer {
  /**
    * The style used to draw the endpoint of a line. See the table below for possible values.
    *
    * Possible Value | Example
    * ---------------|---------
    * butt | ![sls-cap-butt](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-cap-butt.png)
    * round | ![sls-cap-round](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-cap-round.png)
    * square | ![sls-cap-square](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-cap-square.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#cap)
    *
    * @default butt
    */
  var cap: butt | round | square = js.native
  /**
    * The style used to draw the intersection of two line segments within a line geometry. See the table below for possible values.
    *
    * Possible Value | Example
    * ---------------|---------
    * bevel | ![sls-join-bevel](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-join-bevel.png)
    * miter | ![sls-join-miter](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-join-miter.png)
    * round | ![sls-join-round](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/sls-join-round.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#join)
    *
    * @default miter
    */
  var join: miter | round | bevel = js.native
  /**
    * The material used to shade the line. This property defines the line's color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#material)
    */
  var material: LineSymbol3DLayerMaterial = js.native
  /**
    * The width of the line in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#size)
    *
    * @default "1px"
    */
  var size: Double = js.native
  /**
    * For LineSymbol3DLayer the type is always `line`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#type)
    */
  @JSName("type")
  val type_LineSymbol3DLayer: line = js.native
}

@JSGlobal("__esri.LineSymbol3DLayer")
@js.native
/**
  * LineSymbol3DLayer renders [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometries using a flat 2D line with a [LineSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html) in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) does not support 3D symbols.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html)
  */
class LineSymbol3DLayerCls () extends LineSymbol3DLayer {
  def this(properties: LineSymbol3DLayerProperties) = this()
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

