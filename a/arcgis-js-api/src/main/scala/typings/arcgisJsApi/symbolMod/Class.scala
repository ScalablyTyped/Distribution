package typings.arcgisJsApi.symbolMod

import typings.arcgisJsApi.esri.Symbol
import typings.arcgisJsApi.esri.SymbolProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/symbols/Symbol", JSImport.Namespace)
@js.native
/**
  * Symbol is the base class for all symbols.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html)
  */
class Class () extends Symbol {
  def this(properties: SymbolProperties) = this()
}
