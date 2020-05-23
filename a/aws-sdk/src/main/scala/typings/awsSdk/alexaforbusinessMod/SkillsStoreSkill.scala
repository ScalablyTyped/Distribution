package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkillsStoreSkill extends js.Object {
  /**
    * The URL where the skill icon resides.
    */
  var IconUrl: js.UndefOr[typings.awsSdk.alexaforbusinessMod.IconUrl] = js.native
  /**
    * Sample utterances that interact with the skill.
    */
  var SampleUtterances: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SampleUtterances] = js.native
  /**
    * Short description about the skill.
    */
  var ShortDescription: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ShortDescription] = js.native
  /**
    * Information about the skill.
    */
  var SkillDetails: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SkillDetails] = js.native
  /**
    * The ARN of the skill.
    */
  var SkillId: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SkillId] = js.native
  /**
    * The name of the skill.
    */
  var SkillName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.SkillName] = js.native
  /**
    * Linking support for a skill.
    */
  var SupportsLinking: js.UndefOr[scala.Boolean] = js.native
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
    if (IconUrl != null) __obj.updateDynamic("IconUrl")(IconUrl.asInstanceOf[js.Any])
    if (SampleUtterances != null) __obj.updateDynamic("SampleUtterances")(SampleUtterances.asInstanceOf[js.Any])
    if (ShortDescription != null) __obj.updateDynamic("ShortDescription")(ShortDescription.asInstanceOf[js.Any])
    if (SkillDetails != null) __obj.updateDynamic("SkillDetails")(SkillDetails.asInstanceOf[js.Any])
    if (SkillId != null) __obj.updateDynamic("SkillId")(SkillId.asInstanceOf[js.Any])
    if (SkillName != null) __obj.updateDynamic("SkillName")(SkillName.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportsLinking)) __obj.updateDynamic("SupportsLinking")(SupportsLinking.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkillsStoreSkill]
  }
}

