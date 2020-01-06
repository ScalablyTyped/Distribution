package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketRequestPaymentOutput extends js.Object {
  /**
    * Specifies who pays for the download and request fees.
    */
  var Payer: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Payer] = js.native
}

object GetBucketRequestPaymentOutput {
  @scala.inline
  def apply(Payer: Payer = null): GetBucketRequestPaymentOutput = {
    val __obj = js.Dynamic.literal()
    if (Payer != null) __obj.updateDynamic("Payer")(Payer.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketRequestPaymentOutput]
  }
}

