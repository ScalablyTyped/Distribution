package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateNFSFileShareOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the updated file share. 
    */
  var FileShareARN: js.UndefOr[FileShareARN] = js.undefined
}

object UpdateNFSFileShareOutput {
  @scala.inline
  def apply(FileShareARN: FileShareARN = null): UpdateNFSFileShareOutput = {
    val __obj = js.Dynamic.literal()
    if (FileShareARN != null) __obj.updateDynamic("FileShareARN")(FileShareARN)
    __obj.asInstanceOf[UpdateNFSFileShareOutput]
  }
}

