package typings.arcgisDashJsDashApi.esriSymbolsSimpleLineSymbolMod

import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.SimpleLineSymbol
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.SimpleLineSymbolProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols/SimpleLineSymbol", JSImport.Namespace)
@js.native
/**
  * SimpleLineSymbol is used for rendering 2D [polyline geometries](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). SimpleLineSymbol is also used for rendering outlines for [marker symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html) and [fill symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html)
  */
class Class () extends SimpleLineSymbol {
  def this(properties: SimpleLineSymbolProperties) = this()
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

