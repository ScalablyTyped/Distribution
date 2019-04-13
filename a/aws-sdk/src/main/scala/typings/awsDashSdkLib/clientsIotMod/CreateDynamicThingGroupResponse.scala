package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDynamicThingGroupResponse extends js.Object {
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
    * The dynamic thing group ARN.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined
  /**
    * The dynamic thing group ID.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.undefined
  /**
    * The dynamic thing group name.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
}

object CreateDynamicThingGroupResponse {
  @scala.inline
  def apply(
    indexName: IndexName = null,
    queryString: QueryString = null,
    queryVersion: QueryVersion = null,
    thingGroupArn: ThingGroupArn = null,
    thingGroupId: ThingGroupId = null,
    thingGroupName: ThingGroupName = null
  ): CreateDynamicThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (indexName != null) __obj.updateDynamic("indexName")(indexName)
    if (queryString != null) __obj.updateDynamic("queryString")(queryString)
    if (queryVersion != null) __obj.updateDynamic("queryVersion")(queryVersion)
    if (thingGroupArn != null) __obj.updateDynamic("thingGroupArn")(thingGroupArn)
    if (thingGroupId != null) __obj.updateDynamic("thingGroupId")(thingGroupId)
    if (thingGroupName != null) __obj.updateDynamic("thingGroupName")(thingGroupName)
    __obj.asInstanceOf[CreateDynamicThingGroupResponse]
  }
}

