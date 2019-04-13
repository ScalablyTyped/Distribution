package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelingJobDataSource extends js.Object {
  /**
    * The Amazon S3 location of the input data objects.
    */
  var S3DataSource: LabelingJobS3DataSource
}

object LabelingJobDataSource {
  @scala.inline
  def apply(S3DataSource: LabelingJobS3DataSource): LabelingJobDataSource = {
    val __obj = js.Dynamic.literal(S3DataSource = S3DataSource)
  
    __obj.asInstanceOf[LabelingJobDataSource]
  }
}

