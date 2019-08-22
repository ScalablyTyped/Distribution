package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  /**
    * The file system that is associated with a channel.
    */
  var FileSystemDataSource: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.FileSystemDataSource] = js.undefined
  /**
    * The S3 location of the data source that is associated with a channel.
    */
  var S3DataSource: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.S3DataSource] = js.undefined
}

object DataSource {
  @scala.inline
  def apply(FileSystemDataSource: FileSystemDataSource = null, S3DataSource: S3DataSource = null): DataSource = {
    val __obj = js.Dynamic.literal()
    if (FileSystemDataSource != null) __obj.updateDynamic("FileSystemDataSource")(FileSystemDataSource)
    if (S3DataSource != null) __obj.updateDynamic("S3DataSource")(S3DataSource)
    __obj.asInstanceOf[DataSource]
  }
}

