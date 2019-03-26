package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FillSymbol3DLayer
  extends Symbol3DLayer
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.symbolsNs.Symbol3DLayer
     with symbolsSymbol3DLayer {
  /**
    * Sets the contour edges on 3D Objects. This is only applicable for [MeshSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MeshSymbol3D.html).  ![symbol3D-edges-solid](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbol3d-edges-solid-2.png)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#edges)
    */
  var edges: Edges3D = js.native
  /**
    * The outline used to draw a line around the filled geometry. This property is not supported in [MeshSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MeshSymbol3D.html) symbol layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#outline)
    */
  var outline: FillSymbol3DLayerOutline = js.native
  /**
    * For FillSymbol3DLayer the type is always `fill`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#type)
    */
  @JSName("type")
  val type_FillSymbol3DLayer: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.fill = js.native
}

@JSGlobal("__esri.FillSymbol3DLayer")
@js.native
/**
  * FillSymbol3DLayer is used to render the surfaces of flat 2D [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometries and 3D volumetric meshes in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) does not support 3D symbols.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html)
  */
class FillSymbol3DLayerCls () extends FillSymbol3DLayer {
  def this(properties: FillSymbol3DLayerProperties) = this()
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

