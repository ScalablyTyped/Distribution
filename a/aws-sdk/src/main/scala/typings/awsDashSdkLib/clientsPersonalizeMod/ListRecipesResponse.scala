package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRecipesResponse extends js.Object {
  /**
    * A token for getting the next set of recipes.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The list of available recipes.
    */
  var recipes: js.UndefOr[Recipes] = js.undefined
}

object ListRecipesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, recipes: Recipes = null): ListRecipesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (recipes != null) __obj.updateDynamic("recipes")(recipes)
    __obj.asInstanceOf[ListRecipesResponse]
  }
}

