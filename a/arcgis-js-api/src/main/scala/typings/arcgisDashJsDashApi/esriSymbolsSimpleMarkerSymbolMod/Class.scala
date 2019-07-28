package typings.arcgisDashJsDashApi.esriSymbolsSimpleMarkerSymbolMod

import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.SimpleMarkerSymbol
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.SimpleMarkerSymbolProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols/SimpleMarkerSymbol", JSImport.Namespace)
@js.native
/**
  * SimpleMarkerSymbol is used for rendering 2D [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries with a simple shape and [color](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#color) in either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). It may be filled with a solid [color](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#color) and have an optional [outline](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#outline), which is defined with a [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html)
  */
class Class () extends SimpleMarkerSymbol {
  def this(properties: SimpleMarkerSymbolProperties) = this()
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

