package typings.askmethatDashRating.askmethatDashRatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AskmethatRatingSteps extends js.Object

@JSImport("askmethat-rating", "AskmethatRatingSteps")
@js.native
object AskmethatRatingSteps extends js.Object {
  /**
    * Step 0.1 per 0.1
    */
  @js.native
  sealed trait DecimalStep extends AskmethatRatingSteps
  
  /**
    * Step 0.5 per 0.5
    */
  @js.native
  sealed trait HalfStep extends AskmethatRatingSteps
  
  /**
    * Step 1 per 1
    */
  @js.native
  sealed trait OnePerOneStep extends AskmethatRatingSteps
  
  /* 0 */ val DecimalStep: typings.askmethatDashRating.askmethatDashRatingMod.AskmethatRatingSteps.DecimalStep with Double = js.native
  /* 1 */ val HalfStep: typings.askmethatDashRating.askmethatDashRatingMod.AskmethatRatingSteps.HalfStep with Double = js.native
  /* 2 */ val OnePerOneStep: typings.askmethatDashRating.askmethatDashRatingMod.AskmethatRatingSteps.OnePerOneStep with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AskmethatRatingSteps with Double] = js.native
}

