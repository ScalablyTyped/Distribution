package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRefreshScheduleRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID of the dataset.
    */
  var DataSetId: ResourceId
  
  /**
    * The ID of the refresh schedule.
    */
  var ScheduleId: String
}
object DeleteRefreshScheduleRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, DataSetId: ResourceId, ScheduleId: String): DeleteRefreshScheduleRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], ScheduleId = ScheduleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRefreshScheduleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRefreshScheduleRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setDataSetId(value: ResourceId): Self = StObject.set(x, "DataSetId", value.asInstanceOf[js.Any])
    
    inline def setScheduleId(value: String): Self = StObject.set(x, "ScheduleId", value.asInstanceOf[js.Any])
  }
}
