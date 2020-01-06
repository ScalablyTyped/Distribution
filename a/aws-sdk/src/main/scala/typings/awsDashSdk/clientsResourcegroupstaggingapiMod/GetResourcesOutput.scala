package typings.awsDashSdk.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourcesOutput extends js.Object {
  /**
    * A string that indicates that the response contains more data than can be returned in a single response. To receive additional data, specify this string for the PaginationToken value in a subsequent request.
    */
  var PaginationToken: js.UndefOr[typings.awsDashSdk.clientsResourcegroupstaggingapiMod.PaginationToken] = js.native
  /**
    * A list of resource ARNs and the tags (keys and values) associated with each.
    */
  var ResourceTagMappingList: js.UndefOr[typings.awsDashSdk.clientsResourcegroupstaggingapiMod.ResourceTagMappingList] = js.native
}

object GetResourcesOutput {
  @scala.inline
  def apply(PaginationToken: PaginationToken = null, ResourceTagMappingList: ResourceTagMappingList = null): GetResourcesOutput = {
    val __obj = js.Dynamic.literal()
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken.asInstanceOf[js.Any])
    if (ResourceTagMappingList != null) __obj.updateDynamic("ResourceTagMappingList")(ResourceTagMappingList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcesOutput]
  }
}

