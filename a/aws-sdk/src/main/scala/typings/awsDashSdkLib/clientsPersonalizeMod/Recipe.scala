package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Recipe extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm that Amazon Personalize uses to train the model.
    */
  var algorithmArn: js.UndefOr[Arn] = js.undefined
  /**
    * The date and time (in Unix format) that the recipe was created.
    */
  var creationDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The description of the recipe.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * The ARN of the FeatureTransformation object.
    */
  var featureTransformationArn: js.UndefOr[Arn] = js.undefined
  /**
    * The date and time (in Unix format) that the recipe was last updated.
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
    * One of the following values:   PERSONALIZED_RANKING   RELATED_ITEMS   USER_PERSONALIZATION  
    */
  var recipeType: js.UndefOr[RecipeType] = js.undefined
  /**
    * The status of the recipe.
    */
  var status: js.UndefOr[Status] = js.undefined
}

object Recipe {
  @scala.inline
  def apply(
    algorithmArn: Arn = null,
    creationDateTime: _Date = null,
    description: Description = null,
    featureTransformationArn: Arn = null,
    lastUpdatedDateTime: _Date = null,
    name: Name = null,
    recipeArn: Arn = null,
    recipeType: RecipeType = null,
    status: Status = null
  ): Recipe = {
    val __obj = js.Dynamic.literal()
    if (algorithmArn != null) __obj.updateDynamic("algorithmArn")(algorithmArn)
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (featureTransformationArn != null) __obj.updateDynamic("featureTransformationArn")(featureTransformationArn)
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime)
    if (name != null) __obj.updateDynamic("name")(name)
    if (recipeArn != null) __obj.updateDynamic("recipeArn")(recipeArn)
    if (recipeType != null) __obj.updateDynamic("recipeType")(recipeType)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Recipe]
  }
}

