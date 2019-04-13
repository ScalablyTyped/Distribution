package typings
package awsDashSdkLib.clientsCognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForResourceResponse extends js.Object {
  /**
    * The tags that are assigned to the identity pool.
    */
  var Tags: js.UndefOr[IdentityPoolTagsType] = js.undefined
}

object ListTagsForResourceResponse {
  @scala.inline
  def apply(Tags: IdentityPoolTagsType = null): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
}

