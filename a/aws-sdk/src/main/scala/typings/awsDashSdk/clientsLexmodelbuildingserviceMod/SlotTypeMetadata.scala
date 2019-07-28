package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlotTypeMetadata extends js.Object {
  /**
    * The date that the slot type was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * A description of the slot type.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * The date that the slot type was updated. When you create a resource, the creation date and last updated date are the same. 
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the slot type.
    */
  var name: js.UndefOr[SlotTypeName] = js.undefined
  /**
    * The version of the slot type.
    */
  var version: js.UndefOr[Version] = js.undefined
}

object SlotTypeMetadata {
  @scala.inline
  def apply(
    createdDate: Timestamp = null,
    description: Description = null,
    lastUpdatedDate: Timestamp = null,
    name: SlotTypeName = null,
    version: Version = null
  ): SlotTypeMetadata = {
    val __obj = js.Dynamic.literal()
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate)
    if (description != null) __obj.updateDynamic("description")(description)
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate)
    if (name != null) __obj.updateDynamic("name")(name)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[SlotTypeMetadata]
  }
}

