package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkillsStoreSkill extends js.Object {
  /**
    * The URL where the skill icon resides.
    */
  var IconUrl: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.IconUrl] = js.undefined
  /**
    * Sample utterances that interact with the skill.
    */
  var SampleUtterances: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.SampleUtterances] = js.undefined
  /**
    * Short description about the skill.
    */
  var ShortDescription: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.ShortDescription] = js.undefined
  /**
    * Information about the skill.
    */
  var SkillDetails: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.SkillDetails] = js.undefined
  /**
    * The ARN of the skill.
    */
  var SkillId: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.SkillId] = js.undefined
  /**
    * The name of the skill.
    */
  var SkillName: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.SkillName] = js.undefined
  /**
    * Linking support for a skill.
    */
  var SupportsLinking: js.UndefOr[scala.Boolean] = js.undefined
}

object SkillsStoreSkill {
  @scala.inline
  def apply(
    IconUrl: IconUrl = null,
    SampleUtterances: SampleUtterances = null,
    ShortDescription: ShortDescription = null,
    SkillDetails: SkillDetails = null,
    SkillId: SkillId = null,
    SkillName: SkillName = null,
    SupportsLinking: js.UndefOr[scala.Boolean] = js.undefined
  ): SkillsStoreSkill = {
    val __obj = js.Dynamic.literal()
    if (IconUrl != null) __obj.updateDynamic("IconUrl")(IconUrl)
    if (SampleUtterances != null) __obj.updateDynamic("SampleUtterances")(SampleUtterances)
    if (ShortDescription != null) __obj.updateDynamic("ShortDescription")(ShortDescription)
    if (SkillDetails != null) __obj.updateDynamic("SkillDetails")(SkillDetails)
    if (SkillId != null) __obj.updateDynamic("SkillId")(SkillId)
    if (SkillName != null) __obj.updateDynamic("SkillName")(SkillName)
    if (!js.isUndefined(SupportsLinking)) __obj.updateDynamic("SupportsLinking")(SupportsLinking)
    __obj.asInstanceOf[SkillsStoreSkill]
  }
}

