package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardsSubscriptionRequest extends js.Object {
  /**
    * The ARN of the standard that you want to enable.  In this release, Security Hub only supports the CIS AWS Foundations standard.  Its ARN is arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0. 
    */
  var StandardsArn: NonEmptyString
  /**
    * A key-value pair of input for the standard.
    */
  var StandardsInput: js.UndefOr[StandardsInputParameterMap] = js.undefined
}

object StandardsSubscriptionRequest {
  @scala.inline
  def apply(StandardsArn: NonEmptyString, StandardsInput: StandardsInputParameterMap = null): StandardsSubscriptionRequest = {
    val __obj = js.Dynamic.literal(StandardsArn = StandardsArn)
    if (StandardsInput != null) __obj.updateDynamic("StandardsInput")(StandardsInput)
    __obj.asInstanceOf[StandardsSubscriptionRequest]
  }
}

