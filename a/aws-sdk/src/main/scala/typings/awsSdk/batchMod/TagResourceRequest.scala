package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource to which to add tags. AWS Batch resources that support tags are compute environments, jobs, job definitions, and job queues. ARNs for child jobs of array and multi-node parallel (MNP) jobs are not supported.
    */
  var resourceArn: String
  
  /**
    * The tags that you apply to the resource to help you categorize and organize your resources. Each tag consists of a key and an optional value. For more information, see Tagging AWS Resources in AWS General Reference.
    */
  var tags: TagrisTagsMap
}
object TagResourceRequest {
  
  @scala.inline
  def apply(resourceArn: String, tags: TagrisTagsMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  @scala.inline
  implicit class TagResourceRequestMutableBuilder[Self <: TagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: String): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagrisTagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
  }
}
