package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopGameSessionPlacementInput extends js.Object {
  /**
    * Unique identifier for a game session placement to cancel.
    */
  var PlacementId: IdStringModel
}

object StopGameSessionPlacementInput {
  @scala.inline
  def apply(PlacementId: IdStringModel): StopGameSessionPlacementInput = {
    val __obj = js.Dynamic.literal(PlacementId = PlacementId)
  
    __obj.asInstanceOf[StopGameSessionPlacementInput]
  }
}

