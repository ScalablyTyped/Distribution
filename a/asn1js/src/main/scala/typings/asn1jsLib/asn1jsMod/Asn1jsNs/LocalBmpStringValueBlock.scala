package typings
package asn1jsLib.asn1jsMod.Asn1jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalBmpStringValueBlock
  extends LocalHexBlock
     with LocalBaseBlock {
  var value: java.lang.String = js.native
  /**
    * Convertion for the block to JSON object
    * @returns {*}
  	     */
  /* InferMemberOverrides */
  override def toJSON(): js.Any with JsonLocalBaseBlock = js.native
}

