package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGameSessionQueueOutput extends js.Object {
  /**
    * Object that describes the newly updated game session queue.
    */
  var GameSessionQueue: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.GameSessionQueue] = js.undefined
}

object UpdateGameSessionQueueOutput {
  @scala.inline
  def apply(GameSessionQueue: GameSessionQueue = null): UpdateGameSessionQueueOutput = {
    val __obj = js.Dynamic.literal()
    if (GameSessionQueue != null) __obj.updateDynamic("GameSessionQueue")(GameSessionQueue)
    __obj.asInstanceOf[UpdateGameSessionQueueOutput]
  }
}

