package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRecipeResponse extends js.Object {
  /**
    * An object that describes the recipe.
    */
  var recipe: js.UndefOr[Recipe] = js.undefined
}

object DescribeRecipeResponse {
  @scala.inline
  def apply(recipe: Recipe = null): DescribeRecipeResponse = {
    val __obj = js.Dynamic.literal()
    if (recipe != null) __obj.updateDynamic("recipe")(recipe)
    __obj.asInstanceOf[DescribeRecipeResponse]
  }
}

