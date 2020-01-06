package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareDetails extends js.Object {
  /**
    * List of errors.
    */
  var ShareErrors: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ShareErrors] = js.native
  /**
    * List of accounts for whom the operation succeeded.
    */
  var SuccessfulShares: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.SuccessfulShares] = js.native
}

object ShareDetails {
  @scala.inline
  def apply(ShareErrors: ShareErrors = null, SuccessfulShares: SuccessfulShares = null): ShareDetails = {
    val __obj = js.Dynamic.literal()
    if (ShareErrors != null) __obj.updateDynamic("ShareErrors")(ShareErrors.asInstanceOf[js.Any])
    if (SuccessfulShares != null) __obj.updateDynamic("SuccessfulShares")(SuccessfulShares.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareDetails]
  }
}

