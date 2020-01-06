package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpUrlDestinationSummary extends js.Object {
  /**
    * The URL used to confirm ownership of or access to the HTTP topic rule destination URL.
    */
  var confirmationUrl: js.UndefOr[Url] = js.native
}

object HttpUrlDestinationSummary {
  @scala.inline
  def apply(confirmationUrl: Url = null): HttpUrlDestinationSummary = {
    val __obj = js.Dynamic.literal()
    if (confirmationUrl != null) __obj.updateDynamic("confirmationUrl")(confirmationUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpUrlDestinationSummary]
  }
}

