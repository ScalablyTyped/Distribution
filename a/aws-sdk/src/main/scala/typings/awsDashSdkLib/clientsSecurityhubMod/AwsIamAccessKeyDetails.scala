package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwsIamAccessKeyDetails extends js.Object {
  /**
    * The creation date/time of the IAM access key related to a finding.
    */
  var CreatedAt: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The status of the IAM access key related to a finding.
    */
  var Status: js.UndefOr[AwsIamAccessKeyStatus] = js.undefined
  /**
    * The user associated with the IAM access key related to a finding.
    */
  var UserName: js.UndefOr[NonEmptyString] = js.undefined
}

object AwsIamAccessKeyDetails {
  @scala.inline
  def apply(
    CreatedAt: NonEmptyString = null,
    Status: AwsIamAccessKeyStatus = null,
    UserName: NonEmptyString = null
  ): AwsIamAccessKeyDetails = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[AwsIamAccessKeyDetails]
  }
}

