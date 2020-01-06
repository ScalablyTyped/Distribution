package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingGroupIndexingConfiguration extends js.Object {
  /**
    * A list of thing group fields to index. This list cannot contain any managed fields. Use the GetIndexingConfiguration API to get a list of managed fields. Contains custom field names and their data type.
    */
  var customFields: js.UndefOr[Fields] = js.native
  /**
    * Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
    */
  var managedFields: js.UndefOr[Fields] = js.native
  /**
    * Thing group indexing mode.
    */
  var thingGroupIndexingMode: ThingGroupIndexingMode = js.native
}

object ThingGroupIndexingConfiguration {
  @scala.inline
  def apply(
    thingGroupIndexingMode: ThingGroupIndexingMode,
    customFields: Fields = null,
    managedFields: Fields = null
  ): ThingGroupIndexingConfiguration = {
    val __obj = js.Dynamic.literal(thingGroupIndexingMode = thingGroupIndexingMode.asInstanceOf[js.Any])
    if (customFields != null) __obj.updateDynamic("customFields")(customFields.asInstanceOf[js.Any])
    if (managedFields != null) __obj.updateDynamic("managedFields")(managedFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingGroupIndexingConfiguration]
  }
}

