package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  /**
    * Indicates whether AWS or the customer owns and manages the AWS Config rule.
    */
  var Owner: awsDashSdkLib.clientsConfigserviceMod.Owner
  /**
    * Provides the source and type of the event that causes AWS Config to evaluate your AWS resources.
    */
  var SourceDetails: js.UndefOr[SourceDetails] = js.undefined
  /**
    * For AWS Config managed rules, a predefined identifier from a list. For example, IAM_PASSWORD_POLICY is a managed rule. To reference a managed rule, see Using AWS Managed Config Rules. For custom rules, the identifier is the Amazon Resource Name (ARN) of the rule's AWS Lambda function, such as arn:aws:lambda:us-east-2:123456789012:function:custom_rule_name.
    */
  var SourceIdentifier: StringWithCharLimit256
}

object Source {
  @scala.inline
  def apply(Owner: Owner, SourceIdentifier: StringWithCharLimit256, SourceDetails: SourceDetails = null): Source = {
    val __obj = js.Dynamic.literal(Owner = Owner.asInstanceOf[js.Any], SourceIdentifier = SourceIdentifier)
    if (SourceDetails != null) __obj.updateDynamic("SourceDetails")(SourceDetails)
    __obj.asInstanceOf[Source]
  }
}

