package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTopicRefreshScheduleRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The ID of the dataset.
    */
  var DatasetId: String
  
  /**
    * The ID of the topic that you want to modify. This ID is unique per Amazon Web Services Region for each Amazon Web Services account.
    */
  var TopicId: typings.awsSdk.clientsQuicksightMod.TopicId
}
object DeleteTopicRefreshScheduleRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, DatasetId: String, TopicId: TopicId): DeleteTopicRefreshScheduleRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DatasetId = DatasetId.asInstanceOf[js.Any], TopicId = TopicId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTopicRefreshScheduleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTopicRefreshScheduleRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setDatasetId(value: String): Self = StObject.set(x, "DatasetId", value.asInstanceOf[js.Any])
    
    inline def setTopicId(value: TopicId): Self = StObject.set(x, "TopicId", value.asInstanceOf[js.Any])
  }
}
