package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The stack or layer's Amazon Resource Number (ARN).
    */
  var ResourceArn: typings.awsDashSdk.clientsOpsworksMod.ResourceArn
  /**
    * A map that contains tag keys and tag values that are attached to a stack or layer.   The key cannot be empty.   The key can be a maximum of 127 characters, and can contain only Unicode letters, numbers, or separators, or the following special characters: + - = . _ : /    The value can be a maximum 255 characters, and contain only Unicode letters, numbers, or separators, or the following special characters: + - = . _ : /    Leading and trailing white spaces are trimmed from both the key and value.   A maximum of 40 tags is allowed for any resource.  
    */
  var Tags: typings.awsDashSdk.clientsOpsworksMod.Tags
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn, Tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

