package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartGameSessionPlacementOutput extends js.Object {
  /**
    * Object that describes the newly created game session placement. This object includes all the information provided in the request, as well as start/end time stamps and placement status. 
    */
  var GameSessionPlacement: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.GameSessionPlacement] = js.undefined
}

object StartGameSessionPlacementOutput {
  @scala.inline
  def apply(GameSessionPlacement: GameSessionPlacement = null): StartGameSessionPlacementOutput = {
    val __obj = js.Dynamic.literal()
    if (GameSessionPlacement != null) __obj.updateDynamic("GameSessionPlacement")(GameSessionPlacement)
    __obj.asInstanceOf[StartGameSessionPlacementOutput]
  }
}

