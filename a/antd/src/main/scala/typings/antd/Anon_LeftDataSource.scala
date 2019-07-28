package typings.antd

import typings.antd.esTransferMod.TransferItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LeftDataSource extends js.Object {
  var leftDataSource: js.Array[TransferItem]
  var rightDataSource: js.Array[TransferItem]
}

object Anon_LeftDataSource {
  @scala.inline
  def apply(leftDataSource: js.Array[TransferItem], rightDataSource: js.Array[TransferItem]): Anon_LeftDataSource = {
    val __obj = js.Dynamic.literal(leftDataSource = leftDataSource, rightDataSource = rightDataSource)
  
    __obj.asInstanceOf[Anon_LeftDataSource]
  }
}

