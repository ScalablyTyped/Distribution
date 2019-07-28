package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePlayerSessionInput extends js.Object {
  /**
    * Unique identifier for the game session to add a player to.
    */
  var GameSessionId: ArnStringModel
  /**
    * Developer-defined information related to a player. Amazon GameLift does not use this data, so it can be formatted as needed for use in the game.
    */
  var PlayerData: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.PlayerData] = js.undefined
  /**
    * Unique identifier for a player. Player IDs are developer-defined.
    */
  var PlayerId: NonZeroAndMaxString
}

object CreatePlayerSessionInput {
  @scala.inline
  def apply(GameSessionId: ArnStringModel, PlayerId: NonZeroAndMaxString, PlayerData: PlayerData = null): CreatePlayerSessionInput = {
    val __obj = js.Dynamic.literal(GameSessionId = GameSessionId, PlayerId = PlayerId)
    if (PlayerData != null) __obj.updateDynamic("PlayerData")(PlayerData)
    __obj.asInstanceOf[CreatePlayerSessionInput]
  }
}

