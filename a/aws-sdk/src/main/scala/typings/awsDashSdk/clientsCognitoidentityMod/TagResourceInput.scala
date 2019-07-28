package typings.awsDashSdk.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the identity pool to assign the tags to.
    */
  var ResourceArn: ARNString
  /**
    * The tags to assign to the identity pool.
    */
  var Tags: js.UndefOr[IdentityPoolTagsType] = js.undefined
}

object TagResourceInput {
  @scala.inline
  def apply(ResourceArn: ARNString, Tags: IdentityPoolTagsType = null): TagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[TagResourceInput]
  }
}

