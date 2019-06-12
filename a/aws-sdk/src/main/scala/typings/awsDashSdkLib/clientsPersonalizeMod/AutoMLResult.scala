package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoMLResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the best recipe.
    */
  var bestRecipeArn: js.UndefOr[Arn] = js.undefined
}

object AutoMLResult {
  @scala.inline
  def apply(bestRecipeArn: Arn = null): AutoMLResult = {
    val __obj = js.Dynamic.literal()
    if (bestRecipeArn != null) __obj.updateDynamic("bestRecipeArn")(bestRecipeArn)
    __obj.asInstanceOf[AutoMLResult]
  }
}

