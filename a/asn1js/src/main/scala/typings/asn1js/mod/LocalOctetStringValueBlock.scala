package typings.asn1js.mod

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "LocalOctetStringValueBlock")
@js.native
class LocalOctetStringValueBlock ()
  extends LocalConstructedValueBlock
     with ILocalHexBlock {
  def this(params: LocalOctetStringValueBlockParams) = this()
  
  /* InferMemberOverrides */
  override def fromBER(inputBuffer: ArrayBuffer, inputOffset: Double, inputLength: Double): Unit with Double = js.native
  
  var isConstructed: scala.Boolean = js.native
  
  /* InferMemberOverrides */
  override def toBER(): ArrayBuffer = js.native
  /* InferMemberOverrides */
  override def toBER(sizeOnly: scala.Boolean): ArrayBuffer = js.native
  
  /**
    * Convertion for the block to JSON object
    * 
    * @returns {JsonLocalBaseBlock}
    * 
    * @memberOf LocalBaseBlock
    */
  /* InferMemberOverrides */
  override def toJSON(): JsonLocalBaseBlock with js.Any = js.native
}
