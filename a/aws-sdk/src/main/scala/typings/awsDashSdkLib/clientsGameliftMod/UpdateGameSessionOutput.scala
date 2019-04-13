package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGameSessionOutput extends js.Object {
  /**
    * Object that contains the updated game session metadata.
    */
  var GameSession: js.UndefOr[GameSession] = js.undefined
}

object UpdateGameSessionOutput {
  @scala.inline
  def apply(GameSession: GameSession = null): UpdateGameSessionOutput = {
    val __obj = js.Dynamic.literal()
    if (GameSession != null) __obj.updateDynamic("GameSession")(GameSession)
    __obj.asInstanceOf[UpdateGameSessionOutput]
  }
}

