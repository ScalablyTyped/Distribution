package typings.asn1js.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", "OctetString")
@js.native
class OctetString () extends BaseBlock[LocalOctetStringValueBlock] {
  def this(params: LocalOctetStringValueBlockParams) = this()
  /**
    * Checking that two OCTETSTRINGs are equal
    * 
    * @param {OctetString} octetString
    * @returns {boolean}
    * 
    * @memberOf OctetString
    */
  def isEqual(octetString: OctetString): scala.Boolean = js.native
}

