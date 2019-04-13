package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user pool that the tags are assigned to.
    */
  var ResourceArn: ArnType
  /**
    * The keys of the tags to remove from the user pool.
    */
  var TagKeys: js.UndefOr[UserPoolTagsListType] = js.undefined
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceArn: ArnType, TagKeys: UserPoolTagsListType = null): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
    if (TagKeys != null) __obj.updateDynamic("TagKeys")(TagKeys)
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

