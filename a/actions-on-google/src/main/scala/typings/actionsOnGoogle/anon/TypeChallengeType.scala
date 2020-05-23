package typings.actionsOnGoogle.anon

import typings.actionsOnGoogle.apiV1Mod.challengeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeChallengeType extends js.Object {
  var `type`: challengeType
}

object TypeChallengeType {
  @scala.inline
  def apply(`type`: challengeType): TypeChallengeType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeChallengeType]
  }
}

