package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Destination extends js.Object {
  /**
    * The name of an S3 bucket within which harvested content will be exported
    */
  var BucketName: __string
  /**
    * The key in the specified S3 bucket where the harvested top-level manifest will be placed.
    */
  var ManifestKey: __string
  /**
    * The IAM role used to write to the specified S3 bucket
    */
  var RoleArn: __string
}

object S3Destination {
  @scala.inline
  def apply(BucketName: __string, ManifestKey: __string, RoleArn: __string): S3Destination = {
    val __obj = js.Dynamic.literal(BucketName = BucketName, ManifestKey = ManifestKey, RoleArn = RoleArn)
  
    __obj.asInstanceOf[S3Destination]
  }
}

