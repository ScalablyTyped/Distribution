package typings
package asn1jsLib.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", "BitString")
@js.native
class BitString () extends BaseBlock[LocalBitStringValueBlock] {
  def this(params: LocalBitStringValueBlockParams) = this()
  /**
    * Checking that two BITSTRINGs are equal
    * @param {BitString} bitString
    */
  def isEqual(bitString: BitString): scala.Boolean = js.native
}

