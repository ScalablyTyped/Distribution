package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTapeArchiveInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the virtual tape to delete from the virtual tape shelf (VTS).
    */
  var TapeARN: awsDashSdkLib.clientsStoragegatewayMod.TapeARN
}

object DeleteTapeArchiveInput {
  @scala.inline
  def apply(TapeARN: TapeARN): DeleteTapeArchiveInput = {
    val __obj = js.Dynamic.literal(TapeARN = TapeARN)
  
    __obj.asInstanceOf[DeleteTapeArchiveInput]
  }
}

