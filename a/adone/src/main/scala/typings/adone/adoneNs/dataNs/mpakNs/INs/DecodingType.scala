package typings.adone.adoneNs.dataNs.mpakNs.INs

import typings.adone.adoneNs.collectionNs.ByteArray
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
  def decode(buf: ByteArray): js.Any = js.native
}

