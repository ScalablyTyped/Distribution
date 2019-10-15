package typings.arcgisDashJsDashApi.esriSymbolsCIMSymbolMod

import typings.arcgisDashJsDashApi.__esri.CIMSymbol
import typings.arcgisDashJsDashApi.__esri.CIMSymbolProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols/CIMSymbol", JSImport.Namespace)
@js.native
/**
  * CIM symbols are used to display multi-layer vector symbols for features and graphics in MapView. CIM symbols can be created from CIMSymbolReference JSON that complies with the [CIM specification](https://github.com/Esri/cim-spec/blob/master/docs/v2/Types.md#symbol) by passing the JSON to the [data](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#data) property or from [WebStyleSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html)s
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html)
  */
class Class () extends CIMSymbol {
  def this(properties: CIMSymbolProperties) = this()
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

