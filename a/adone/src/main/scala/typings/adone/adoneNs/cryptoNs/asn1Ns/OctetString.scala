package typings.adone.adoneNs.cryptoNs.asn1Ns

import typings.adone.adoneNs.cryptoNs.asn1Ns.INs.LocalOctetStringValueBlock
import typings.adone.adoneNs.cryptoNs.asn1Ns.INs.LocalOctetStringValueBlockParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.crypto.asn1.OctetString")
@js.native
class OctetString () extends BaseBlock[LocalOctetStringValueBlock] {
  def this(params: LocalOctetStringValueBlockParams) = this()
  /**
    * Checking that two OCTETSTRINGs are equal
    */
  def isEqual(octetString: OctetString): scala.Boolean = js.native
}

