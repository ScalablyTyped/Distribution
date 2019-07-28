package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGameSessionPlacementOutput extends js.Object {
  /**
    * Object that describes the requested game session placement.
    */
  var GameSessionPlacement: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.GameSessionPlacement] = js.undefined
}

object DescribeGameSessionPlacementOutput {
  @scala.inline
  def apply(GameSessionPlacement: GameSessionPlacement = null): DescribeGameSessionPlacementOutput = {
    val __obj = js.Dynamic.literal()
    if (GameSessionPlacement != null) __obj.updateDynamic("GameSessionPlacement")(GameSessionPlacement)
    __obj.asInstanceOf[DescribeGameSessionPlacementOutput]
  }
}

