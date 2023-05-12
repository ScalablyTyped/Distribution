package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageFilterCriterion extends StObject {
  
  /**
    * An enum value representing possible filter fields.
    */
  var CriterionKey: js.UndefOr[CoverageFilterCriterionKey] = js.undefined
  
  /**
    * Contains information about the condition.
    */
  var FilterCondition: js.UndefOr[CoverageFilterCondition] = js.undefined
}
object CoverageFilterCriterion {
  
  inline def apply(): CoverageFilterCriterion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageFilterCriterion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageFilterCriterion] (val x: Self) extends AnyVal {
    
    inline def setCriterionKey(value: CoverageFilterCriterionKey): Self = StObject.set(x, "CriterionKey", value.asInstanceOf[js.Any])
    
    inline def setCriterionKeyUndefined: Self = StObject.set(x, "CriterionKey", js.undefined)
    
    inline def setFilterCondition(value: CoverageFilterCondition): Self = StObject.set(x, "FilterCondition", value.asInstanceOf[js.Any])
    
    inline def setFilterConditionUndefined: Self = StObject.set(x, "FilterCondition", js.undefined)
  }
}
