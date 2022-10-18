package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportFilter extends StObject {
  
  /**
    * The name of the field to use for filtering.
    */
  var name: ExportFilterName
  
  /**
    * The operator to use for the filter. Specify EQ when the ListExports operation should return only resource types that equal the specified value. Specify CO when the ListExports operation should return resource types that contain the specified value.
    */
  var operator: ExportFilterOperator
  
  /**
    * The values to use to filter the response. The values must be Bot, BotLocale, or CustomVocabulary.
    */
  var values: FilterValues
}
object ExportFilter {
  
  inline def apply(name: ExportFilterName, operator: ExportFilterOperator, values: FilterValues): ExportFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportFilter]
  }
  
  extension [Self <: ExportFilter](x: Self) {
    
    inline def setName(value: ExportFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: ExportFilterOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
