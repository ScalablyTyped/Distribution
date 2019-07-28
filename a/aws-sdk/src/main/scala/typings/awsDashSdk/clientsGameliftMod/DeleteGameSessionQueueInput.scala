package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGameSessionQueueInput extends js.Object {
  /**
    * Descriptive label that is associated with game session queue. Queue names must be unique within each region.
    */
  var Name: GameSessionQueueName
}

object DeleteGameSessionQueueInput {
  @scala.inline
  def apply(Name: GameSessionQueueName): DeleteGameSessionQueueInput = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteGameSessionQueueInput]
  }
}

