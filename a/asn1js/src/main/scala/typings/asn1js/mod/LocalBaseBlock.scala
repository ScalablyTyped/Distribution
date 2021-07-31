package typings.asn1js.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "LocalBaseBlock")
@js.native
class LocalBaseBlock () extends StObject {
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
object LocalBaseBlock {
  
  @JSImport("asn1js", "LocalBaseBlock")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Aux function, need to get a block name. Need to have it here for inhiritence
    * 
    * @static
    * @returns {string}
    * 
    * @memberOf LocalBaseBlock
    */
  /* static member */
  @scala.inline
  def blockName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("blockName")().asInstanceOf[String]
}
