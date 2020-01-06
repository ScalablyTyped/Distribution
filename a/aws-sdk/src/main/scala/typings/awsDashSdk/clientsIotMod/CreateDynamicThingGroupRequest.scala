package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDynamicThingGroupRequest extends js.Object {
  /**
    * The dynamic thing group index name.  Currently one index is supported: "AWS_Things". 
    */
  var indexName: js.UndefOr[IndexName] = js.native
  /**
    * The dynamic thing group search query string. See Query Syntax for information about query string syntax.
    */
  var queryString: QueryString = js.native
  /**
    * The dynamic thing group query version.  Currently one query version is supported: "2017-09-30". If not specified, the query version defaults to this value. 
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.native
  /**
    * Metadata which can be used to manage the dynamic thing group.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The dynamic thing group name to create.
    */
  var thingGroupName: ThingGroupName = js.native
  /**
    * The dynamic thing group properties.
    */
  var thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.native
}

object CreateDynamicThingGroupRequest {
  @scala.inline
  def apply(
    queryString: QueryString,
    thingGroupName: ThingGroupName,
    indexName: IndexName = null,
    queryVersion: QueryVersion = null,
    tags: TagList = null,
    thingGroupProperties: ThingGroupProperties = null
  ): CreateDynamicThingGroupRequest = {
    val __obj = js.Dynamic.literal(queryString = queryString.asInstanceOf[js.Any], thingGroupName = thingGroupName.asInstanceOf[js.Any])
    if (indexName != null) __obj.updateDynamic("indexName")(indexName.asInstanceOf[js.Any])
    if (queryVersion != null) __obj.updateDynamic("queryVersion")(queryVersion.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (thingGroupProperties != null) __obj.updateDynamic("thingGroupProperties")(thingGroupProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDynamicThingGroupRequest]
  }
}

