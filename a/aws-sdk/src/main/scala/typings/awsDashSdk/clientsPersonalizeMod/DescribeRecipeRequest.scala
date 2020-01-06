package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRecipeRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the recipe to describe.
    */
  var recipeArn: Arn = js.native
}

object DescribeRecipeRequest {
  @scala.inline
  def apply(recipeArn: Arn): DescribeRecipeRequest = {
    val __obj = js.Dynamic.literal(recipeArn = recipeArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeRecipeRequest]
  }
}

