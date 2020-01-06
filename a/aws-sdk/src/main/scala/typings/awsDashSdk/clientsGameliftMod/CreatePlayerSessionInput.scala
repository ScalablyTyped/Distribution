package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePlayerSessionInput extends js.Object {
  /**
    * A unique identifier for the game session to add a player to.
    */
  var GameSessionId: ArnStringModel = js.native
  /**
    * Developer-defined information related to a player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game.
    */
  var PlayerData: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.PlayerData] = js.native
  /**
    * A unique identifier for a player. Player IDs are developer-defined.
    */
  var PlayerId: NonZeroAndMaxString = js.native
}

object CreatePlayerSessionInput {
  @scala.inline
  def apply(GameSessionId: ArnStringModel, PlayerId: NonZeroAndMaxString, PlayerData: PlayerData = null): CreatePlayerSessionInput = {
    val __obj = js.Dynamic.literal(GameSessionId = GameSessionId.asInstanceOf[js.Any], PlayerId = PlayerId.asInstanceOf[js.Any])
    if (PlayerData != null) __obj.updateDynamic("PlayerData")(PlayerData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlayerSessionInput]
  }
}

