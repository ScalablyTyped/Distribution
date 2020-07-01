package typings.awsLambda.anon

import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildEnvironmentVariableType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var `type`: js.UndefOr[CodeBuildEnvironmentVariableType] = js.undefined
  var value: String
}

object Name {
  @scala.inline
  def apply(name: String, value: String, `type`: CodeBuildEnvironmentVariableType = null): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

