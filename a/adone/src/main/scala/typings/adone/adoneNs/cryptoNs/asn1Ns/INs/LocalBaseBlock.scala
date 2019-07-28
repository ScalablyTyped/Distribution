package typings.adone.adoneNs.cryptoNs.asn1Ns.INs

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.crypto.asn1.I.LocalBaseBlock")
@js.native
class LocalBaseBlock () extends js.Object {
  def this(params: LocalBaseBlockParams) = this()
  var blockLength: Double = js.native
  var error: String = js.native
  var valueBeforeDecode: ArrayBuffer = js.native
  var warnings: js.Array[String] = js.native
  /**
    * Convertion for the block to JSON object
    */
  def toJSON(): JsonLocalBaseBlock = js.native
}

/* static members */
@JSGlobal("adone.crypto.asn1.I.LocalBaseBlock")
@js.native
object LocalBaseBlock extends js.Object {
  /**
    * Aux function, need to get a block name. Need to have it here for inhiritence
    */
  def blockName(): String = js.native
}

