package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LeftDataSource extends js.Object {
  var leftDataSource: js.Array[antdLib.libTransferMod.TransferItem]
  var rightDataSource: js.Array[antdLib.libTransferMod.TransferItem]
}

object Anon_LeftDataSource {
  @scala.inline
  def apply(
    leftDataSource: js.Array[antdLib.libTransferMod.TransferItem],
    rightDataSource: js.Array[antdLib.libTransferMod.TransferItem]
  ): Anon_LeftDataSource = {
    val __obj = js.Dynamic.literal(leftDataSource = leftDataSource, rightDataSource = rightDataSource)
  
    __obj.asInstanceOf[Anon_LeftDataSource]
  }
}

