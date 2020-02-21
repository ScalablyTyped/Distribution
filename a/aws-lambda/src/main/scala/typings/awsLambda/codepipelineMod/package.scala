package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codepipelineMod {
  type ArtifactLocation = typings.awsLambda.codepipelineMod.S3ArtifactStore
  type CodePipelineHandler = typings.awsLambda.handerMod.Handler[typings.awsLambda.codepipelineMod.CodePipelineEvent, scala.Unit]
}
