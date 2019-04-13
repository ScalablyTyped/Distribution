package typings
package asn1jsLib.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", "LocalBaseBlock")
@js.native
class LocalBaseBlock () extends js.Object {
  def this(params: LocalBaseBlockParams) = this()
  var blockLength: scala.Double = js.native
  var error: java.lang.String = js.native
  var valueBeforeDecode: stdLib.ArrayBuffer = js.native
  var warnings: js.Array[java.lang.String] = js.native
  /**
    * Convertion for the block to JSON object
    * 
    * @returns {JsonLocalBaseBlock}
    * 
    * @memberOf LocalBaseBlock
    */
  def toJSON(): JsonLocalBaseBlock = js.native
}

/* static members */
@JSImport("asn1js", "LocalBaseBlock")
@js.native
object LocalBaseBlock extends js.Object {
  /**
    * Aux function, need to get a block name. Need to have it here for inhiritence
    * 
    * @static
    * @returns {string}
    * 
    * @memberOf LocalBaseBlock
    */
  def blockName(): java.lang.String = js.native
}

