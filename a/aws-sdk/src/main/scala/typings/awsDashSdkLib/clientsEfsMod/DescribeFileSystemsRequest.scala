package typings
package awsDashSdkLib.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFileSystemsRequest extends js.Object {
  /**
    * (Optional) Restricts the list to the file system with this creation token (String). You specify a creation token when you create an Amazon EFS file system.
    */
  var CreationToken: js.UndefOr[CreationToken] = js.undefined
  /**
    * (Optional) ID of the file system whose description you want to retrieve (String).
    */
  var FileSystemId: js.UndefOr[FileSystemId] = js.undefined
  /**
    * (Optional) Opaque pagination token returned from a previous DescribeFileSystems operation (String). If present, specifies to continue the list from where the returning call had left off. 
    */
  var Marker: js.UndefOr[Marker] = js.undefined
  /**
    * (Optional) Specifies the maximum number of file systems to return in the response (integer). Currently, this number is automatically set to 10. 
    */
  var MaxItems: js.UndefOr[MaxItems] = js.undefined
}

object DescribeFileSystemsRequest {
  @scala.inline
  def apply(
    CreationToken: CreationToken = null,
    FileSystemId: FileSystemId = null,
    Marker: Marker = null,
    MaxItems: js.UndefOr[MaxItems] = js.undefined
  ): DescribeFileSystemsRequest = {
    val __obj = js.Dynamic.literal()
    if (CreationToken != null) __obj.updateDynamic("CreationToken")(CreationToken)
    if (FileSystemId != null) __obj.updateDynamic("FileSystemId")(FileSystemId)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (!js.isUndefined(MaxItems)) __obj.updateDynamic("MaxItems")(MaxItems)
    __obj.asInstanceOf[DescribeFileSystemsRequest]
  }
}

