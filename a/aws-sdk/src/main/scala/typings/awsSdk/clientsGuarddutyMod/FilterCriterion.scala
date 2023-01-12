package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterCriterion extends StObject {
  
  /**
    * An enum value representing possible scan properties to match with given scan entries.
    */
  var CriterionKey: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.CriterionKey] = js.undefined
  
  /**
    * Contains information about the condition.
    */
  var FilterCondition: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.FilterCondition] = js.undefined
}
object FilterCriterion {
  
  inline def apply(): FilterCriterion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterCriterion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterCriterion] (val x: Self) extends AnyVal {
    
    inline def setCriterionKey(value: CriterionKey): Self = StObject.set(x, "CriterionKey", value.asInstanceOf[js.Any])
    
    inline def setCriterionKeyUndefined: Self = StObject.set(x, "CriterionKey", js.undefined)
    
    inline def setFilterCondition(value: FilterCondition): Self = StObject.set(x, "FilterCondition", value.asInstanceOf[js.Any])
    
    inline def setFilterConditionUndefined: Self = StObject.set(x, "FilterCondition", js.undefined)
  }
}
