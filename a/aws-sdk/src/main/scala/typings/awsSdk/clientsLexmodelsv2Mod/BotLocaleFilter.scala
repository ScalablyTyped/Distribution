package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotLocaleFilter extends StObject {
  
  /**
    * The name of the field to filter the list of bots.
    */
  var name: BotLocaleFilterName
  
  /**
    * The operator to use for the filter. Specify EQ when the ListBotLocales operation should return only aliases that equal the specified value. Specify CO when the ListBotLocales operation should return aliases that contain the specified value.
    */
  var operator: BotLocaleFilterOperator
  
  /**
    * The value to use for filtering the list of bots.
    */
  var values: FilterValues
}
object BotLocaleFilter {
  
  inline def apply(name: BotLocaleFilterName, operator: BotLocaleFilterOperator, values: FilterValues): BotLocaleFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[BotLocaleFilter]
  }
  
  extension [Self <: BotLocaleFilter](x: Self) {
    
    inline def setName(value: BotLocaleFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: BotLocaleFilterOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
