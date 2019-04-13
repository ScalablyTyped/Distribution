package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBotAliasRequest extends js.Object {
  /**
    * The name of the bot.
    */
  var botName: BotName
  /**
    * The version of the bot.
    */
  var botVersion: Version
  /**
    * Identifies a specific revision of the $LATEST version. When you create a new bot alias, leave the checksum field blank. If you specify a checksum you get a BadRequestException exception. When you want to update a bot alias, set the checksum field to the checksum of the most recent revision of the $LATEST version. If you don't specify the  checksum field, or if the checksum does not match the $LATEST version, you get a PreconditionFailedException exception.
    */
  var checksum: js.UndefOr[String] = js.undefined
  /**
    * A description of the alias.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * The name of the alias. The name is not case sensitive.
    */
  var name: AliasName
}

object PutBotAliasRequest {
  @scala.inline
  def apply(
    botName: BotName,
    botVersion: Version,
    name: AliasName,
    checksum: String = null,
    description: Description = null
  ): PutBotAliasRequest = {
    val __obj = js.Dynamic.literal(botName = botName, botVersion = botVersion, name = name)
    if (checksum != null) __obj.updateDynamic("checksum")(checksum)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[PutBotAliasRequest]
  }
}

