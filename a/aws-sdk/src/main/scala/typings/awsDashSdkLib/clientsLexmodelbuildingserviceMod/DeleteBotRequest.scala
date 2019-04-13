package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBotRequest extends js.Object {
  /**
    * The name of the bot. The name is case sensitive. 
    */
  var name: BotName
}

object DeleteBotRequest {
  @scala.inline
  def apply(name: BotName): DeleteBotRequest = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[DeleteBotRequest]
  }
}

