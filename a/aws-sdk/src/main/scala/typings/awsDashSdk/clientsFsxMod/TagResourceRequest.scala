package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon FSx resource that you want to tag.
    */
  var ResourceARN: typings.awsDashSdk.clientsFsxMod.ResourceARN = js.native
  /**
    * A list of tags for the resource. If a tag with a given key already exists, the value is replaced by the one specified in this parameter.
    */
  var Tags: typings.awsDashSdk.clientsFsxMod.Tags = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceARN: ResourceARN, Tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

