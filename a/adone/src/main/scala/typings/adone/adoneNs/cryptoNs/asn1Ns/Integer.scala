package typings.adone.adoneNs.cryptoNs.asn1Ns

import typings.adone.adoneNs.cryptoNs.asn1Ns.INs.IntegerParams
import typings.adone.adoneNs.cryptoNs.asn1Ns.INs.LocalIntegerValueBlock
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.crypto.asn1.Integer")
@js.native
class Integer () extends BaseBlock[LocalIntegerValueBlock] {
  def this(params: IntegerParams) = this()
  /**
    * Convert current Integer value from DER to BER format
    */
  def convertFromDER(): Integer = js.native
  /**
    * Convert current Integer value from BER into DER format
    */
  def convertToDER(): Integer = js.native
  /**
    * Compare two Integer object, or Integer and ArrayBuffer objects
    */
  def isEqual(otherValue: Integer): scala.Boolean = js.native
  def isEqual(otherValue: ArrayBuffer): scala.Boolean = js.native
}

