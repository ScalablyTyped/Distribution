package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBlockRequest extends js.Object {
  /**
    * The location of the block that you want to request. An address is an Amazon Ion structure that has two fields: strandId and sequenceNo. For example: {strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:14} 
    */
  var BlockAddress: ValueHolder
  /**
    * The latest block location covered by the digest for which to request a proof. An address is an Amazon Ion structure that has two fields: strandId and sequenceNo. For example: {strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:49} 
    */
  var DigestTipAddress: js.UndefOr[ValueHolder] = js.undefined
  /**
    * The name of the ledger.
    */
  var Name: LedgerName
}

object GetBlockRequest {
  @scala.inline
  def apply(BlockAddress: ValueHolder, Name: LedgerName, DigestTipAddress: ValueHolder = null): GetBlockRequest = {
    val __obj = js.Dynamic.literal(BlockAddress = BlockAddress, Name = Name)
    if (DigestTipAddress != null) __obj.updateDynamic("DigestTipAddress")(DigestTipAddress)
    __obj.asInstanceOf[GetBlockRequest]
  }
}

