package typings.askmethatDashRating.askmethatDashRatingMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AskmethatRatingSteps with Double] = js.native
  /* 0 */ @js.native
  object DecimalStep extends TopLevel[DecimalStep with Double]
  
  /* 1 */ @js.native
  object HalfStep extends TopLevel[HalfStep with Double]
  
  /* 2 */ @js.native
  object OnePerOneStep extends TopLevel[OnePerOneStep with Double]
  
}

