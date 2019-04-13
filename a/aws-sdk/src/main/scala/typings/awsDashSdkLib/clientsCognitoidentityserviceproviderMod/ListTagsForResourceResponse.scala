package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceResponse extends js.Object {
  /**
    * The tags that are assigned to the user pool.
    */
  var Tags: js.UndefOr[UserPoolTagsType] = js.undefined
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(Tags: UserPoolTagsType = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

