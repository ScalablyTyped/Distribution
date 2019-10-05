package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyVersion extends js.Object {
  /**
    * The date and time, in ISO 8601 date-time format, when the policy version was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.undefined
  /**
    * The policy document. The policy document is returned in the response to the GetPolicyVersion and GetAccountAuthorizationDetails operations. It is not returned in the response to the CreatePolicyVersion or ListPolicyVersions operations.  The policy document returned in this structure is URL-encoded compliant with RFC 3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you use Java, you can use the decode method of the java.net.URLDecoder utility class in the Java SDK. Other languages and SDKs provide similar functionality.
    */
  var Document: js.UndefOr[policyDocumentType] = js.undefined
  /**
    * Specifies whether the policy version is set as the policy's default version.
    */
  var IsDefaultVersion: js.UndefOr[booleanType] = js.undefined
  /**
    * The identifier for the policy version. Policy version identifiers always begin with v (always lowercase). When a policy is created, the first policy version is v1. 
    */
  var VersionId: js.UndefOr[policyVersionIdType] = js.undefined
}

object PolicyVersion {
  @scala.inline
  def apply(
    CreateDate: dateType = null,
    Document: policyDocumentType = null,
    IsDefaultVersion: js.UndefOr[Boolean] = js.undefined,
    VersionId: policyVersionIdType = null
  ): PolicyVersion = {
    val __obj = js.Dynamic.literal()
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate)
    if (Document != null) __obj.updateDynamic("Document")(Document)
    if (!js.isUndefined(IsDefaultVersion)) __obj.updateDynamic("IsDefaultVersion")(IsDefaultVersion)
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId)
    __obj.asInstanceOf[PolicyVersion]
  }
}

