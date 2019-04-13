package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareDetails extends js.Object {
  /**
    * List of errors.
    */
  var ShareErrors: js.UndefOr[ShareErrors] = js.undefined
  /**
    * List of accounts for whom the operation succeeded.
    */
  var SuccessfulShares: js.UndefOr[SuccessfulShares] = js.undefined
}

object ShareDetails {
  @scala.inline
  def apply(ShareErrors: ShareErrors = null, SuccessfulShares: SuccessfulShares = null): ShareDetails = {
    val __obj = js.Dynamic.literal()
    if (ShareErrors != null) __obj.updateDynamic("ShareErrors")(ShareErrors)
    if (SuccessfulShares != null) __obj.updateDynamic("SuccessfulShares")(SuccessfulShares)
    __obj.asInstanceOf[ShareDetails]
  }
}

