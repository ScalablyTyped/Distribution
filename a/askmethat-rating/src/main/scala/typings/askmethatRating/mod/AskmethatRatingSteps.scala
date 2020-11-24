package typings.askmethatRating.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AskmethatRatingSteps extends js.Object
@JSImport("askmethat-rating", "AskmethatRatingSteps")
@js.native
object AskmethatRatingSteps extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AskmethatRatingSteps with Double] = js.native
  
  /**
    * Step 0.1 per 0.1
    */
  @js.native
  sealed trait DecimalStep extends AskmethatRatingSteps
  /* 0 */ @js.native
  object DecimalStep extends TopLevel[DecimalStep with Double]
  
  /**
    * Step 0.5 per 0.5
    */
  @js.native
  sealed trait HalfStep extends AskmethatRatingSteps
  /* 1 */ @js.native
  object HalfStep extends TopLevel[HalfStep with Double]
  
  /**
    * Step 1 per 1
    */
  @js.native
  sealed trait OnePerOneStep extends AskmethatRatingSteps
  /* 2 */ @js.native
  object OnePerOneStep extends TopLevel[OnePerOneStep with Double]
}
