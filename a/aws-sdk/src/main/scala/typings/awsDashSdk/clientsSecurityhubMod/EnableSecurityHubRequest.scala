package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableSecurityHubRequest extends js.Object {
  /**
    * The tags to add to the Hub resource when you enable Security Hub.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object EnableSecurityHubRequest {
  @scala.inline
  def apply(Tags: TagMap = null): EnableSecurityHubRequest = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableSecurityHubRequest]
  }
}

