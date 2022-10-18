package typings.awsSdk.clientsSavingsplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsPlanOfferingRateProperty extends StObject {
  
  /**
    * The property name.
    */
  var name: js.UndefOr[JsonSafeFilterValueString] = js.undefined
  
  /**
    * The property value.
    */
  var value: js.UndefOr[JsonSafeFilterValueString] = js.undefined
}
object SavingsPlanOfferingRateProperty {
  
  inline def apply(): SavingsPlanOfferingRateProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlanOfferingRateProperty]
  }
  
  extension [Self <: SavingsPlanOfferingRateProperty](x: Self) {
    
    inline def setName(value: JsonSafeFilterValueString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setValue(value: JsonSafeFilterValueString): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
