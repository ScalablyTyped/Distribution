package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecipeSummary extends js.Object {
  /**
    * The date and time (in Unix time) that the recipe was created.
    */
  var creationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The date and time (in Unix time) that the recipe was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The name of the recipe.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the recipe.
    */
  var recipeArn: js.UndefOr[Arn] = js.undefined
  /**
    * The status of the recipe.
    */
  var status: js.UndefOr[Status] = js.undefined
}

object RecipeSummary {
  @scala.inline
  def apply(
    creationDateTime: _Date = null,
    lastUpdatedDateTime: _Date = null,
    name: Name = null,
    recipeArn: Arn = null,
    status: Status = null
  ): RecipeSummary = {
    val __obj = js.Dynamic.literal()
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (recipeArn != null) __obj.updateDynamic("recipeArn")(recipeArn)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[RecipeSummary]
  }
}

