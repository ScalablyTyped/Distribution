package typings.awsDashSdk.clientsMacieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3ResourceClassificationUpdate extends js.Object {
  /**
    * The name of the S3 bucket whose classification types you want to update.
    */
  var bucketName: BucketName = js.native
  /**
    * The classification type that you want to update for the resource associated with Amazon Macie. 
    */
  var classificationTypeUpdate: ClassificationTypeUpdate = js.native
  /**
    * The prefix of the S3 bucket whose classification types you want to update.
    */
  var prefix: js.UndefOr[Prefix] = js.native
}

object S3ResourceClassificationUpdate {
  @scala.inline
  def apply(bucketName: BucketName, classificationTypeUpdate: ClassificationTypeUpdate, prefix: Prefix = null): S3ResourceClassificationUpdate = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], classificationTypeUpdate = classificationTypeUpdate.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ResourceClassificationUpdate]
  }
}

