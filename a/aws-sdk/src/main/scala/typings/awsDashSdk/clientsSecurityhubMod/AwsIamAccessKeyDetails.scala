package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsIamAccessKeyDetails extends js.Object {
  /**
    * The creation date/time of the IAM access key related to a finding.
    */
  var CreatedAt: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ID of the principal associated with an access key.
    */
  var PrincipalId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the principal.
    */
  var PrincipalName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The type of principal associated with an access key.
    */
  var PrincipalType: js.UndefOr[NonEmptyString] = js.native
  /**
    * The status of the IAM access key related to a finding.
    */
  var Status: js.UndefOr[AwsIamAccessKeyStatus] = js.native
  /**
    * The user associated with the IAM access key related to a finding. The UserName parameter has been replaced with the PrincipalName parameter because access keys can also be assigned to principals that are not IAM users.
    */
  var UserName: js.UndefOr[NonEmptyString] = js.native
}

object AwsIamAccessKeyDetails {
  @scala.inline
  def apply(
    CreatedAt: NonEmptyString = null,
    PrincipalId: NonEmptyString = null,
    PrincipalName: NonEmptyString = null,
    PrincipalType: NonEmptyString = null,
    Status: AwsIamAccessKeyStatus = null,
    UserName: NonEmptyString = null
  ): AwsIamAccessKeyDetails = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (PrincipalId != null) __obj.updateDynamic("PrincipalId")(PrincipalId.asInstanceOf[js.Any])
    if (PrincipalName != null) __obj.updateDynamic("PrincipalName")(PrincipalName.asInstanceOf[js.Any])
    if (PrincipalType != null) __obj.updateDynamic("PrincipalType")(PrincipalType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsIamAccessKeyDetails]
  }
}

