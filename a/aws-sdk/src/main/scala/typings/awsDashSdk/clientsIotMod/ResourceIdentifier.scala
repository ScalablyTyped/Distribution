package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceIdentifier extends js.Object {
  /**
    * The account with which the resource is associated.
    */
  var account: js.UndefOr[AwsAccountId] = js.undefined
  /**
    * The ID of the CA certificate used to authorize the certificate.
    */
  var caCertificateId: js.UndefOr[CertificateId] = js.undefined
  /**
    * The client ID.
    */
  var clientId: js.UndefOr[ClientId] = js.undefined
  /**
    * The ID of the Amazon Cognito identity pool.
    */
  var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.undefined
  /**
    * The ID of the certificate attached to the resource.
    */
  var deviceCertificateId: js.UndefOr[CertificateId] = js.undefined
  /**
    * The version of the policy associated with the resource.
    */
  var policyVersionIdentifier: js.UndefOr[PolicyVersionIdentifier] = js.undefined
}

object ResourceIdentifier {
  @scala.inline
  def apply(
    account: AwsAccountId = null,
    caCertificateId: CertificateId = null,
    clientId: ClientId = null,
    cognitoIdentityPoolId: CognitoIdentityPoolId = null,
    deviceCertificateId: CertificateId = null,
    policyVersionIdentifier: PolicyVersionIdentifier = null
  ): ResourceIdentifier = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account)
    if (caCertificateId != null) __obj.updateDynamic("caCertificateId")(caCertificateId)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (cognitoIdentityPoolId != null) __obj.updateDynamic("cognitoIdentityPoolId")(cognitoIdentityPoolId)
    if (deviceCertificateId != null) __obj.updateDynamic("deviceCertificateId")(deviceCertificateId)
    if (policyVersionIdentifier != null) __obj.updateDynamic("policyVersionIdentifier")(policyVersionIdentifier)
    __obj.asInstanceOf[ResourceIdentifier]
  }
}

