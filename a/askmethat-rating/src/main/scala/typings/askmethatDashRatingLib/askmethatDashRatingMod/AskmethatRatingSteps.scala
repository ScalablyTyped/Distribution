package typings
package askmethatDashRatingLib.askmethatDashRatingMod

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
  sealed trait DecimalStep
    extends askmethatDashRatingLib.askmethatDashRatingMod.AskmethatRatingSteps
  
  /**
       * Step 0.5 per 0.5
       */
  @js.native
  sealed trait HalfStep
    extends askmethatDashRatingLib.askmethatDashRatingMod.AskmethatRatingSteps
  
  /**
       * Step 1 per 1
       */
  @js.native
  sealed trait OnePerOneStep
    extends askmethatDashRatingLib.askmethatDashRatingMod.AskmethatRatingSteps
  
  /* 0 */ val DecimalStep: DecimalStep with scala.Double = js.native
  /* 1 */ val HalfStep: HalfStep with scala.Double = js.native
  /* 2 */ val OnePerOneStep: OnePerOneStep with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    askmethatDashRatingLib.askmethatDashRatingMod.AskmethatRatingSteps with scala.Double
  ] = js.native
}

