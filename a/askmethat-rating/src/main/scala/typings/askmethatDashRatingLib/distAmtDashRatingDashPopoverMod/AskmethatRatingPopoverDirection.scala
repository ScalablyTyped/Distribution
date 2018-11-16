package typings
package askmethatDashRatingLib.distAmtDashRatingDashPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AskmethatRatingPopoverDirection extends js.Object

@JSImport("askmethat-rating/dist/amt-rating-popover", "AskmethatRatingPopoverDirection")
@js.native
object AskmethatRatingPopoverDirection extends js.Object {
  @js.native
  sealed trait bottom
    extends askmethatDashRatingLib.distAmtDashRatingDashPopoverMod.AskmethatRatingPopoverDirection
  
  @js.native
  sealed trait top
    extends askmethatDashRatingLib.distAmtDashRatingDashPopoverMod.AskmethatRatingPopoverDirection
  
  /* 1 */ val bottom: bottom with scala.Double = js.native
  /* 0 */ val top: top with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    askmethatDashRatingLib.distAmtDashRatingDashPopoverMod.AskmethatRatingPopoverDirection with scala.Double
  ] = js.native
}

