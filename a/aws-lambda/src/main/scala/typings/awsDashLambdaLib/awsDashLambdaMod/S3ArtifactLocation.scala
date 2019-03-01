package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3ArtifactLocation extends js.Object {
  var bucketName: java.lang.String
  var objectKey: java.lang.String
}

object S3ArtifactLocation {
  @scala.inline
  def apply(bucketName: java.lang.String, objectKey: java.lang.String): S3ArtifactLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bucketName")(bucketName)
    __obj.updateDynamic("objectKey")(objectKey)
    __obj.asInstanceOf[S3ArtifactLocation]
  }
}

