package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    *  An ARN of a CloudFront resource.
    */
  var Resource: ResourceARN
  /**
    *  A complex type that contains zero or more Tag key elements.
    */
  var TagKeys: typings.awsDashSdk.clientsCloudfrontMod.TagKeys
}

object UntagResourceRequest {
  @scala.inline
  def apply(Resource: ResourceARN, TagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource, TagKeys = TagKeys)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

