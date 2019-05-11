package typings
package awsDashSdkLib.clientsStsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssumeRoleWithSAMLResponse extends js.Object {
  /**
    * The identifiers for the temporary security credentials that the operation returns.
    */
  var AssumedRoleUser: js.UndefOr[AssumedRoleUser] = js.undefined
  /**
    *  The value of the Recipient attribute of the SubjectConfirmationData element of the SAML assertion. 
    */
  var Audience: js.UndefOr[Audience] = js.undefined
  /**
    * The temporary security credentials, which include an access key ID, a secret access key, and a security (or session) token.  The size of the security token that STS API operations return is not fixed. We strongly recommend that you make no assumptions about the maximum size. 
    */
  var Credentials: js.UndefOr[Credentials] = js.undefined
  /**
    * The value of the Issuer element of the SAML assertion.
    */
  var Issuer: js.UndefOr[Issuer] = js.undefined
  /**
    * A hash value based on the concatenation of the Issuer response value, the AWS account ID, and the friendly name (the last part of the ARN) of the SAML provider in IAM. The combination of NameQualifier and Subject can be used to uniquely identify a federated user.  The following pseudocode shows how the hash value is calculated:  BASE64 ( SHA1 ( "https://example.com/saml" + "123456789012" + "/MySAMLIdP" ) ) 
    */
  var NameQualifier: js.UndefOr[NameQualifier] = js.undefined
  /**
    * A percentage value that indicates the size of the policy in packed form. The service rejects any policy with a packed size greater than 100 percent, which means the policy exceeded the allowed space.
    */
  var PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.undefined
  /**
    * The value of the NameID element in the Subject element of the SAML assertion.
    */
  var Subject: js.UndefOr[Subject] = js.undefined
  /**
    *  The format of the name ID, as defined by the Format attribute in the NameID element of the SAML assertion. Typical examples of the format are transient or persistent.   If the format includes the prefix urn:oasis:names:tc:SAML:2.0:nameid-format, that prefix is removed. For example, urn:oasis:names:tc:SAML:2.0:nameid-format:transient is returned as transient. If the format includes any other prefix, the format is returned with no modifications.
    */
  var SubjectType: js.UndefOr[SubjectType] = js.undefined
}

object AssumeRoleWithSAMLResponse {
  @scala.inline
  def apply(
    AssumedRoleUser: AssumedRoleUser = null,
    Audience: Audience = null,
    Credentials: Credentials = null,
    Issuer: Issuer = null,
    NameQualifier: NameQualifier = null,
    PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.undefined,
    Subject: Subject = null,
    SubjectType: SubjectType = null
  ): AssumeRoleWithSAMLResponse = {
    val __obj = js.Dynamic.literal()
    if (AssumedRoleUser != null) __obj.updateDynamic("AssumedRoleUser")(AssumedRoleUser)
    if (Audience != null) __obj.updateDynamic("Audience")(Audience)
    if (Credentials != null) __obj.updateDynamic("Credentials")(Credentials)
    if (Issuer != null) __obj.updateDynamic("Issuer")(Issuer)
    if (NameQualifier != null) __obj.updateDynamic("NameQualifier")(NameQualifier)
    if (!js.isUndefined(PackedPolicySize)) __obj.updateDynamic("PackedPolicySize")(PackedPolicySize)
    if (Subject != null) __obj.updateDynamic("Subject")(Subject)
    if (SubjectType != null) __obj.updateDynamic("SubjectType")(SubjectType)
    __obj.asInstanceOf[AssumeRoleWithSAMLResponse]
  }
}

