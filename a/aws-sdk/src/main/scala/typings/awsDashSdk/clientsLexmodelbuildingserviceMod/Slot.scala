package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slot extends js.Object {
  /**
    * A description of the slot.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * The name of the slot.
    */
  var name: SlotName
  /**
    *  Directs Lex the order in which to elicit this slot value from the user. For example, if the intent has two slots with priorities 1 and 2, AWS Lex first elicits a value for the slot with priority 1. If multiple slots share the same priority, the order in which Lex elicits values is arbitrary.
    */
  var priority: js.UndefOr[Priority] = js.undefined
  /**
    *  A set of possible responses for the slot type used by text-based clients. A user chooses an option from the response card, instead of using text to reply. 
    */
  var responseCard: js.UndefOr[ResponseCard] = js.undefined
  /**
    *  If you know a specific pattern with which users might respond to an Amazon Lex request for a slot value, you can provide those utterances to improve accuracy. This is optional. In most cases, Amazon Lex is capable of understanding user utterances. 
    */
  var sampleUtterances: js.UndefOr[SlotUtteranceList] = js.undefined
  /**
    * Specifies whether the slot is required or optional. 
    */
  var slotConstraint: SlotConstraint
  /**
    * The type of the slot, either a custom slot type that you defined or one of the built-in slot types.
    */
  var slotType: js.UndefOr[CustomOrBuiltinSlotTypeName] = js.undefined
  /**
    * The version of the slot type.
    */
  var slotTypeVersion: js.UndefOr[Version] = js.undefined
  /**
    * The prompt that Amazon Lex uses to elicit the slot value from the user.
    */
  var valueElicitationPrompt: js.UndefOr[Prompt] = js.undefined
}

object Slot {
  @scala.inline
  def apply(
    name: SlotName,
    slotConstraint: SlotConstraint,
    description: Description = null,
    priority: Int | Double = null,
    responseCard: ResponseCard = null,
    sampleUtterances: SlotUtteranceList = null,
    slotType: CustomOrBuiltinSlotTypeName = null,
    slotTypeVersion: Version = null,
    valueElicitationPrompt: Prompt = null
  ): Slot = {
    val __obj = js.Dynamic.literal(name = name, slotConstraint = slotConstraint.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard)
    if (sampleUtterances != null) __obj.updateDynamic("sampleUtterances")(sampleUtterances)
    if (slotType != null) __obj.updateDynamic("slotType")(slotType)
    if (slotTypeVersion != null) __obj.updateDynamic("slotTypeVersion")(slotTypeVersion)
    if (valueElicitationPrompt != null) __obj.updateDynamic("valueElicitationPrompt")(valueElicitationPrompt)
    __obj.asInstanceOf[Slot]
  }
}

