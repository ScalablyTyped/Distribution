package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoricalValues extends StObject {
  
  /**
    *  Indicates the number of categories in the data. 
    */
  var NumberOfCategory: js.UndefOr[Integer] = js.undefined
  
  /**
    *  Indicates whether there is a potential data issue related to categorical values. 
    */
  var Status: StatisticalIssueStatus
}
object CategoricalValues {
  
  inline def apply(Status: StatisticalIssueStatus): CategoricalValues = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoricalValues]
  }
  
  extension [Self <: CategoricalValues](x: Self) {
    
    inline def setNumberOfCategory(value: Integer): Self = StObject.set(x, "NumberOfCategory", value.asInstanceOf[js.Any])
    
    inline def setNumberOfCategoryUndefined: Self = StObject.set(x, "NumberOfCategory", js.undefined)
    
    inline def setStatus(value: StatisticalIssueStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
