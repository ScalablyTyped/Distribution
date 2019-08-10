package typings.awsDashSdk.clientsLexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSessionResponse extends js.Object {
  /**
    * The alias in use for the bot associated with the session data.
    */
  var botAlias: js.UndefOr[BotAlias] = js.undefined
  /**
    * The name of the bot associated with the session data.
    */
  var botName: js.UndefOr[BotName] = js.undefined
  /**
    * The unique identifier for the session.
    */
  var sessionId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the client application user.
    */
  var userId: js.UndefOr[UserId] = js.undefined
}

object DeleteSessionResponse {
  @scala.inline
  def apply(
    botAlias: BotAlias = null,
    botName: BotName = null,
    sessionId: String = null,
    userId: UserId = null
  ): DeleteSessionResponse = {
    val __obj = js.Dynamic.literal()
    if (botAlias != null) __obj.updateDynamic("botAlias")(botAlias)
    if (botName != null) __obj.updateDynamic("botName")(botName)
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId)
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[DeleteSessionResponse]
  }
}

