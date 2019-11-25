package typings.antd.esTransferListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferListState extends js.Object {
  /** Filter input value */
  var filterValue: String
}

object TransferListState {
  @scala.inline
  def apply(filterValue: String): TransferListState = {
    val __obj = js.Dynamic.literal(filterValue = filterValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransferListState]
  }
}

