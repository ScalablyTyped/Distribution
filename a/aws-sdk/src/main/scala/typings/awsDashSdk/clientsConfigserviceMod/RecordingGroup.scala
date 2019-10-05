package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordingGroup extends js.Object {
  /**
    * Specifies whether AWS Config records configuration changes for every supported type of regional resource. If you set this option to true, when AWS Config adds support for a new type of regional resource, it starts recording resources of that type automatically. If you set this option to true, you cannot enumerate a list of resourceTypes.
    */
  var allSupported: js.UndefOr[AllSupported] = js.undefined
  /**
    * Specifies whether AWS Config includes all supported types of global resources (for example, IAM resources) with the resources that it records. Before you can set this option to true, you must set the allSupported option to true. If you set this option to true, when AWS Config adds support for a new type of global resource, it starts recording resources of that type automatically. The configuration details for any global resource are the same in all regions. To prevent duplicate configuration items, you should consider customizing AWS Config in only one region to record global resources.
    */
  var includeGlobalResourceTypes: js.UndefOr[IncludeGlobalResourceTypes] = js.undefined
  /**
    * A comma-separated list that specifies the types of AWS resources for which AWS Config records configuration changes (for example, AWS::EC2::Instance or AWS::CloudTrail::Trail). Before you can set this option to true, you must set the allSupported option to false. If you set this option to true, when AWS Config adds support for a new type of resource, it will not record resources of that type unless you manually add that type to your recording group. For a list of valid resourceTypes values, see the resourceType Value column in Supported AWS Resource Types.
    */
  var resourceTypes: js.UndefOr[ResourceTypeList] = js.undefined
}

object RecordingGroup {
  @scala.inline
  def apply(
    allSupported: js.UndefOr[scala.Boolean] = js.undefined,
    includeGlobalResourceTypes: js.UndefOr[scala.Boolean] = js.undefined,
    resourceTypes: ResourceTypeList = null
  ): RecordingGroup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allSupported)) __obj.updateDynamic("allSupported")(allSupported)
    if (!js.isUndefined(includeGlobalResourceTypes)) __obj.updateDynamic("includeGlobalResourceTypes")(includeGlobalResourceTypes)
    if (resourceTypes != null) __obj.updateDynamic("resourceTypes")(resourceTypes)
    __obj.asInstanceOf[RecordingGroup]
  }
}

