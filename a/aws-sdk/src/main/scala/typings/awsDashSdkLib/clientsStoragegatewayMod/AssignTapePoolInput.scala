package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignTapePoolInput extends js.Object {
  /**
    * The ID of the pool that you want to add your tape to for archiving. The tape in this pool is archived in the S3 storage class that is associated with the pool. When you use your backup application to eject the tape, the tape is archived directly into the storage class (Glacier or Deep Archive) that corresponds to the pool. Valid values: "GLACIER", "DEEP_ARCHIVE"
    */
  var PoolId: awsDashSdkLib.clientsStoragegatewayMod.PoolId
  /**
    * The unique Amazon Resource Name (ARN) of the virtual tape that you want to add to the tape pool.
    */
  var TapeARN: awsDashSdkLib.clientsStoragegatewayMod.TapeARN
}

object AssignTapePoolInput {
  @scala.inline
  def apply(PoolId: PoolId, TapeARN: TapeARN): AssignTapePoolInput = {
    val __obj = js.Dynamic.literal(PoolId = PoolId, TapeARN = TapeARN)
  
    __obj.asInstanceOf[AssignTapePoolInput]
  }
}

