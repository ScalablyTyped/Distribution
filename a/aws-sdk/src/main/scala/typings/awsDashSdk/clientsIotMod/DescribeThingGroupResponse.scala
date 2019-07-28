package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeThingGroupResponse extends js.Object {
  /**
    * The dynamic thing group index name.
    */
  var indexName: js.UndefOr[IndexName] = js.undefined
  /**
    * The dynamic thing group search query string.
    */
  var queryString: js.UndefOr[QueryString] = js.undefined
  /**
    * The dynamic thing group query version.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.undefined
  /**
    * The dynamic thing group status.
    */
  var status: js.UndefOr[DynamicGroupStatus] = js.undefined
  /**
    * The thing group ARN.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined
  /**
    * The thing group ID.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.undefined
  /**
    * Thing group metadata.
    */
  var thingGroupMetadata: js.UndefOr[ThingGroupMetadata] = js.undefined
  /**
    * The name of the thing group.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
  /**
    * The thing group properties.
    */
  var thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.undefined
  /**
    * The version of the thing group.
    */
  var version: js.UndefOr[Version] = js.undefined
}

object DescribeThingGroupResponse {
  @scala.inline
  def apply(
    indexName: IndexName = null,
    queryString: QueryString = null,
    queryVersion: QueryVersion = null,
    status: DynamicGroupStatus = null,
    thingGroupArn: ThingGroupArn = null,
    thingGroupId: ThingGroupId = null,
    thingGroupMetadata: ThingGroupMetadata = null,
    thingGroupName: ThingGroupName = null,
    thingGroupProperties: ThingGroupProperties = null,
    version: js.UndefOr[Version] = js.undefined
  ): DescribeThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (indexName != null) __obj.updateDynamic("indexName")(indexName)
    if (queryString != null) __obj.updateDynamic("queryString")(queryString)
    if (queryVersion != null) __obj.updateDynamic("queryVersion")(queryVersion)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (thingGroupArn != null) __obj.updateDynamic("thingGroupArn")(thingGroupArn)
    if (thingGroupId != null) __obj.updateDynamic("thingGroupId")(thingGroupId)
    if (thingGroupMetadata != null) __obj.updateDynamic("thingGroupMetadata")(thingGroupMetadata)
    if (thingGroupName != null) __obj.updateDynamic("thingGroupName")(thingGroupName)
    if (thingGroupProperties != null) __obj.updateDynamic("thingGroupProperties")(thingGroupProperties)
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[DescribeThingGroupResponse]
  }
}

