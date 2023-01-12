package typings.awsSdk.clientsSavingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlanOfferingFilterElement extends StObject {
  
  /**
    * The filter name.
    */
  var name: js.UndefOr[SavingsPlanOfferingFilterAttribute] = js.undefined
  
  /**
    * The filter values.
    */
  var values: js.UndefOr[FilterValuesList] = js.undefined
}
object SavingsPlanOfferingFilterElement {
  
  inline def apply(): SavingsPlanOfferingFilterElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanOfferingFilterElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingsPlanOfferingFilterElement] (val x: Self) extends AnyVal {
    
    inline def setName(value: SavingsPlanOfferingFilterAttribute): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValues(value: FilterValuesList): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: JsonSafeFilterValueString*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
