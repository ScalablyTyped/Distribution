package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchEnableStandardsRequest extends js.Object {
  /**
    * The list of standards compliance checks to enable.  In this release, Security Hub supports only the CIS AWS Foundations standard. The ARN for the standard is arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0. 
    */
  var StandardsSubscriptionRequests: awsDashSdkLib.clientsSecurityhubMod.StandardsSubscriptionRequests
}

object BatchEnableStandardsRequest {
  @scala.inline
  def apply(StandardsSubscriptionRequests: StandardsSubscriptionRequests): BatchEnableStandardsRequest = {
    val __obj = js.Dynamic.literal(StandardsSubscriptionRequests = StandardsSubscriptionRequests)
  
    __obj.asInstanceOf[BatchEnableStandardsRequest]
  }
}

