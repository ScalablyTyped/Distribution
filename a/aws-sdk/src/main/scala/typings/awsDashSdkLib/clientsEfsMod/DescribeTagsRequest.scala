package typings
package awsDashSdkLib.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTagsRequest extends js.Object {
  /**
    * The ID of the file system whose tag set you want to retrieve.
    */
  var FileSystemId: awsDashSdkLib.clientsEfsMod.FileSystemId
  /**
    * (Optional) An opaque pagination token returned from a previous DescribeTags operation (String). If present, it specifies to continue the list from where the previous call left off.
    */
  var Marker: js.UndefOr[Marker] = js.undefined
  /**
    * (Optional) The maximum number of file system tags to return in the response. Currently, this number is automatically set to 10, and other values are ignored. The response is paginated at 10 per page if you have more than 10 tags.
    */
  var MaxItems: js.UndefOr[MaxItems] = js.undefined
}

object DescribeTagsRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId, Marker: Marker = null, MaxItems: js.UndefOr[MaxItems] = js.undefined): DescribeTagsRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxItems)) __obj.updateDynamic("MaxItems")(MaxItems)
    __obj.asInstanceOf[DescribeTagsRequest]
  }
}

