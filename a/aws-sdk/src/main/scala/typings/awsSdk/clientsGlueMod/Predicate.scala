package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Predicate extends StObject {
  
  /**
    * A list of the conditions that determine when the trigger will fire.
    */
  var Conditions: js.UndefOr[ConditionList] = js.undefined
  
  /**
    * An optional field if only one condition is listed. If multiple conditions are listed, then this field is required.
    */
  var Logical: js.UndefOr[typings.awsSdk.clientsGlueMod.Logical] = js.undefined
}
object Predicate {
  
  inline def apply(): Predicate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Predicate]
  }
  
  extension [Self <: Predicate](x: Self) {
    
    inline def setConditions(value: ConditionList): Self = StObject.set(x, "Conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "Conditions", js.undefined)
    
    inline def setConditionsVarargs(value: Condition*): Self = StObject.set(x, "Conditions", js.Array(value*))
    
    inline def setLogical(value: Logical): Self = StObject.set(x, "Logical", value.asInstanceOf[js.Any])
    
    inline def setLogicalUndefined: Self = StObject.set(x, "Logical", js.undefined)
  }
}
