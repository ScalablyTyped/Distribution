package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBotVersionRequest extends js.Object {
  /**
    * The name of the bot.
    */
  var name: BotName
  /**
    * The version of the bot to delete. You cannot delete the $LATEST version of the bot. To delete the $LATEST version, use the DeleteBot operation.
    */
  var version: NumericalVersion
}

object DeleteBotVersionRequest {
  @scala.inline
  def apply(name: BotName, version: NumericalVersion): DeleteBotVersionRequest = {
    val __obj = js.Dynamic.literal(name = name, version = version)
  
    __obj.asInstanceOf[DeleteBotVersionRequest]
  }
}

