package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkillSummary extends js.Object {
  /**
    * Whether the skill is enabled under the user's account, or if it requires linking to be used.
    */
  var EnablementType: js.UndefOr[EnablementType] = js.undefined
  /**
    * The ARN of the skill summary.
    */
  var SkillId: js.UndefOr[SkillId] = js.undefined
  /**
    * The name of the skill.
    */
  var SkillName: js.UndefOr[SkillName] = js.undefined
  /**
    * Whether the skill is publicly available or is a private skill.
    */
  var SkillType: js.UndefOr[SkillType] = js.undefined
  /**
    * Linking support for a skill.
    */
  var SupportsLinking: js.UndefOr[scala.Boolean] = js.undefined
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
    if (SkillId != null) __obj.updateDynamic("SkillId")(SkillId)
    if (SkillName != null) __obj.updateDynamic("SkillName")(SkillName)
    if (SkillType != null) __obj.updateDynamic("SkillType")(SkillType.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportsLinking)) __obj.updateDynamic("SupportsLinking")(SupportsLinking)
    __obj.asInstanceOf[SkillSummary]
  }
}

