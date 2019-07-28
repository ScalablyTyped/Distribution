package typings.adone.adoneNs.cryptoNs.asn1Ns

import org.scalablytyped.runtime.Instantiable0
import typings.adone.adoneNs.cryptoNs.asn1Ns.INs.BaseBlockParams
import typings.adone.adoneNs.cryptoNs.asn1Ns.INs.LocalBaseBlock
import typings.adone.adoneNs.cryptoNs.asn1Ns.INs.LocalIdentificationBlock
import typings.adone.adoneNs.cryptoNs.asn1Ns.INs.LocalLengthBlock
import typings.adone.adoneNs.cryptoNs.asn1Ns.INs.LocalValueBlock
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.crypto.asn1.BaseBlock")
@js.native
class BaseBlock[T /* <: LocalValueBlock */] () extends LocalBaseBlock {
  def this(parameters: BaseBlockParams) = this()
  def this(parameters: BaseBlockParams, valueBlockType: Instantiable0[LocalValueBlock]) = this()
  var idBlock: LocalIdentificationBlock = js.native
  var lenBlock: LocalLengthBlock = js.native
  var valueBlock: T = js.native
  def fromBER(inputBuffer: ArrayBuffer, inputOffset: Double, inputLength: Double): Double = js.native
  def toBER(): ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): ArrayBuffer = js.native
}

