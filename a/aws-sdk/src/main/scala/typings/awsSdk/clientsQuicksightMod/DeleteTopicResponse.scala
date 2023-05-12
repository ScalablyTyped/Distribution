package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTopicResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the topic.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Arn] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
  
  /**
    * The ID of the topic that you want to delete. This ID is unique per Amazon Web Services Region for each Amazon Web Services account.
    */
  var TopicId: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TopicId] = js.undefined
}
object DeleteTopicResponse {
  
  inline def apply(): DeleteTopicResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTopicResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTopicResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTopicId(value: TopicId): Self = StObject.set(x, "TopicId", value.asInstanceOf[js.Any])
    
    inline def setTopicIdUndefined: Self = StObject.set(x, "TopicId", js.undefined)
  }
}
