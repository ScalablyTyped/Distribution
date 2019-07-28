package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserPoolDomainResponse extends js.Object {
  /**
    * The Amazon CloudFront endpoint that Amazon Cognito set up when you added the custom domain to your user pool.
    */
  var CloudFrontDomain: js.UndefOr[DomainType] = js.undefined
}

object UpdateUserPoolDomainResponse {
  @scala.inline
  def apply(CloudFrontDomain: DomainType = null): UpdateUserPoolDomainResponse = {
    val __obj = js.Dynamic.literal()
    if (CloudFrontDomain != null) __obj.updateDynamic("CloudFrontDomain")(CloudFrontDomain)
    __obj.asInstanceOf[UpdateUserPoolDomainResponse]
  }
}

