package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTopicRefreshScheduleResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset.
    */
  var DatasetArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The definition of a refresh schedule.
    */
  var RefreshSchedule: js.UndefOr[TopicRefreshSchedule] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the topic.
    */
  var TopicArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ID of the topic that contains the refresh schedule that you want to describe. This ID is unique per Amazon Web Services Region for each Amazon Web Services account.
    */
  var TopicId: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TopicId] = js.undefined
}
object DescribeTopicRefreshScheduleResponse {
  
  inline def apply(): DescribeTopicRefreshScheduleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTopicRefreshScheduleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTopicRefreshScheduleResponse] (val x: Self) extends AnyVal {
    
    inline def setDatasetArn(value: Arn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetArnUndefined: Self = StObject.set(x, "DatasetArn", js.undefined)
    
    inline def setRefreshSchedule(value: TopicRefreshSchedule): Self = StObject.set(x, "RefreshSchedule", value.asInstanceOf[js.Any])
    
    inline def setRefreshScheduleUndefined: Self = StObject.set(x, "RefreshSchedule", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTopicArn(value: Arn): Self = StObject.set(x, "TopicArn", value.asInstanceOf[js.Any])
    
    inline def setTopicArnUndefined: Self = StObject.set(x, "TopicArn", js.undefined)
    
    inline def setTopicId(value: TopicId): Self = StObject.set(x, "TopicId", value.asInstanceOf[js.Any])
    
    inline def setTopicIdUndefined: Self = StObject.set(x, "TopicId", js.undefined)
  }
}
