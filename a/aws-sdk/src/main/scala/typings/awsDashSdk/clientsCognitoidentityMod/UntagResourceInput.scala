package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the identity pool that the tags are assigned to.
    */
  var ResourceArn: ARNString
  /**
    * The keys of the tags to remove from the user pool.
    */
  var TagKeys: js.UndefOr[IdentityPoolTagsListType] = js.undefined
}

object UntagResourceInput {
  @scala.inline
  def apply(ResourceArn: ARNString, TagKeys: IdentityPoolTagsListType = null): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
    if (TagKeys != null) __obj.updateDynamic("TagKeys")(TagKeys)
    __obj.asInstanceOf[UntagResourceInput]
  }
}

