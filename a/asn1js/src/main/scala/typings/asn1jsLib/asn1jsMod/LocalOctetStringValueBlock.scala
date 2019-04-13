package typings
package asn1jsLib.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", "LocalOctetStringValueBlock")
@js.native
class LocalOctetStringValueBlock ()
  extends LocalConstructedValueBlock
     with ILocalHexBlock {
  def this(params: LocalOctetStringValueBlockParams) = this()
  var isConstructed: scala.Boolean = js.native
  /* InferMemberOverrides */
  override def fromBER(inputBuffer: stdLib.ArrayBuffer, inputOffset: scala.Double, inputLength: scala.Double): scala.Unit with scala.Double = js.native
  /* InferMemberOverrides */
  override def toBER(): stdLib.ArrayBuffer = js.native
  /* InferMemberOverrides */
  override def toBER(sizeOnly: scala.Boolean): stdLib.ArrayBuffer = js.native
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

