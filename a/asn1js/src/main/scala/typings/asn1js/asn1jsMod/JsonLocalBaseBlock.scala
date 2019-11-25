package typings.asn1js.asn1jsMod

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
    val __obj = js.Dynamic.literal(blockLength = blockLength.asInstanceOf[js.Any], blockName = blockName.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], valueBeforeDecode = valueBeforeDecode.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JsonLocalBaseBlock]
  }
}

