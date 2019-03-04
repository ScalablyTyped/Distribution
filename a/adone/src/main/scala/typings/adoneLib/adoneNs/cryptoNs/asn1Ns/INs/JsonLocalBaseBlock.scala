package typings
package adoneLib.adoneNs.cryptoNs.asn1Ns.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonLocalBaseBlock extends js.Object {
  var blockLength: scala.Double
  var blockName: java.lang.String
  var error: java.lang.String
  var valueBeforeDecode: stdLib.ArrayBuffer
  var warnings: js.Array[java.lang.String]
}

object JsonLocalBaseBlock {
  @scala.inline
  def apply(
    blockLength: scala.Double,
    blockName: java.lang.String,
    error: java.lang.String,
    valueBeforeDecode: stdLib.ArrayBuffer,
    warnings: js.Array[java.lang.String]
  ): JsonLocalBaseBlock = {
    val __obj = js.Dynamic.literal(blockLength = blockLength, blockName = blockName, error = error, valueBeforeDecode = valueBeforeDecode, warnings = warnings)
  
    __obj.asInstanceOf[JsonLocalBaseBlock]
  }
}

