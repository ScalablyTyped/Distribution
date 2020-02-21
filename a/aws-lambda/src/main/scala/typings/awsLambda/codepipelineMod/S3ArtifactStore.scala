package typings.awsLambda.codepipelineMod

import typings.awsLambda.awsLambdaStrings.S3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3ArtifactStore extends js.Object {
  var s3Location: S3ArtifactLocation
  var `type`: S3
}

object S3ArtifactStore {
  @scala.inline
  def apply(s3Location: S3ArtifactLocation, `type`: S3): S3ArtifactStore = {
    val __obj = js.Dynamic.literal(s3Location = s3Location.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ArtifactStore]
  }
}

