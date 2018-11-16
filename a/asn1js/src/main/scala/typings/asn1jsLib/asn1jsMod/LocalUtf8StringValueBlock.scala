package typings
package asn1jsLib.asn1jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", "LocalUtf8StringValueBlock")
@js.native
class LocalUtf8StringValueBlock ()
  extends asn1jsLib.asn1jsMod.Asn1jsNs.LocalUtf8StringValueBlock {
  def this(params: asn1jsLib.asn1jsMod.Asn1jsNs.LocalSidValueBlockParams) = this()
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

