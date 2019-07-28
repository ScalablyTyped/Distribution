package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGameSessionQueueOutput extends js.Object {
  /**
    * Object that describes the newly created game session queue.
    */
  var GameSessionQueue: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.GameSessionQueue] = js.undefined
}

object CreateGameSessionQueueOutput {
  @scala.inline
  def apply(GameSessionQueue: GameSessionQueue = null): CreateGameSessionQueueOutput = {
    val __obj = js.Dynamic.literal()
    if (GameSessionQueue != null) __obj.updateDynamic("GameSessionQueue")(GameSessionQueue)
    __obj.asInstanceOf[CreateGameSessionQueueOutput]
  }
}

