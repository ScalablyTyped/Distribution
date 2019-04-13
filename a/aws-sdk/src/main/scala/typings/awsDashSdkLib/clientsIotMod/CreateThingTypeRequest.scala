package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateThingTypeRequest extends js.Object {
  /**
    * Metadata which can be used to manage the thing type.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * The name of the thing type.
    */
  var thingTypeName: ThingTypeName
  /**
    * The ThingTypeProperties for the thing type to create. It contains information about the new thing type including a description, and a list of searchable thing attribute names.
    */
  var thingTypeProperties: js.UndefOr[ThingTypeProperties] = js.undefined
}

object CreateThingTypeRequest {
  @scala.inline
  def apply(
    thingTypeName: ThingTypeName,
    tags: TagList = null,
    thingTypeProperties: ThingTypeProperties = null
  ): CreateThingTypeRequest = {
    val __obj = js.Dynamic.literal(thingTypeName = thingTypeName)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (thingTypeProperties != null) __obj.updateDynamic("thingTypeProperties")(thingTypeProperties)
    __obj.asInstanceOf[CreateThingTypeRequest]
  }
}

