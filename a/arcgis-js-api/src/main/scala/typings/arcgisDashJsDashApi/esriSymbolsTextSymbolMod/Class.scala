package typings.arcgisDashJsDashApi.esriSymbolsTextSymbolMod

import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.TextSymbol
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.TextSymbolProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols/TextSymbol", JSImport.Namespace)
@js.native
/**
  * Text symbols are used to define the graphic for displaying labels on a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html), and [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html) in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). Text symbols can also be used to define the symbol property of [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) if the geometry type is [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) or [Multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html). With this class, you may alter the [color](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#color), [font](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#font), [halo](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html#haloSize), and other properties of the label graphic.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html)
  */
class Class () extends TextSymbol {
  def this(properties: TextSymbolProperties) = this()
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

