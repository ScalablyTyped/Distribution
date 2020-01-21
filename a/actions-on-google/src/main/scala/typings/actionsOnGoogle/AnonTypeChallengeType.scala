package typings.actionsOnGoogle

import typings.actionsOnGoogle.apiV1Mod.challengeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypeChallengeType extends js.Object {
  var `type`: challengeType
}

object AnonTypeChallengeType {
  @scala.inline
  def apply(`type`: challengeType): AnonTypeChallengeType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeChallengeType]
  }
}

