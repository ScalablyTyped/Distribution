package typings.awsDashSdk.clientsMacieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3ResourceClassificationUpdate extends js.Object {
  /**
    * The name of the S3 bucket whose classification types you want to update.
    */
  var bucketName: BucketName
  /**
    * The classification type that you want to update for the resource associated with Amazon Macie. 
    */
  var classificationTypeUpdate: ClassificationTypeUpdate
  /**
    * The prefix of the S3 bucket whose classification types you want to update.
    */
  var prefix: js.UndefOr[Prefix] = js.undefined
}

object S3ResourceClassificationUpdate {
  @scala.inline
  def apply(bucketName: BucketName, classificationTypeUpdate: ClassificationTypeUpdate, prefix: Prefix = null): S3ResourceClassificationUpdate = {
    val __obj = js.Dynamic.literal(bucketName = bucketName, classificationTypeUpdate = classificationTypeUpdate)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[S3ResourceClassificationUpdate]
  }
}

