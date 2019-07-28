package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRecipeRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the recipe to describe.
    */
  var recipeArn: Arn
}

object DescribeRecipeRequest {
  @scala.inline
  def apply(recipeArn: Arn): DescribeRecipeRequest = {
    val __obj = js.Dynamic.literal(recipeArn = recipeArn)
  
    __obj.asInstanceOf[DescribeRecipeRequest]
  }
}

