package typings
package awsDashSdkLib.libCredentialsSamlUnderscoreCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SAMLCredentialsParams extends js.Object {
  /**
    * The duration, in seconds, of the role session.
    * The minimum duration is 15 minutes.
    * The maximum duration is 12 hours.
    */
  var DurationSeconds: js.UndefOr[scala.Double] = js.undefined
  /**
    * An IAM policy in JSON format.
    * The policy plain text must be 2048 bytes or shorter.
    */
  var Policy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the SAML provider in IAM that describes the IdP.
    */
  var PrincipalArn: java.lang.String
  /**
    * The Amazon Resource Name (ARN) of the role that the caller is assuming.
    */
  var RoleArn: java.lang.String
  /**
    * The base-64 encoded SAML authentication response provided by the IdP.
    */
  var SAMLAssertion: java.lang.String
}

object SAMLCredentialsParams {
  @scala.inline
  def apply(
    PrincipalArn: java.lang.String,
    RoleArn: java.lang.String,
    SAMLAssertion: java.lang.String,
    DurationSeconds: scala.Int | scala.Double = null,
    Policy: java.lang.String = null
  ): SAMLCredentialsParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PrincipalArn")(PrincipalArn)
    __obj.updateDynamic("RoleArn")(RoleArn)
    __obj.updateDynamic("SAMLAssertion")(SAMLAssertion)
    if (DurationSeconds != null) __obj.updateDynamic("DurationSeconds")(DurationSeconds.asInstanceOf[js.Any])
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    __obj.asInstanceOf[SAMLCredentialsParams]
  }
}

