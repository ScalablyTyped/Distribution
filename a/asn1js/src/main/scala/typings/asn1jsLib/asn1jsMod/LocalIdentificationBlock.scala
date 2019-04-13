package typings
package asn1jsLib.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", "LocalIdentificationBlock")
@js.native
class LocalIdentificationBlock ()
  extends LocalBaseBlock
     with ILocalHexBlock {
  def this(params: LocalIdentificationBlockParams) = this()
  var isConstructed: scala.Boolean = js.native
  var tagClass: scala.Double = js.native
  var tagNumber: scala.Double = js.native
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

