package typings
package adoneLib.adoneNs.cryptoNs.asn1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.crypto.asn1.BaseBlock")
@js.native
class BaseBlock[T /* <: adoneLib.adoneNs.cryptoNs.asn1Ns.INs.LocalValueBlock */] ()
  extends adoneLib.adoneNs.cryptoNs.asn1Ns.INs.LocalBaseBlock {
  def this(parameters: adoneLib.adoneNs.cryptoNs.asn1Ns.INs.BaseBlockParams) = this()
  def this(parameters: adoneLib.adoneNs.cryptoNs.asn1Ns.INs.BaseBlockParams, valueBlockType: ScalablyTyped.runtime.Instantiable0[adoneLib.adoneNs.cryptoNs.asn1Ns.INs.LocalValueBlock]) = this()
  var idBlock: adoneLib.adoneNs.cryptoNs.asn1Ns.INs.LocalIdentificationBlock = js.native
  var lenBlock: adoneLib.adoneNs.cryptoNs.asn1Ns.INs.LocalLengthBlock = js.native
  var valueBlock: T = js.native
  def fromBER(inputBuffer: stdLib.ArrayBuffer, inputOffset: scala.Double, inputLength: scala.Double): scala.Double = js.native
  def toBER(): stdLib.ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): stdLib.ArrayBuffer = js.native
}

