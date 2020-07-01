package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSkillGroupRequest extends js.Object {
  /**
    * A unique, user-specified identifier for this request that ensures idempotency. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ClientRequestToken] = js.native
  /**
    * The description for the skill group.
    */
  var Description: js.UndefOr[SkillGroupDescription] = js.native
  /**
    * The name for the skill group.
    */
  var SkillGroupName: typings.awsSdk.alexaforbusinessMod.SkillGroupName = js.native
  /**
    * The tags for the skill group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateSkillGroupRequest {
  @scala.inline
  def apply(
    SkillGroupName: SkillGroupName,
    ClientRequestToken: ClientRequestToken = null,
    Description: SkillGroupDescription = null,
    Tags: TagList = null
  ): CreateSkillGroupRequest = {
    val __obj = js.Dynamic.literal(SkillGroupName = SkillGroupName.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSkillGroupRequest]
  }
}

