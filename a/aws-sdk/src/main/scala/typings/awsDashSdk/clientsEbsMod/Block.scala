package typings.awsDashSdk.clientsEbsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Block extends js.Object {
  /**
    * The block index.
    */
  var BlockIndex: js.UndefOr[typings.awsDashSdk.clientsEbsMod.BlockIndex] = js.native
  /**
    * The block token for the block index.
    */
  var BlockToken: js.UndefOr[typings.awsDashSdk.clientsEbsMod.BlockToken] = js.native
}

object Block {
  @scala.inline
  def apply(BlockIndex: Int | Double = null, BlockToken: BlockToken = null): Block = {
    val __obj = js.Dynamic.literal()
    if (BlockIndex != null) __obj.updateDynamic("BlockIndex")(BlockIndex.asInstanceOf[js.Any])
    if (BlockToken != null) __obj.updateDynamic("BlockToken")(BlockToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
}

