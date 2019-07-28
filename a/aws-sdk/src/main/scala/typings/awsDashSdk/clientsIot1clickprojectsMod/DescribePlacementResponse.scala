package typings.awsDashSdk.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePlacementResponse extends js.Object {
  /**
    * An object describing the placement.
    */
  var placement: PlacementDescription
}

object DescribePlacementResponse {
  @scala.inline
  def apply(placement: PlacementDescription): DescribePlacementResponse = {
    val __obj = js.Dynamic.literal(placement = placement)
  
    __obj.asInstanceOf[DescribePlacementResponse]
  }
}

