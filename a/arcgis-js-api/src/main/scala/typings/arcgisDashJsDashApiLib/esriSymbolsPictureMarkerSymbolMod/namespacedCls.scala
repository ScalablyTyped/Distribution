package typings
package arcgisDashJsDashApiLib.esriSymbolsPictureMarkerSymbolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols/PictureMarkerSymbol", JSImport.Namespace)
@js.native
/**
  * PictureMarkerSymbol renders [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) graphics in either a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) using an image. A [url](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url) must point to a valid image. PictureMarkerSymbols may be applied to point features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) or individual [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html). The image below depicts a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) whose point features are styled with a [PictureMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html)
  */
class namespacedCls ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.PictureMarkerSymbol {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.PictureMarkerSymbolProperties) = this()
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

