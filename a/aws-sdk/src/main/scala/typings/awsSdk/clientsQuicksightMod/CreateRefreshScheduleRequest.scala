package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRefreshScheduleRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID of the dataset.
    */
  var DataSetId: ResourceId
  
  /**
    * The refresh schedule.
    */
  var Schedule: RefreshSchedule
}
object CreateRefreshScheduleRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, DataSetId: ResourceId, Schedule: RefreshSchedule): CreateRefreshScheduleRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRefreshScheduleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRefreshScheduleRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setDataSetId(value: ResourceId): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setSchedule(value: RefreshSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
  }
}
