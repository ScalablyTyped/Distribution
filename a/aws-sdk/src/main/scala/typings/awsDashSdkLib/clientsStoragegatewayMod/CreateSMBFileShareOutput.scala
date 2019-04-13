package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSMBFileShareOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the newly created file share. 
    */
  var FileShareARN: js.UndefOr[FileShareARN] = js.undefined
}

object CreateSMBFileShareOutput {
  @scala.inline
  def apply(FileShareARN: FileShareARN = null): CreateSMBFileShareOutput = {
    val __obj = js.Dynamic.literal()
    if (FileShareARN != null) __obj.updateDynamic("FileShareARN")(FileShareARN)
    __obj.asInstanceOf[CreateSMBFileShareOutput]
  }
}

