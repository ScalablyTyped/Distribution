package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3ArtifactLocation extends js.Object {
  var bucketName: String
  var objectKey: String
}

object S3ArtifactLocation {
  @scala.inline
  def apply(bucketName: String, objectKey: String): S3ArtifactLocation = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], objectKey = objectKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[S3ArtifactLocation]
  }
}

