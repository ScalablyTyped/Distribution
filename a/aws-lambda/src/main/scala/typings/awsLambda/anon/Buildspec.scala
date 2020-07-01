package typings.awsLambda.anon

import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildSourceLocationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buildspec extends js.Object {
  var buildspec: String
  var location: String
  var `type`: CodeBuildSourceLocationType
}

object Buildspec {
  @scala.inline
  def apply(buildspec: String, location: String, `type`: CodeBuildSourceLocationType): Buildspec = {
    val __obj = js.Dynamic.literal(buildspec = buildspec.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buildspec]
  }
}

