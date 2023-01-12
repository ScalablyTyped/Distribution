package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LargeTimestampGaps extends StObject {
  
  /**
    *  Indicates the size of the largest timestamp gap, in days. 
    */
  var MaxTimestampGapInDays: js.UndefOr[Integer] = js.undefined
  
  /**
    *  Indicates the number of large timestamp gaps, if there are any. 
    */
  var NumberOfLargeTimestampGaps: js.UndefOr[Integer] = js.undefined
  
  /**
    *  Indicates whether there is a potential data issue related to large gaps in timestamps. 
    */
  var Status: StatisticalIssueStatus
}
object LargeTimestampGaps {
  
  inline def apply(Status: StatisticalIssueStatus): LargeTimestampGaps = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LargeTimestampGaps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LargeTimestampGaps] (val x: Self) extends AnyVal {
    
    inline def setMaxTimestampGapInDays(value: Integer): Self = StObject.set(x, "MaxTimestampGapInDays", value.asInstanceOf[js.Any])
    
    inline def setMaxTimestampGapInDaysUndefined: Self = StObject.set(x, "MaxTimestampGapInDays", js.undefined)
    
    inline def setNumberOfLargeTimestampGaps(value: Integer): Self = StObject.set(x, "NumberOfLargeTimestampGaps", value.asInstanceOf[js.Any])
    
    inline def setNumberOfLargeTimestampGapsUndefined: Self = StObject.set(x, "NumberOfLargeTimestampGaps", js.undefined)
    
    inline def setStatus(value: StatisticalIssueStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
