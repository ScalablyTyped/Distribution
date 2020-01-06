package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSource extends js.Object {
  /**
    * The file system that is associated with a channel.
    */
  var FileSystemDataSource: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.FileSystemDataSource] = js.native
  /**
    * The S3 location of the data source that is associated with a channel.
    */
  var S3DataSource: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.S3DataSource] = js.native
}

object DataSource {
  @scala.inline
  def apply(FileSystemDataSource: FileSystemDataSource = null, S3DataSource: S3DataSource = null): DataSource = {
    val __obj = js.Dynamic.literal()
    if (FileSystemDataSource != null) __obj.updateDynamic("FileSystemDataSource")(FileSystemDataSource.asInstanceOf[js.Any])
    if (S3DataSource != null) __obj.updateDynamic("S3DataSource")(S3DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
}

