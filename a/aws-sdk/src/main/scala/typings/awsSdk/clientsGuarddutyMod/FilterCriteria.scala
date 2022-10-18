package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterCriteria extends StObject {
  
  /**
    * Represents a condition that when matched will be added to the response of the operation.
    */
  var FilterCriterion: js.UndefOr[FilterCriterionList] = js.undefined
}
object FilterCriteria {
  
  inline def apply(): FilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterCriteria]
  }
  
  extension [Self <: FilterCriteria](x: Self) {
    
    inline def setFilterCriterion(value: FilterCriterionList): Self = StObject.set(x, "FilterCriterion", value.asInstanceOf[js.Any])
    
    inline def setFilterCriterionUndefined: Self = StObject.set(x, "FilterCriterion", js.undefined)
    
    inline def setFilterCriterionVarargs(value: FilterCriterion*): Self = StObject.set(x, "FilterCriterion", js.Array(value*))
  }
}
