package typings
package adoneLib.adoneNs.dataNs.mpakNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecodingType extends js.Object {
  /**
    * Decode function
    */
  @JSName("decode")
  var decode_Original: DecodeFunction = js.native
  /**
    * Value type
    */
  var `type`: Type = js.native
  /**
    * Decode function
    */
  def decode(buf: adoneLib.adoneNs.collectionNs.ByteArray): js.Any = js.native
}

