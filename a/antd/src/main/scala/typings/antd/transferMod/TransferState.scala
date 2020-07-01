package typings.antd.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferState extends js.Object {
  var sourceSelectedKeys: js.Array[String]
  var targetSelectedKeys: js.Array[String]
}

object TransferState {
  @scala.inline
  def apply(sourceSelectedKeys: js.Array[String], targetSelectedKeys: js.Array[String]): TransferState = {
    val __obj = js.Dynamic.literal(sourceSelectedKeys = sourceSelectedKeys.asInstanceOf[js.Any], targetSelectedKeys = targetSelectedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferState]
  }
}

