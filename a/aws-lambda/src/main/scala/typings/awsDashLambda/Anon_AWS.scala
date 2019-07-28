package typings.awsDashLambda

import typings.awsDashLambda.awsDashLambdaMod.CodePipelineActionCategory
import typings.awsDashLambda.awsDashLambdaStrings.AWS
import typings.awsDashLambda.awsDashLambdaStrings.Custom
import typings.awsDashLambda.awsDashLambdaStrings.ThirdParty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AWS extends js.Object {
  var category: CodePipelineActionCategory
  var owner: AWS | Custom | ThirdParty
  var provider: String
  var version: Double
}

object Anon_AWS {
  @scala.inline
  def apply(
    category: CodePipelineActionCategory,
    owner: AWS | Custom | ThirdParty,
    provider: String,
    version: Double
  ): Anon_AWS = {
    val __obj = js.Dynamic.literal(category = category, owner = owner.asInstanceOf[js.Any], provider = provider, version = version)
  
    __obj.asInstanceOf[Anon_AWS]
  }
}

