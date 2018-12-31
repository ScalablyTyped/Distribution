package typings
package adoneLib.adoneNs.cryptoNs.asn1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.crypto.asn1.Integer")
@js.native
class Integer ()
  extends BaseBlock[adoneLib.adoneNs.cryptoNs.asn1Ns.INs.LocalIntegerValueBlock] {
  def this(params: adoneLib.adoneNs.cryptoNs.asn1Ns.INs.IntegerParams) = this()
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
  def isEqual(otherValue: stdLib.ArrayBuffer): scala.Boolean = js.native
}

