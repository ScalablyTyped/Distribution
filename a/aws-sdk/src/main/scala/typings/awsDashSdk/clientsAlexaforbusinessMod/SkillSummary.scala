package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkillSummary extends js.Object {
  /**
    * Whether the skill is enabled under the user's account, or if it requires linking to be used.
    */
  var EnablementType: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.EnablementType] = js.native
  /**
    * The ARN of the skill summary.
    */
  var SkillId: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.SkillId] = js.native
  /**
    * The name of the skill.
    */
  var SkillName: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.SkillName] = js.native
  /**
    * Whether the skill is publicly available or is a private skill.
    */
  var SkillType: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.SkillType] = js.native
  /**
    * Linking support for a skill.
    */
  var SupportsLinking: js.UndefOr[scala.Boolean] = js.native
}

object SkillSummary {
  @scala.inline
  def apply(
    EnablementType: EnablementType = null,
    SkillId: SkillId = null,
    SkillName: SkillName = null,
    SkillType: SkillType = null,
    SupportsLinking: js.UndefOr[scala.Boolean] = js.undefined
  ): SkillSummary = {
    val __obj = js.Dynamic.literal()
    if (EnablementType != null) __obj.updateDynamic("EnablementType")(EnablementType.asInstanceOf[js.Any])
    if (SkillId != null) __obj.updateDynamic("SkillId")(SkillId.asInstanceOf[js.Any])
    if (SkillName != null) __obj.updateDynamic("SkillName")(SkillName.asInstanceOf[js.Any])
    if (SkillType != null) __obj.updateDynamic("SkillType")(SkillType.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportsLinking)) __obj.updateDynamic("SupportsLinking")(SupportsLinking.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkillSummary]
  }
}

