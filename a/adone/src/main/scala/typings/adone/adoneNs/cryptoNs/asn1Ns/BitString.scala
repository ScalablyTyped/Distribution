package typings.adone.adoneNs.cryptoNs.asn1Ns

import typings.adone.adoneNs.cryptoNs.asn1Ns.INs.LocalBitStringValueBlock
import typings.adone.adoneNs.cryptoNs.asn1Ns.INs.LocalBitStringValueBlockParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.crypto.asn1.BitString")
@js.native
class BitString () extends BaseBlock[LocalBitStringValueBlock] {
  def this(params: LocalBitStringValueBlockParams) = this()
  /**
    * Checking that two BITSTRINGs are equal
    * @param bitString
    */
  def isEqual(bitString: BitString): scala.Boolean = js.native
}

