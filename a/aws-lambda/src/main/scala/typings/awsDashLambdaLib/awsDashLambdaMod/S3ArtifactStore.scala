package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3ArtifactStore extends js.Object {
  var s3Location: S3ArtifactLocation
  var `type`: awsDashLambdaLib.awsDashLambdaLibStrings.S3
}

object S3ArtifactStore {
  @scala.inline
  def apply(s3Location: S3ArtifactLocation, `type`: awsDashLambdaLib.awsDashLambdaLibStrings.S3): S3ArtifactStore = {
    val __obj = js.Dynamic.literal(s3Location = s3Location)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[S3ArtifactStore]
  }
}

