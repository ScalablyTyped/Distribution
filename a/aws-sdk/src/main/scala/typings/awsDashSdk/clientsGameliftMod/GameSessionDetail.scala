package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameSessionDetail extends js.Object {
  /**
    * Object that describes a game session.
    */
  var GameSession: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.GameSession] = js.undefined
  /**
    * Current status of protection for the game session.    NoProtection -- The game session can be terminated during a scale-down event.    FullProtection -- If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
    */
  var ProtectionPolicy: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.ProtectionPolicy] = js.undefined
}

object GameSessionDetail {
  @scala.inline
  def apply(GameSession: GameSession = null, ProtectionPolicy: ProtectionPolicy = null): GameSessionDetail = {
    val __obj = js.Dynamic.literal()
    if (GameSession != null) __obj.updateDynamic("GameSession")(GameSession)
    if (ProtectionPolicy != null) __obj.updateDynamic("ProtectionPolicy")(ProtectionPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSessionDetail]
  }
}

