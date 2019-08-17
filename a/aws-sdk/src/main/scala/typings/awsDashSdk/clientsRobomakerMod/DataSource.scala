package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  /**
    * The name of the data source.
    */
  var name: js.UndefOr[Name] = js.undefined
  /**
    * The S3 bucket where the data files are located.
    */
  var s3Bucket: js.UndefOr[S3Bucket] = js.undefined
  /**
    * The list of S3 keys identifying the data source files.
    */
  var s3Keys: js.UndefOr[S3KeyOutputs] = js.undefined
}

object DataSource {
  @scala.inline
  def apply(name: Name = null, s3Bucket: S3Bucket = null, s3Keys: S3KeyOutputs = null): DataSource = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (s3Bucket != null) __obj.updateDynamic("s3Bucket")(s3Bucket)
    if (s3Keys != null) __obj.updateDynamic("s3Keys")(s3Keys)
    __obj.asInstanceOf[DataSource]
  }
}

