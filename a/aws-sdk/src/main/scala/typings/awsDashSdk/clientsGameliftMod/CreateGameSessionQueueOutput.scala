package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGameSessionQueueOutput extends js.Object {
  /**
    * An object that describes the newly created game session queue.
    */
  var GameSessionQueue: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.GameSessionQueue] = js.native
}

object CreateGameSessionQueueOutput {
  @scala.inline
  def apply(GameSessionQueue: GameSessionQueue = null): CreateGameSessionQueueOutput = {
    val __obj = js.Dynamic.literal()
    if (GameSessionQueue != null) __obj.updateDynamic("GameSessionQueue")(GameSessionQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGameSessionQueueOutput]
  }
}

