package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRevisionRequest extends js.Object {
  /**
    * The block location of the document revision to be verified. An address is an Amazon Ion structure that has two fields: strandId and sequenceNo. For example: {strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:14} 
    */
  var BlockAddress: ValueHolder
  /**
    * The latest block location covered by the digest for which to request a proof. An address is an Amazon Ion structure that has two fields: strandId and sequenceNo. For example: {strandId:"BlFTjlSXze9BIh1KOszcE3",sequenceNo:49} 
    */
  var DigestTipAddress: js.UndefOr[ValueHolder] = js.undefined
  /**
    * The unique ID of the document to be verified.
    */
  var DocumentId: UniqueId
  /**
    * The name of the ledger.
    */
  var Name: LedgerName
}

object GetRevisionRequest {
  @scala.inline
  def apply(
    BlockAddress: ValueHolder,
    DocumentId: UniqueId,
    Name: LedgerName,
    DigestTipAddress: ValueHolder = null
  ): GetRevisionRequest = {
    val __obj = js.Dynamic.literal(BlockAddress = BlockAddress, DocumentId = DocumentId, Name = Name)
    if (DigestTipAddress != null) __obj.updateDynamic("DigestTipAddress")(DigestTipAddress)
    __obj.asInstanceOf[GetRevisionRequest]
  }
}

