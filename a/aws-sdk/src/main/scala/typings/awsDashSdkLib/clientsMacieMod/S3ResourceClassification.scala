package typings
package awsDashSdkLib.clientsMacieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3ResourceClassification extends js.Object {
  /**
    * The name of the S3 bucket that you want to associate with Amazon Macie.
    */
  var bucketName: BucketName
  /**
    * The classification type that you want to specify for the resource associated with Amazon Macie. 
    */
  var classificationType: ClassificationType
  /**
    * The prefix of the S3 bucket that you want to associate with Amazon Macie.
    */
  var prefix: js.UndefOr[Prefix] = js.undefined
}

object S3ResourceClassification {
  @scala.inline
  def apply(bucketName: BucketName, classificationType: ClassificationType, prefix: Prefix = null): S3ResourceClassification = {
    val __obj = js.Dynamic.literal(bucketName = bucketName, classificationType = classificationType)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[S3ResourceClassification]
  }
}

