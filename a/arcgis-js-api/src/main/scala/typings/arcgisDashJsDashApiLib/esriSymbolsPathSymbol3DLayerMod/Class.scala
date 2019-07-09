package typings
package arcgisDashJsDashApiLib.esriSymbolsPathSymbol3DLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols/PathSymbol3DLayer", JSImport.Namespace)
@js.native
/**
  * PathSymbol3DLayer renders [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometries by extruding a 2D profile along the line. A PathSymbol3DLayer must be added to the `symbolLayers` property of a [LineSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html). This is a 3D symbol, therefore it is only supported in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html)
  */
class Class ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.PathSymbol3DLayer {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.PathSymbol3DLayerProperties) = this()
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

