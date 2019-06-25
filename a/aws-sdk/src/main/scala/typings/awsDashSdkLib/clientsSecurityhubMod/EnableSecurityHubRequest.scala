package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableSecurityHubRequest extends js.Object {
  /**
    * The tags to add to the Hub resource when you enable Security Hub.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}

object EnableSecurityHubRequest {
  @scala.inline
  def apply(Tags: TagMap = null): EnableSecurityHubRequest = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[EnableSecurityHubRequest]
  }
}

