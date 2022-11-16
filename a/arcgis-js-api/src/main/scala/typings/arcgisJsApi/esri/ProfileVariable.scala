package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.boolean
import typings.arcgisJsApi.arcgisJsApiStrings.date
import typings.arcgisJsApi.arcgisJsApiStrings.feature
import typings.arcgisJsApi.arcgisJsApiStrings.featureSet
import typings.arcgisJsApi.arcgisJsApiStrings.featureSetCollection
import typings.arcgisJsApi.arcgisJsApiStrings.number
import typings.arcgisJsApi.arcgisJsApiStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.SimpleVariable
  - typings.arcgisJsApi.esri.DictionaryVariable
  - typings.arcgisJsApi.esri.ArrayVariable
*/
trait ProfileVariable extends StObject
object ProfileVariable {
  
  inline def ArrayVariable(name: String): typings.arcgisJsApi.esri.ArrayVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.ArrayVariable]
  }
  
  inline def DictionaryVariable(name: String): typings.arcgisJsApi.esri.DictionaryVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("dictionary")
    __obj.asInstanceOf[typings.arcgisJsApi.esri.DictionaryVariable]
  }
  
  inline def SimpleVariable(
    name: String,
    `type`: feature | featureSet | featureSetCollection | typings.arcgisJsApi.arcgisJsApiStrings.geometry | number | text | date | boolean
  ): typings.arcgisJsApi.esri.SimpleVariable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.SimpleVariable]
  }
}
