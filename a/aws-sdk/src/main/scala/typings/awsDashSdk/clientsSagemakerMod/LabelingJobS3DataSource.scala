package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelingJobS3DataSource extends js.Object {
  /**
    * The Amazon S3 location of the manifest file that describes the input data objects.
    */
  var ManifestS3Uri: S3Uri
}

object LabelingJobS3DataSource {
  @scala.inline
  def apply(ManifestS3Uri: S3Uri): LabelingJobS3DataSource = {
    val __obj = js.Dynamic.literal(ManifestS3Uri = ManifestS3Uri)
  
    __obj.asInstanceOf[LabelingJobS3DataSource]
  }
}

