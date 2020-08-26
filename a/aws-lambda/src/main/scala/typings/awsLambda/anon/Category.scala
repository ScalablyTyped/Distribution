package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.AWS
import typings.awsLambda.awsLambdaStrings.ThirdParty
import typings.awsLambda.codepipelineCloudwatchActionMod.CodePipelineActionCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Category extends js.Object {
  var category: CodePipelineActionCategory = js.native
  var owner: AWS | typings.awsLambda.awsLambdaStrings.Custom | ThirdParty = js.native
  var provider: String = js.native
  var version: Double = js.native
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
  @scala.inline
  implicit class CategoryOps[Self <: Category] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCategory(value: CodePipelineActionCategory): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: AWS | typings.awsLambda.awsLambdaStrings.Custom | ThirdParty): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

