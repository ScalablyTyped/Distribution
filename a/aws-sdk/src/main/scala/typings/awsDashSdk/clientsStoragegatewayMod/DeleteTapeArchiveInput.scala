package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTapeArchiveInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the virtual tape to delete from the virtual tape shelf (VTS).
    */
  var TapeARN: typings.awsDashSdk.clientsStoragegatewayMod.TapeARN = js.native
}

object DeleteTapeArchiveInput {
  @scala.inline
  def apply(TapeARN: TapeARN): DeleteTapeArchiveInput = {
    val __obj = js.Dynamic.literal(TapeARN = TapeARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteTapeArchiveInput]
  }
}

