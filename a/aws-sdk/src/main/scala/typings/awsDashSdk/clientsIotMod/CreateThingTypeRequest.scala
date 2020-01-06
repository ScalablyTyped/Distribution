package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateThingTypeRequest extends js.Object {
  /**
    * Metadata which can be used to manage the thing type.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The name of the thing type.
    */
  var thingTypeName: ThingTypeName = js.native
  /**
    * The ThingTypeProperties for the thing type to create. It contains information about the new thing type including a description, and a list of searchable thing attribute names.
    */
  var thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.native
}

object CreateThingTypeRequest {
  @scala.inline
  def apply(
    thingTypeName: ThingTypeName,
    tags: TagList = null,
    thingTypeProperties: ThingTypeProperties = null
  ): CreateThingTypeRequest = {
    val __obj = js.Dynamic.literal(thingTypeName = thingTypeName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (thingTypeProperties != null) __obj.updateDynamic("thingTypeProperties")(thingTypeProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateThingTypeRequest]
  }
}

