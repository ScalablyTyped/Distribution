package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3ArtifactLocation extends js.Object {
  /**
    * The name of the Amazon S3 bucket.
    */
  var bucketName: S3BucketName
  /**
    * The key of the object in the Amazon S3 bucket, which uniquely identifies the object in the bucket.
    */
  var objectKey: S3ObjectKey
}

object S3ArtifactLocation {
  @scala.inline
  def apply(bucketName: S3BucketName, objectKey: S3ObjectKey): S3ArtifactLocation = {
    val __obj = js.Dynamic.literal(bucketName = bucketName, objectKey = objectKey)
  
    __obj.asInstanceOf[S3ArtifactLocation]
  }
}

