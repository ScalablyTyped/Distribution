package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardsSubscription extends js.Object {
  /**
    * The ARN of a standard. In this release, Security Hub supports only the CIS AWS Foundations standard, which uses the following ARN: arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0. 
    */
  var StandardsArn: NonEmptyString
  /**
    * A key-value pair of input for the standard.
    */
  var StandardsInput: StandardsInputParameterMap
  /**
    * The status of the standards subscription.
    */
  var StandardsStatus: awsDashSdkLib.clientsSecurityhubMod.StandardsStatus
  /**
    * The ARN of a resource that represents your subscription to a supported standard.
    */
  var StandardsSubscriptionArn: NonEmptyString
}

object StandardsSubscription {
  @scala.inline
  def apply(
    StandardsArn: NonEmptyString,
    StandardsInput: StandardsInputParameterMap,
    StandardsStatus: StandardsStatus,
    StandardsSubscriptionArn: NonEmptyString
  ): StandardsSubscription = {
    val __obj = js.Dynamic.literal(StandardsArn = StandardsArn, StandardsInput = StandardsInput, StandardsStatus = StandardsStatus.asInstanceOf[js.Any], StandardsSubscriptionArn = StandardsSubscriptionArn)
  
    __obj.asInstanceOf[StandardsSubscription]
  }
}

