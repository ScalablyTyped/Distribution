package typings.asn1js.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "LocalBaseBlock")
@js.native
class LocalBaseBlock () extends js.Object {
  def this(params: LocalBaseBlockParams) = this()
  
  var blockLength: Double = js.native
  
  var error: String = js.native
  
  /**
    * Convertion for the block to JSON object
    * 
    * @returns {JsonLocalBaseBlock}
    * 
    * @memberOf LocalBaseBlock
    */
  def toJSON(): JsonLocalBaseBlock = js.native
  
  var valueBeforeDecode: ArrayBuffer = js.native
  
  var warnings: js.Array[String] = js.native
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
  def blockName(): String = js.native
}
