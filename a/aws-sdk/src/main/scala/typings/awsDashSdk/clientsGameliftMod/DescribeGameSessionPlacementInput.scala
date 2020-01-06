package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGameSessionPlacementInput extends js.Object {
  /**
    * A unique identifier for a game session placement to retrieve.
    */
  var PlacementId: IdStringModel = js.native
}

object DescribeGameSessionPlacementInput {
  @scala.inline
  def apply(PlacementId: IdStringModel): DescribeGameSessionPlacementInput = {
    val __obj = js.Dynamic.literal(PlacementId = PlacementId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeGameSessionPlacementInput]
  }
}

