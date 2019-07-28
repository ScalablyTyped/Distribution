package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetDataRetrievalPolicyInput extends js.Object {
  /**
    * The data retrieval policy in JSON format.
    */
  var Policy: js.UndefOr[DataRetrievalPolicy] = js.undefined
  /**
    * The AccountId value is the AWS account ID. This value must match the AWS account ID associated with the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID.
    */
  var accountId: String
}

object SetDataRetrievalPolicyInput {
  @scala.inline
  def apply(accountId: String, Policy: DataRetrievalPolicy = null): SetDataRetrievalPolicyInput = {
    val __obj = js.Dynamic.literal(accountId = accountId)
    if (Policy != null) __obj.updateDynamic("Policy")(Policy)
    __obj.asInstanceOf[SetDataRetrievalPolicyInput]
  }
}

