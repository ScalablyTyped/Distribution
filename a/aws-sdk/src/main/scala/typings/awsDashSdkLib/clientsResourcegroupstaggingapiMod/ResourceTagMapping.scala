package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceTagMapping extends js.Object {
  /**
    * Details on whether a resource is compliant with the effective tag policy, including information about any noncompliant tag keys.
    */
  var ComplianceDetails: js.UndefOr[ComplianceDetails] = js.undefined
  /**
    * The ARN of the resource.
    */
  var ResourceARN: js.UndefOr[ResourceARN] = js.undefined
  /**
    * The tags that have been applied to one or more AWS resources.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object ResourceTagMapping {
  @scala.inline
  def apply(ComplianceDetails: ComplianceDetails = null, ResourceARN: ResourceARN = null, Tags: TagList = null): ResourceTagMapping = {
    val __obj = js.Dynamic.literal()
    if (ComplianceDetails != null) __obj.updateDynamic("ComplianceDetails")(ComplianceDetails)
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ResourceTagMapping]
  }
}

