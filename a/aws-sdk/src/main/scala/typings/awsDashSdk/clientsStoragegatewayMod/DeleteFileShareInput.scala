package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFileShareInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the file share to be deleted. 
    */
  var FileShareARN: typings.awsDashSdk.clientsStoragegatewayMod.FileShareARN
  /**
    * If this value is set to true, the operation deletes a file share immediately and aborts all data uploads to AWS. Otherwise, the file share is not deleted until all data is uploaded to AWS. This process aborts the data upload process, and the file share enters the FORCE_DELETING status.
    */
  var ForceDelete: js.UndefOr[scala.Boolean] = js.undefined
}

object DeleteFileShareInput {
  @scala.inline
  def apply(FileShareARN: FileShareARN, ForceDelete: js.UndefOr[scala.Boolean] = js.undefined): DeleteFileShareInput = {
    val __obj = js.Dynamic.literal(FileShareARN = FileShareARN)
    if (!js.isUndefined(ForceDelete)) __obj.updateDynamic("ForceDelete")(ForceDelete)
    __obj.asInstanceOf[DeleteFileShareInput]
  }
}

