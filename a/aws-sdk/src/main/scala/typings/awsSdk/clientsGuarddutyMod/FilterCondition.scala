package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterCondition extends StObject {
  
  /**
    * Represents an equal  condition to be applied to a single field when querying for scan entries.
    */
  var EqualsValue: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Represents a greater than condition to be applied to a single field when querying for scan entries.
    */
  var GreaterThan: js.UndefOr[LongValue] = js.undefined
  
  /**
    * Represents a less than condition to be applied to a single field when querying for scan entries.
    */
  var LessThan: js.UndefOr[LongValue] = js.undefined
}
object FilterCondition {
  
  inline def apply(): FilterCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterCondition]
  }
  
  extension [Self <: FilterCondition](x: Self) {
    
    inline def setEqualsValue(value: NonEmptyString): Self = StObject.set(x, "EqualsValue", value.asInstanceOf[js.Any])
    
    inline def setEqualsValueUndefined: Self = StObject.set(x, "EqualsValue", js.undefined)
    
    inline def setGreaterThan(value: LongValue): Self = StObject.set(x, "GreaterThan", value.asInstanceOf[js.Any])
    
    inline def setGreaterThanUndefined: Self = StObject.set(x, "GreaterThan", js.undefined)
    
    inline def setLessThan(value: LongValue): Self = StObject.set(x, "LessThan", value.asInstanceOf[js.Any])
    
    inline def setLessThanUndefined: Self = StObject.set(x, "LessThan", js.undefined)
  }
}
