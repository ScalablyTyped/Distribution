package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestPaymentConfiguration extends js.Object {
  /**
    * Specifies who pays for the download and request fees.
    */
  var Payer: typings.awsDashSdk.clientsS3Mod.Payer = js.native
}

object RequestPaymentConfiguration {
  @scala.inline
  def apply(Payer: Payer): RequestPaymentConfiguration = {
    val __obj = js.Dynamic.literal(Payer = Payer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequestPaymentConfiguration]
  }
}

