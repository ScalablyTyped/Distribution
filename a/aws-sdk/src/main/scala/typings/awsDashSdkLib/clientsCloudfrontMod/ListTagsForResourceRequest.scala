package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceRequest extends js.Object {
  /**
    *  An ARN of a CloudFront resource.
    */
  var Resource: ResourceARN
}

object ListTagsForResourceRequest {
  @scala.inline
  def apply(Resource: ResourceARN): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource)
  
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
}

