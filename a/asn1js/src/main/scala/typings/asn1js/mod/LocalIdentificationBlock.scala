package typings.asn1js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("asn1js", "LocalIdentificationBlock")
@js.native
class LocalIdentificationBlock ()
  extends LocalBaseBlock
     with ILocalHexBlock {
  def this(params: LocalIdentificationBlockParams) = this()
  
  var isConstructed: scala.Boolean = js.native
  
  var tagClass: Double = js.native
  
  var tagNumber: Double = js.native
  
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
