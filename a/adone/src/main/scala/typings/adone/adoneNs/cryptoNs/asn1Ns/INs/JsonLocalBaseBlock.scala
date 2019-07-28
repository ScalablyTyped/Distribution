package typings.adone.adoneNs.cryptoNs.asn1Ns.INs

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonLocalBaseBlock extends js.Object {
  var blockLength: Double
  var blockName: String
  var error: String
  var valueBeforeDecode: ArrayBuffer
  var warnings: js.Array[String]
}

object JsonLocalBaseBlock {
  @scala.inline
  def apply(
    blockLength: Double,
    blockName: String,
    error: String,
    valueBeforeDecode: ArrayBuffer,
    warnings: js.Array[String]
  ): JsonLocalBaseBlock = {
    val __obj = js.Dynamic.literal(blockLength = blockLength, blockName = blockName, error = error, valueBeforeDecode = valueBeforeDecode, warnings = warnings)
  
    __obj.asInstanceOf[JsonLocalBaseBlock]
  }
}

