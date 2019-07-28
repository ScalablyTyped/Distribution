package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSkillGroupRequest extends js.Object {
  /**
    * A unique, user-specified identifier for this request that ensures idempotency. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.ClientRequestToken] = js.undefined
  /**
    * The description for the skill group.
    */
  var Description: js.UndefOr[SkillGroupDescription] = js.undefined
  /**
    * The name for the skill group.
    */
  var SkillGroupName: typings.awsDashSdk.clientsAlexaforbusinessMod.SkillGroupName
}

object CreateSkillGroupRequest {
  @scala.inline
  def apply(
    SkillGroupName: SkillGroupName,
    ClientRequestToken: ClientRequestToken = null,
    Description: SkillGroupDescription = null
  ): CreateSkillGroupRequest = {
    val __obj = js.Dynamic.literal(SkillGroupName = SkillGroupName)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[CreateSkillGroupRequest]
  }
}

