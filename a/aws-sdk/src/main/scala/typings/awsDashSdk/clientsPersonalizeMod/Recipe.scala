package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recipe extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm that Amazon Personalize uses to train the model.
    */
  var algorithmArn: js.UndefOr[Arn] = js.native
  /**
    * The date and time (in Unix format) that the recipe was created.
    */
  var creationDateTime: js.UndefOr[_Date] = js.native
  /**
    * The description of the recipe.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * The ARN of the FeatureTransformation object.
    */
  var featureTransformationArn: js.UndefOr[Arn] = js.native
  /**
    * The date and time (in Unix format) that the recipe was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[_Date] = js.native
  /**
    * The name of the recipe.
    */
  var name: js.UndefOr[Name] = js.native
  /**
    * The Amazon Resource Name (ARN) of the recipe.
    */
  var recipeArn: js.UndefOr[Arn] = js.native
  /**
    * One of the following values:   PERSONALIZED_RANKING   RELATED_ITEMS   USER_PERSONALIZATION  
    */
  var recipeType: js.UndefOr[RecipeType] = js.native
  /**
    * The status of the recipe.
    */
  var status: js.UndefOr[Status] = js.native
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
    if (algorithmArn != null) __obj.updateDynamic("algorithmArn")(algorithmArn.asInstanceOf[js.Any])
    if (creationDateTime != null) __obj.updateDynamic("creationDateTime")(creationDateTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (featureTransformationArn != null) __obj.updateDynamic("featureTransformationArn")(featureTransformationArn.asInstanceOf[js.Any])
    if (lastUpdatedDateTime != null) __obj.updateDynamic("lastUpdatedDateTime")(lastUpdatedDateTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (recipeArn != null) __obj.updateDynamic("recipeArn")(recipeArn.asInstanceOf[js.Any])
    if (recipeType != null) __obj.updateDynamic("recipeType")(recipeType.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recipe]
  }
}

