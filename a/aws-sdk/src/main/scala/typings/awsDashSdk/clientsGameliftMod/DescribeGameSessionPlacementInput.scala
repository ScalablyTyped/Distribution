package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGameSessionPlacementInput extends js.Object {
  /**
    * Unique identifier for a game session placement to retrieve.
    */
  var PlacementId: IdStringModel
}

object DescribeGameSessionPlacementInput {
  @scala.inline
  def apply(PlacementId: IdStringModel): DescribeGameSessionPlacementInput = {
    val __obj = js.Dynamic.literal(PlacementId = PlacementId)
  
    __obj.asInstanceOf[DescribeGameSessionPlacementInput]
  }
}

