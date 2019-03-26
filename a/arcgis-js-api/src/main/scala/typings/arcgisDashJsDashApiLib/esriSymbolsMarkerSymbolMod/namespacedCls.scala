package typings
package arcgisDashJsDashApiLib.esriSymbolsMarkerSymbolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols/MarkerSymbol", JSImport.Namespace)
@js.native
/**
  * Marker symbols are used to draw [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) graphics in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) or individual [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). To create new marker symbols, use either [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html) or [PictureMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html)
  */
class namespacedCls ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.MarkerSymbol {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.MarkerSymbolProperties) = this()
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

