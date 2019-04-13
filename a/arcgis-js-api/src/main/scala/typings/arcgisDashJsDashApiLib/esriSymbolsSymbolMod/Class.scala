package typings
package arcgisDashJsDashApiLib.esriSymbolsSymbolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols/Symbol", JSImport.Namespace)
@js.native
/**
  * Symbol is the base class for all symbols. Symbols represent point, line, polygon, and mesh geometries as vector graphics within a [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html). Symbols can only be set directly on individual [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html#symbol) in a [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) or in [View.graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#graphics). Otherwise they are assigned to a [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) that is applied to a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) or a [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html)
  */
class Class ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Symbol {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.SymbolProperties) = this()
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

