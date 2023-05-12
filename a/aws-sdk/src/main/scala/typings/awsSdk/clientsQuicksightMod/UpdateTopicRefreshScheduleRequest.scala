package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTopicRefreshScheduleRequest extends StObject {
  
  /**
    * The ID of the Amazon Web Services account that contains the topic whose refresh schedule you want to update.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID of the dataset.
    */
  var DatasetId: String
  
  /**
    * The definition of a refresh schedule.
    */
  var RefreshSchedule: TopicRefreshSchedule
  
  /**
    * The ID of the topic that you want to modify. This ID is unique per Amazon Web Services Region for each Amazon Web Services account.
    */
  var TopicId: typings.awsSdk.clientsQuicksightMod.TopicId
}
object UpdateTopicRefreshScheduleRequest {
  
  inline def apply(
    AwsAccountId: AwsAccountId,
    DatasetId: String,
    RefreshSchedule: TopicRefreshSchedule,
    TopicId: TopicId
  ): UpdateTopicRefreshScheduleRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DatasetId = DatasetId.asInstanceOf[js.Any], RefreshSchedule = RefreshSchedule.asInstanceOf[js.Any], TopicId = TopicId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTopicRefreshScheduleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTopicRefreshScheduleRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "DatasetId", value.asInstanceOf[js.Any])
    
    inline def setRefreshSchedule(value: TopicRefreshSchedule): Self = StObject.set(x, "RefreshSchedule", value.asInstanceOf[js.Any])
    
    inline def setTopicId(value: TopicId): Self = StObject.set(x, "TopicId", value.asInstanceOf[js.Any])
  }
}
