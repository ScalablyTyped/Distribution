package typings.awsDashSdk.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFileSystemsResponse extends js.Object {
  /**
    * An array of file system descriptions.
    */
  var FileSystems: js.UndefOr[FileSystemDescriptions] = js.undefined
  /**
    * Present if provided by caller in the request (String).
    */
  var Marker: js.UndefOr[typings.awsDashSdk.clientsEfsMod.Marker] = js.undefined
  /**
    * Present if there are more file systems than returned in the response (String). You can use the NextMarker in the subsequent request to fetch the descriptions.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
}

object DescribeFileSystemsResponse {
  @scala.inline
  def apply(FileSystems: FileSystemDescriptions = null, Marker: Marker = null, NextMarker: Marker = null): DescribeFileSystemsResponse = {
    val __obj = js.Dynamic.literal()
    if (FileSystems != null) __obj.updateDynamic("FileSystems")(FileSystems)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[DescribeFileSystemsResponse]
  }
}

