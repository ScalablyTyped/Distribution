package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRecipesRequest extends js.Object {
  /**
    * The maximum number of recipes to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A token returned from the previous call to ListRecipes for getting the next set of recipes (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The default is SERVICE.
    */
  var recipeProvider: js.UndefOr[RecipeProvider] = js.undefined
}

object ListRecipesRequest {
  @scala.inline
  def apply(
    maxResults: js.UndefOr[MaxResults] = js.undefined,
    nextToken: NextToken = null,
    recipeProvider: RecipeProvider = null
  ): ListRecipesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (recipeProvider != null) __obj.updateDynamic("recipeProvider")(recipeProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecipesRequest]
  }
}

