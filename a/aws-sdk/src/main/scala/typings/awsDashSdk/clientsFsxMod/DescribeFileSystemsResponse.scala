package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFileSystemsResponse extends js.Object {
  /**
    * An array of file system descriptions.
    */
  var FileSystems: js.UndefOr[typings.awsDashSdk.clientsFsxMod.FileSystems] = js.undefined
  /**
    * Present if there are more file systems than returned in the response (String). You can use the NextToken value in the later request to fetch the descriptions. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsFsxMod.NextToken] = js.undefined
}

object DescribeFileSystemsResponse {
  @scala.inline
  def apply(FileSystems: FileSystems = null, NextToken: NextToken = null): DescribeFileSystemsResponse = {
    val __obj = js.Dynamic.literal()
    if (FileSystems != null) __obj.updateDynamic("FileSystems")(FileSystems)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeFileSystemsResponse]
  }
}

