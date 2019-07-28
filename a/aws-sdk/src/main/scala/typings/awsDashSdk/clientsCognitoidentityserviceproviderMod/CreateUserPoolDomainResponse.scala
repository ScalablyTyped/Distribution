package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUserPoolDomainResponse extends js.Object {
  /**
    * The Amazon CloudFront endpoint that you use as the target of the alias that you set up with your Domain Name Service (DNS) provider.
    */
  var CloudFrontDomain: js.UndefOr[DomainType] = js.undefined
}

object CreateUserPoolDomainResponse {
  @scala.inline
  def apply(CloudFrontDomain: DomainType = null): CreateUserPoolDomainResponse = {
    val __obj = js.Dynamic.literal()
    if (CloudFrontDomain != null) __obj.updateDynamic("CloudFrontDomain")(CloudFrontDomain)
    __obj.asInstanceOf[CreateUserPoolDomainResponse]
  }
}

