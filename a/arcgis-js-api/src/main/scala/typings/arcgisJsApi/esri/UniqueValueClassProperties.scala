package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UniqueValueClassProperties extends StObject {
  
  /**
  		 * Describes the [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html#values) represented by the [symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html#symbol) in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html#label)
  		 */
  var label: js.UndefOr[String] = js.undefined
  
  /**
  		 * Defines the symbol used to represent features containing the given [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html#values).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html#symbol)
  		 */
  var symbol: js.UndefOr[SymbolProperties] = js.undefined
  
  /**
  		 * An array of unique values that should be rendered with the same symbol.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-UniqueValueClass.html#values)
  		 */
  var values: js.UndefOr[js.Array[UniqueValueProperties] | String | Double] = js.undefined
}
object UniqueValueClassProperties {
  
  inline def apply(): UniqueValueClassProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniqueValueClassProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UniqueValueClassProperties] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSymbol(value: SymbolProperties): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setValues(value: js.Array[UniqueValueProperties] | String | Double): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: UniqueValueProperties*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
