package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSMBFileShareOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the updated SMB file share. 
    */
  var FileShareARN: js.UndefOr[FileShareARN] = js.undefined
}

object UpdateSMBFileShareOutput {
  @scala.inline
  def apply(FileShareARN: FileShareARN = null): UpdateSMBFileShareOutput = {
    val __obj = js.Dynamic.literal()
    if (FileShareARN != null) __obj.updateDynamic("FileShareARN")(FileShareARN)
    __obj.asInstanceOf[UpdateSMBFileShareOutput]
  }
}

