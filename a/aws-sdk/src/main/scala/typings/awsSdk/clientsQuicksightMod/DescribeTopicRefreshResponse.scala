package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTopicRefreshResponse extends StObject {
  
  /**
    * Details of the refresh, which is performed when the topic is created or updated.
    */
  var RefreshDetails: js.UndefOr[TopicRefreshDetails] = js.undefined
  
  /**
    * The Amazon Web Services request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.undefined
}
object DescribeTopicRefreshResponse {
  
  inline def apply(): DescribeTopicRefreshResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTopicRefreshResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTopicRefreshResponse] (val x: Self) extends AnyVal {
    
    inline def setRefreshDetails(value: TopicRefreshDetails): Self = StObject.set(x, "RefreshDetails", value.asInstanceOf[js.Any])
    
    inline def setRefreshDetailsUndefined: Self = StObject.set(x, "RefreshDetails", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    inline def setStatus(value: StatusCode): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
