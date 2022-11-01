package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * The ARN of the resource that you're adding tags to. The ARN format of a log group is arn:aws:logs:Region:account-id:log-group:log-group-name   The ARN format of a destination is arn:aws:logs:Region:account-id:destination:destination-name   For more information about ARN format, see CloudWatch Logs resources and operations.
    */
  var resourceArn: AmazonResourceName
  
  /**
    * The list of key-value pairs to associate with the resource.
    */
  var tags: Tags
}
object TagResourceRequest {
  
  inline def apply(resourceArn: AmazonResourceName, tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  extension [Self <: TagResourceRequest](x: Self) {
    
    inline def setResourceArn(value: AmazonResourceName): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
