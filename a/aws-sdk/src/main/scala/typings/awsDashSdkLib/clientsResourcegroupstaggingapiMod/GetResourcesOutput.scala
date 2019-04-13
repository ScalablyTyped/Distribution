package typings
package awsDashSdkLib.clientsResourcegroupstaggingapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResourcesOutput extends js.Object {
  /**
    * A string that indicates that the response contains more data than can be returned in a single response. To receive additional data, specify this string for the PaginationToken value in a subsequent request.
    */
  var PaginationToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * A list of resource ARNs and the tags (keys and values) associated with each.
    */
  var ResourceTagMappingList: js.UndefOr[ResourceTagMappingList] = js.undefined
}

object GetResourcesOutput {
  @scala.inline
  def apply(PaginationToken: PaginationToken = null, ResourceTagMappingList: ResourceTagMappingList = null): GetResourcesOutput = {
    val __obj = js.Dynamic.literal()
    if (PaginationToken != null) __obj.updateDynamic("PaginationToken")(PaginationToken)
    if (ResourceTagMappingList != null) __obj.updateDynamic("ResourceTagMappingList")(ResourceTagMappingList)
    __obj.asInstanceOf[GetResourcesOutput]
  }
}

