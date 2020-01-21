package typings.askmethatRating.amtRatingPopoverMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AskmethatRatingPopoverDirection with Double] = js.native
  /* 1 */ @js.native
  object bottom extends TopLevel[bottom with Double]
  
  /* 0 */ @js.native
  object top extends TopLevel[top with Double]
  
}

