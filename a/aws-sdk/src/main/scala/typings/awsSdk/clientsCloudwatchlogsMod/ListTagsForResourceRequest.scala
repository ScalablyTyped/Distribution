package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The ARN of the resource that you want to view tags for. The ARN format of a log group is arn:aws:logs:Region:account-id:log-group:log-group-name   The ARN format of a destination is arn:aws:logs:Region:account-id:destination:destination-name   For more information about ARN format, see CloudWatch Logs resources and operations.
    */
  var resourceArn: AmazonResourceName
}
object ListTagsForResourceRequest {
  
  inline def apply(resourceArn: AmazonResourceName): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: AmazonResourceName): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
