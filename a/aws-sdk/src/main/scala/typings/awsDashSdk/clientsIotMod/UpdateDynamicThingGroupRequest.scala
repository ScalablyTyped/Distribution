package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDynamicThingGroupRequest extends js.Object {
  /**
    * The expected version of the dynamic thing group to update.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  /**
    * The dynamic thing group index to update.  Currently one index is supported: 'AWS_Things'. 
    */
  var indexName: js.UndefOr[IndexName] = js.undefined
  /**
    * The dynamic thing group search query string to update.
    */
  var queryString: js.UndefOr[QueryString] = js.undefined
  /**
    * The dynamic thing group query version to update.  Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to this value. 
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.undefined
  /**
    * The name of the dynamic thing group to update.
    */
  var thingGroupName: ThingGroupName
  /**
    * The dynamic thing group properties to update.
    */
  var thingGroupProperties: ThingGroupProperties
}

object UpdateDynamicThingGroupRequest {
  @scala.inline
  def apply(
    thingGroupName: ThingGroupName,
    thingGroupProperties: ThingGroupProperties,
    expectedVersion: Int | Double = null,
    indexName: IndexName = null,
    queryString: QueryString = null,
    queryVersion: QueryVersion = null
  ): UpdateDynamicThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName, thingGroupProperties = thingGroupProperties)
    if (expectedVersion != null) __obj.updateDynamic("expectedVersion")(expectedVersion.asInstanceOf[js.Any])
    if (indexName != null) __obj.updateDynamic("indexName")(indexName)
    if (queryString != null) __obj.updateDynamic("queryString")(queryString)
    if (queryVersion != null) __obj.updateDynamic("queryVersion")(queryVersion)
    __obj.asInstanceOf[UpdateDynamicThingGroupRequest]
  }
}

