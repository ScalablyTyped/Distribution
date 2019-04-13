package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFileOutput extends js.Object {
  /**
    * The blob ID of the object that represents the file content.
    */
  var blobId: ObjectId
  /**
    * The full commit ID of the commit that contains the content returned by GetFile.
    */
  var commitId: ObjectId
  /**
    * The base-64 encoded binary data object that represents the content of the file.
    */
  var fileContent: FileContent
  /**
    * The extrapolated file mode permissions of the blob. Valid values include strings such as EXECUTABLE and not numeric values.  The file mode permissions returned by this API are not the standard file mode permission values, such as 100644, but rather extrapolated values. See below for a full list of supported return values. 
    */
  var fileMode: FileModeTypeEnum
  /**
    * The fully qualified path to the specified file. This returns the name and extension of the file.
    */
  var filePath: Path
  /**
    * The size of the contents of the file, in bytes.
    */
  var fileSize: ObjectSize
}

object GetFileOutput {
  @scala.inline
  def apply(
    blobId: ObjectId,
    commitId: ObjectId,
    fileContent: FileContent,
    fileMode: FileModeTypeEnum,
    filePath: Path,
    fileSize: ObjectSize
  ): GetFileOutput = {
    val __obj = js.Dynamic.literal(blobId = blobId, commitId = commitId, fileContent = fileContent.asInstanceOf[js.Any], fileMode = fileMode.asInstanceOf[js.Any], filePath = filePath, fileSize = fileSize)
  
    __obj.asInstanceOf[GetFileOutput]
  }
}

