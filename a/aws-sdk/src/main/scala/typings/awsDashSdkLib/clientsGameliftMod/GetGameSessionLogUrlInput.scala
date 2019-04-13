package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGameSessionLogUrlInput extends js.Object {
  /**
    * Unique identifier for the game session to get logs for.
    */
  var GameSessionId: ArnStringModel
}

object GetGameSessionLogUrlInput {
  @scala.inline
  def apply(GameSessionId: ArnStringModel): GetGameSessionLogUrlInput = {
    val __obj = js.Dynamic.literal(GameSessionId = GameSessionId)
  
    __obj.asInstanceOf[GetGameSessionLogUrlInput]
  }
}

