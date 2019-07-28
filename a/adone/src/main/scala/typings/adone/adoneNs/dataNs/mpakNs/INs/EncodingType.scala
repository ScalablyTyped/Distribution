package typings.adone.adoneNs.dataNs.mpakNs.INs

import typings.adone.adoneNs.collectionNs.ByteArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncodingType extends js.Object {
  /**
    * Check function
    */
  @JSName("check")
  var check_Original: EncodeCheckFunction = js.native
  /**
    * Encode function
    */
  @JSName("encode")
  var encode_Original: EncodeFunction = js.native
  /**
    * Value type
    */
  var `type`: Type = js.native
  /**
    * Check function
    */
  def check(x: js.Any): Boolean = js.native
  /**
    * Encode function
    */
  def encode(x: js.Any): ByteArray = js.native
}

