package typings.awsSdk.clientsSavingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlanOfferingRateFilterElement extends StObject {
  
  /**
    * The filter name.
    */
  var name: js.UndefOr[SavingsPlanRateFilterAttribute] = js.undefined
  
  /**
    * The filter values.
    */
  var values: js.UndefOr[FilterValuesList] = js.undefined
}
object SavingsPlanOfferingRateFilterElement {
  
  inline def apply(): SavingsPlanOfferingRateFilterElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanOfferingRateFilterElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingsPlanOfferingRateFilterElement] (val x: Self) extends AnyVal {
    
    inline def setName(value: SavingsPlanRateFilterAttribute): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValues(value: FilterValuesList): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: JsonSafeFilterValueString*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
