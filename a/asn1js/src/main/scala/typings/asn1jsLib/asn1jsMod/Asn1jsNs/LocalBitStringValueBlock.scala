package typings
package asn1jsLib.asn1jsMod.Asn1jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalBitStringValueBlock
  extends LocalConstructedValueBlock
     with LocalHexBlock {
  var isConstructed: scala.Boolean = js.native
  var unusedBits: scala.Double = js.native
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

