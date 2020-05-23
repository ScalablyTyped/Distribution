package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.AWS
import typings.awsLambda.awsLambdaStrings.ThirdParty
import typings.awsLambda.codepipelineCloudwatchActionMod.CodePipelineActionCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  var category: CodePipelineActionCategory
  var owner: AWS | typings.awsLambda.awsLambdaStrings.Custom | ThirdParty
  var provider: String
  var version: Double
}

object Category {
  @scala.inline
  def apply(
    category: CodePipelineActionCategory,
    owner: AWS | typings.awsLambda.awsLambdaStrings.Custom | ThirdParty,
    provider: String,
    version: Double
  ): Category = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Category]
  }
}

