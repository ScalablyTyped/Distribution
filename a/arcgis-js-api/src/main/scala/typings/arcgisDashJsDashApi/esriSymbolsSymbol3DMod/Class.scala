package typings.arcgisDashJsDashApi.esriSymbolsSymbol3DMod

import typings.arcgisDashJsDashApi.__esri.Symbol3D
import typings.arcgisDashJsDashApi.__esri.Symbol3DProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols/Symbol3D", JSImport.Namespace)
@js.native
/**
  * Symbol3D is the base class for all 3D symbols. It is used to render 2D [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html), [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html), and [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) and 3D mesh features in a [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html). All 3D symbols must be used in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) instance; there is no support for 3D rendering in [MapViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html)
  */
class Class () extends Symbol3D {
  def this(properties: Symbol3DProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

