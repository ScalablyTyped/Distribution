package typings
package asn1jsLib.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", "LocalBaseBlock")
@js.native
class LocalBaseBlock ()
  extends asn1jsLib.asn1jsMod.Asn1jsNs.LocalBaseBlock {
  def this(params: asn1jsLib.asn1jsMod.Asn1jsNs.LocalBaseBlockParams) = this()
  /* CompleteClass */
  override var blockLength: scala.Double = js.native
  /* CompleteClass */
  override var error: java.lang.String = js.native
  /* CompleteClass */
  override var valueBeforeDecode: stdLib.ArrayBuffer = js.native
  /* CompleteClass */
  override var warnings: js.Array[java.lang.String] = js.native
  /**
           * Convertion for the block to JSON object
           * 
           * @returns {JsonLocalBaseBlock}
           * 
           * @memberOf LocalBaseBlock
           */
  /* CompleteClass */
  override def toJSON(): asn1jsLib.asn1jsMod.Asn1jsNs.JsonLocalBaseBlock = js.native
}

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

