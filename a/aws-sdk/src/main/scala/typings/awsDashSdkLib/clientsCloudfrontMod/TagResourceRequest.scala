package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    *  An ARN of a CloudFront resource.
    */
  var Resource: ResourceARN
  /**
    *  A complex type that contains zero or more Tag elements.
    */
  var Tags: awsDashSdkLib.clientsCloudfrontMod.Tags
}

object TagResourceRequest {
  @scala.inline
  def apply(Resource: ResourceARN, Tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

