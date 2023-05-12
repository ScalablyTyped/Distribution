package typings.awsSdk.clientsApplicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * Identifies the Application Auto Scaling scalable target that you want to apply tags to. For example: arn:aws:application-autoscaling:us-east-1:123456789012:scalable-target/1234abcd56ab78cd901ef1234567890ab123  To get the ARN for a scalable target, use DescribeScalableTargets.
    */
  var ResourceARN: AmazonResourceName
  
  /**
    * The tags assigned to the resource. A tag is a label that you assign to an Amazon Web Services resource. Each tag consists of a tag key and a tag value. You cannot have more than one tag on an Application Auto Scaling scalable target with the same tag key. If you specify an existing tag key with a different tag value, Application Auto Scaling replaces the current tag value with the specified one. For information about the rules that apply to tag keys and tag values, see User-defined tag restrictions in the Amazon Web Services Billing and Cost Management User Guide.
    */
  var Tags: TagMap
}
object TagResourceRequest {
  
  inline def apply(ResourceARN: AmazonResourceName, Tags: TagMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TagResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceARN(value: AmazonResourceName): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
