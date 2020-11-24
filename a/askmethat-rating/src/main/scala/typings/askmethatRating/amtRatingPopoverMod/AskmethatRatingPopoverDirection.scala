package typings.askmethatRating.amtRatingPopoverMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AskmethatRatingPopoverDirection extends js.Object
@JSImport("askmethat-rating/dist/amt-rating-popover", "AskmethatRatingPopoverDirection")
@js.native
object AskmethatRatingPopoverDirection extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AskmethatRatingPopoverDirection with Double] = js.native
  
  @js.native
  sealed trait bottom extends AskmethatRatingPopoverDirection
  /* 1 */ @js.native
  object bottom extends TopLevel[bottom with Double]
  
  @js.native
  sealed trait top extends AskmethatRatingPopoverDirection
  /* 0 */ @js.native
  object top extends TopLevel[top with Double]
}
