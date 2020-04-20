package typings.antd

import typings.antd.transferMod.TransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeftDataSource extends js.Object {
  var leftDataSource: js.Array[TransferItem]
  var rightDataSource: js.Array[TransferItem]
}

object AnonLeftDataSource {
  @scala.inline
  def apply(leftDataSource: js.Array[TransferItem], rightDataSource: js.Array[TransferItem]): AnonLeftDataSource = {
    val __obj = js.Dynamic.literal(leftDataSource = leftDataSource.asInstanceOf[js.Any], rightDataSource = rightDataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeftDataSource]
  }
}

