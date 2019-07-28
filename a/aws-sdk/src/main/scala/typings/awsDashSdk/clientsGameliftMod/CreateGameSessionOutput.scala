package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGameSessionOutput extends js.Object {
  /**
    * Object that describes the newly created game session record.
    */
  var GameSession: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.GameSession] = js.undefined
}

object CreateGameSessionOutput {
  @scala.inline
  def apply(GameSession: GameSession = null): CreateGameSessionOutput = {
    val __obj = js.Dynamic.literal()
    if (GameSession != null) __obj.updateDynamic("GameSession")(GameSession)
    __obj.asInstanceOf[CreateGameSessionOutput]
  }
}

