package typings
package asn1jsLib.asn1jsMod.Asn1jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalSidValueBlock
  extends LocalHexBlock
     with LocalBaseBlock {
  var isFirstSid: scala.Boolean = js.native
  var valueDec: scala.Double = js.native
  /**
           * Convertion for the block to JSON object
           * @returns {*}
  	     */
  /* InferMemberOverrides */
  override def toJSON(): js.Any with JsonLocalBaseBlock = js.native
}

