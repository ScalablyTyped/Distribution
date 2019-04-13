package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetComplianceSummaryByResourceTypeRequest extends js.Object {
  /**
    * Specify one or more resource types to get the number of resources that are compliant and the number that are noncompliant for each resource type. For this request, you can specify an AWS resource type such as AWS::EC2::Instance. You can specify that the resource type is an AWS account by specifying AWS::::Account.
    */
  var ResourceTypes: js.UndefOr[ResourceTypes] = js.undefined
}

object GetComplianceSummaryByResourceTypeRequest {
  @scala.inline
  def apply(ResourceTypes: ResourceTypes = null): GetComplianceSummaryByResourceTypeRequest = {
    val __obj = js.Dynamic.literal()
    if (ResourceTypes != null) __obj.updateDynamic("ResourceTypes")(ResourceTypes)
    __obj.asInstanceOf[GetComplianceSummaryByResourceTypeRequest]
  }
}

