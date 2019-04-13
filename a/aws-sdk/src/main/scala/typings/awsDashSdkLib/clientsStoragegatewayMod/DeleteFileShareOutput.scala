package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFileShareOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the deleted file share. 
    */
  var FileShareARN: js.UndefOr[FileShareARN] = js.undefined
}

object DeleteFileShareOutput {
  @scala.inline
  def apply(FileShareARN: FileShareARN = null): DeleteFileShareOutput = {
    val __obj = js.Dynamic.literal()
    if (FileShareARN != null) __obj.updateDynamic("FileShareARN")(FileShareARN)
    __obj.asInstanceOf[DeleteFileShareOutput]
  }
}

