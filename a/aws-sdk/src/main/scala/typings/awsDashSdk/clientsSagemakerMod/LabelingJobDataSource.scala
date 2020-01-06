package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingJobDataSource extends js.Object {
  /**
    * The Amazon S3 location of the input data objects.
    */
  var S3DataSource: LabelingJobS3DataSource = js.native
}

object LabelingJobDataSource {
  @scala.inline
  def apply(S3DataSource: LabelingJobS3DataSource): LabelingJobDataSource = {
    val __obj = js.Dynamic.literal(S3DataSource = S3DataSource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LabelingJobDataSource]
  }
}

