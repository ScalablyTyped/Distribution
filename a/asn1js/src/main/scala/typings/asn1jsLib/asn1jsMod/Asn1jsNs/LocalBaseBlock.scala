package typings
package asn1jsLib.asn1jsMod.Asn1jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalBaseBlock extends js.Object {
  var blockLength: scala.Double
  var error: java.lang.String
  var valueBeforeDecode: stdLib.ArrayBuffer
  var warnings: js.Array[java.lang.String]
  /**
    * Convertion for the block to JSON object
    * 
    * @returns {JsonLocalBaseBlock}
    * 
    * @memberOf LocalBaseBlock
    */
  def toJSON(): JsonLocalBaseBlock
}

object LocalBaseBlock {
  @scala.inline
  def apply(
    blockLength: scala.Double,
    error: java.lang.String,
    toJSON: js.Function0[JsonLocalBaseBlock],
    valueBeforeDecode: stdLib.ArrayBuffer,
    warnings: js.Array[java.lang.String]
  ): LocalBaseBlock = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blockLength")(blockLength)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.updateDynamic("valueBeforeDecode")(valueBeforeDecode)
    __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[LocalBaseBlock]
  }
}

