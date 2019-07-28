package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutSlotTypeRequest extends js.Object {
  /**
    * Identifies a specific revision of the $LATEST version. When you create a new slot type, leave the checksum field blank. If you specify a checksum you get a BadRequestException exception. When you want to update a slot type, set the checksum field to the checksum of the most recent revision of the $LATEST version. If you don't specify the  checksum field, or if the checksum does not match the $LATEST version, you get a PreconditionFailedException exception.
    */
  var checksum: js.UndefOr[String] = js.undefined
  var createVersion: js.UndefOr[Boolean] = js.undefined
  /**
    * A description of the slot type.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * A list of EnumerationValue objects that defines the values that the slot type can take. Each value can have a list of synonyms, which are additional values that help train the machine learning model about the values that it resolves for a slot.  When Amazon Lex resolves a slot value, it generates a resolution list that contains up to five possible values for the slot. If you are using a Lambda function, this resolution list is passed to the function. If you are not using a Lambda function you can choose to return the value that the user entered or the first value in the resolution list as the slot value. The valueSelectionStrategy field indicates the option to use. 
    */
  var enumerationValues: js.UndefOr[EnumerationValues] = js.undefined
  /**
    * The name of the slot type. The name is not case sensitive.  The name can't match a built-in slot type name, or a built-in slot type name with "AMAZON." removed. For example, because there is a built-in slot type called AMAZON.DATE, you can't create a custom slot type called DATE. For a list of built-in slot types, see Slot Type Reference in the Alexa Skills Kit.
    */
  var name: SlotTypeName
  /**
    * Determines the slot resolution strategy that Amazon Lex uses to return slot type values. The field can be set to one of the following values:    ORIGINAL_VALUE - Returns the value entered by the user, if the user value is similar to the slot value.    TOP_RESOLUTION - If there is a resolution list for the slot, return the first value in the resolution list as the slot type value. If there is no resolution list, null is returned.   If you don't specify the valueSelectionStrategy, the default is ORIGINAL_VALUE.
    */
  var valueSelectionStrategy: js.UndefOr[SlotValueSelectionStrategy] = js.undefined
}

object PutSlotTypeRequest {
  @scala.inline
  def apply(
    name: SlotTypeName,
    checksum: String = null,
    createVersion: js.UndefOr[Boolean] = js.undefined,
    description: Description = null,
    enumerationValues: EnumerationValues = null,
    valueSelectionStrategy: SlotValueSelectionStrategy = null
  ): PutSlotTypeRequest = {
    val __obj = js.Dynamic.literal(name = name)
    if (checksum != null) __obj.updateDynamic("checksum")(checksum)
    if (!js.isUndefined(createVersion)) __obj.updateDynamic("createVersion")(createVersion)
    if (description != null) __obj.updateDynamic("description")(description)
    if (enumerationValues != null) __obj.updateDynamic("enumerationValues")(enumerationValues)
    if (valueSelectionStrategy != null) __obj.updateDynamic("valueSelectionStrategy")(valueSelectionStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSlotTypeRequest]
  }
}

