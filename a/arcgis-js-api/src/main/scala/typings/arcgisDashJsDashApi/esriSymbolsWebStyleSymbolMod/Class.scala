package typings.arcgisDashJsDashApi.esriSymbolsWebStyleSymbolMod

import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.WebStyleSymbol
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.WebStyleSymbolProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols/WebStyleSymbol", JSImport.Namespace)
@js.native
/**
  * WebStyleSymbol is a class used to conveniently create vector 2D symbols and realistic and thematic 3D symbols. It is a wrapper for creating [CIMSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html) and [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html) objects that point to a web style resource available in the API.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html)
  */
class Class () extends WebStyleSymbol {
  def this(properties: WebStyleSymbolProperties) = this()
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

