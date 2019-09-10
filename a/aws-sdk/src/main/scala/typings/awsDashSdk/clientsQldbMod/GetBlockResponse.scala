package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBlockResponse extends js.Object {
  /**
    * The block data object in Amazon Ion format.
    */
  var Block: ValueHolder
  /**
    * The proof object in Amazon Ion format returned by a GetBlock request. A proof contains the list of hash values required to recalculate the specified digest using a Merkle tree, starting with the specified block.
    */
  var Proof: js.UndefOr[ValueHolder] = js.undefined
}

object GetBlockResponse {
  @scala.inline
  def apply(Block: ValueHolder, Proof: ValueHolder = null): GetBlockResponse = {
    val __obj = js.Dynamic.literal(Block = Block)
    if (Proof != null) __obj.updateDynamic("Proof")(Proof)
    __obj.asInstanceOf[GetBlockResponse]
  }
}

