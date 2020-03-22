package typings.awsLambda

import typings.awsLambda.awsLambdaStrings.AWS
import typings.awsLambda.awsLambdaStrings.Custom
import typings.awsLambda.awsLambdaStrings.ThirdParty
import typings.awsLambda.codepipelineCloudwatchActionMod.CodePipelineActionCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCategory extends js.Object {
  var category: CodePipelineActionCategory
  var owner: AWS | Custom | ThirdParty
  var provider: String
  var version: Double
}

object AnonCategory {
  @scala.inline
  def apply(
    category: CodePipelineActionCategory,
    owner: AWS | Custom | ThirdParty,
    provider: String,
    version: Double
  ): AnonCategory = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCategory]
  }
}

