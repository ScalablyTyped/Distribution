package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.cim
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CIMSymbol extends Symbol {
  /**
    * The JSON payload of the CIM symbol
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#data)
    */
  var data: js.Any = js.native
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#type)
    */
  @JSName("type")
  val type_CIMSymbol: cim = js.native
}

@JSGlobal("__esri.CIMSymbol")
@js.native
object CIMSymbol extends TopLevel[CIMSymbolConstructor]

