package typings.awsSdk.clientsSavingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlanFilter extends StObject {
  
  /**
    * The filter name.
    */
  var name: js.UndefOr[SavingsPlansFilterName] = js.undefined
  
  /**
    * The filter value.
    */
  var values: js.UndefOr[ListOfStrings] = js.undefined
}
object SavingsPlanFilter {
  
  inline def apply(): SavingsPlanFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanFilter]
  }
  
  extension [Self <: SavingsPlanFilter](x: Self) {
    
    inline def setName(value: SavingsPlansFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValues(value: ListOfStrings): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
