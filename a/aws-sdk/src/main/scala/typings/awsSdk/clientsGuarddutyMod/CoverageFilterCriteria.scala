package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageFilterCriteria extends StObject {
  
  /**
    * Represents a condition that when matched will be added to the response of the operation.
    */
  var FilterCriterion: js.UndefOr[CoverageFilterCriterionList] = js.undefined
}
object CoverageFilterCriteria {
  
  inline def apply(): CoverageFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageFilterCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageFilterCriteria] (val x: Self) extends AnyVal {
    
    inline def setFilterCriterion(value: CoverageFilterCriterionList): Self = StObject.set(x, "FilterCriterion", value.asInstanceOf[js.Any])
    
    inline def setFilterCriterionUndefined: Self = StObject.set(x, "FilterCriterion", js.undefined)
    
    inline def setFilterCriterionVarargs(value: CoverageFilterCriterion*): Self = StObject.set(x, "FilterCriterion", js.Array(value*))
  }
}
