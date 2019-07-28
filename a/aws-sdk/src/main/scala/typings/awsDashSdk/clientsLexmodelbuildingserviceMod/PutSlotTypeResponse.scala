package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutSlotTypeResponse extends js.Object {
  /**
    * Checksum of the $LATEST version of the slot type.
    */
  var checksum: js.UndefOr[String] = js.undefined
  var createVersion: js.UndefOr[Boolean] = js.undefined
  /**
    * The date that the slot type was created.
    */
  var createdDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * A description of the slot type.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * A list of EnumerationValue objects that defines the values that the slot type can take.
    */
  var enumerationValues: js.UndefOr[EnumerationValues] = js.undefined
  /**
    * The date that the slot type was updated. When you create a slot type, the creation date and last update date are the same.
    */
  var lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the slot type.
    */
  var name: js.UndefOr[SlotTypeName] = js.undefined
  /**
    * The slot resolution strategy that Amazon Lex uses to determine the value of the slot. For more information, see PutSlotType.
    */
  var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.undefined
  /**
    * The version of the slot type. For a new slot type, the version is always $LATEST. 
    */
  var version: js.UndefOr[Version] = js.undefined
}

object PutSlotTypeResponse {
  @scala.inline
  def apply(
    checksum: String = null,
    createVersion: js.UndefOr[Boolean] = js.undefined,
    createdDate: Timestamp = null,
    description: Description = null,
    enumerationValues: EnumerationValues = null,
    lastUpdatedDate: Timestamp = null,
    name: SlotTypeName = null,
    valueSelectionStrategy: SlotValueSelectionStrategy = null,
    version: Version = null
  ): PutSlotTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (checksum != null) __obj.updateDynamic("checksum")(checksum)
    if (!js.isUndefined(createVersion)) __obj.updateDynamic("createVersion")(createVersion)
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate)
    if (description != null) __obj.updateDynamic("description")(description)
    if (enumerationValues != null) __obj.updateDynamic("enumerationValues")(enumerationValues)
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate)
    if (name != null) __obj.updateDynamic("name")(name)
    if (valueSelectionStrategy != null) __obj.updateDynamic("valueSelectionStrategy")(valueSelectionStrategy.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PutSlotTypeResponse]
  }
}

