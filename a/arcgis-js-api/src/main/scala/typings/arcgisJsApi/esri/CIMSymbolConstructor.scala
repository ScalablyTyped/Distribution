package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CIMSymbolConstructor
  extends /**
  * CIM symbols are used to display multi-layer vector symbols for features and graphics in MapView. CIM symbols can be created from CIMSymbolReference JSON that complies with the [CIM specification](https://github.com/Esri/cim-spec/blob/master/docs/v2/Types.md#symbol) by passing the JSON to the [data](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#data) property or from [WebStyleSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html)s
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html)
  */
Instantiable0[CIMSymbol]
     with Instantiable1[/* properties */ CIMSymbolProperties, CIMSymbol] {
  def fromJSON(json: js.Any): CIMSymbol = js.native
}

