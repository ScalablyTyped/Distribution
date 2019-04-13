package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the user pool to assign the tags to.
    */
  var ResourceArn: ArnType
  /**
    * The tags to assign to the user pool.
    */
  var Tags: js.UndefOr[UserPoolTagsType] = js.undefined
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: ArnType, Tags: UserPoolTagsType = null): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[TagResourceRequest]
  }
}

