package typings.awsLambda.anon

import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildEnvironmentComputeType
import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildEnvironmentPullCredentialsType
import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildEnvironmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Computetype extends js.Object {
  var `compute-type`: CodeBuildEnvironmentComputeType
  var `environment-variables`: js.Array[Name]
  var image: String
  var `image-pull-credentials-type`: js.UndefOr[CodeBuildEnvironmentPullCredentialsType] = js.undefined
  var `privileged-mode`: Boolean
  var `type`: CodeBuildEnvironmentType
}

object Computetype {
  @scala.inline
  def apply(
    `compute-type`: CodeBuildEnvironmentComputeType,
    `environment-variables`: js.Array[Name],
    image: String,
    `privileged-mode`: Boolean,
    `type`: CodeBuildEnvironmentType,
    `image-pull-credentials-type`: CodeBuildEnvironmentPullCredentialsType = null
  ): Computetype = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.updateDynamic("compute-type")(`compute-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("environment-variables")(`environment-variables`.asInstanceOf[js.Any])
    __obj.updateDynamic("privileged-mode")(`privileged-mode`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (`image-pull-credentials-type` != null) __obj.updateDynamic("image-pull-credentials-type")(`image-pull-credentials-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Computetype]
  }
}

