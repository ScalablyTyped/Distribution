package typings.askmethatDashRating.distAmtDashRatingDashPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AskmethatRatingPopoverDirection extends js.Object

@JSImport("askmethat-rating/dist/amt-rating-popover", "AskmethatRatingPopoverDirection")
@js.native
object AskmethatRatingPopoverDirection extends js.Object {
  @js.native
  sealed trait bottom extends AskmethatRatingPopoverDirection
  
  @js.native
  sealed trait top extends AskmethatRatingPopoverDirection
  
  /* 1 */ val bottom: typings.askmethatDashRating.distAmtDashRatingDashPopoverMod.AskmethatRatingPopoverDirection.bottom with Double = js.native
  /* 0 */ val top: typings.askmethatDashRating.distAmtDashRatingDashPopoverMod.AskmethatRatingPopoverDirection.top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AskmethatRatingPopoverDirection with Double] = js.native
}

