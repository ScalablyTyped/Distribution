package typings.ably.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CipherParams extends js.Object {
  var algorithm: String
  var key: js.Any
  var keyLength: Double
  var mode: String
}

object CipherParams {
  @scala.inline
  def apply(algorithm: String, key: js.Any, keyLength: Double, mode: String): CipherParams = {
    val __obj = js.Dynamic.literal(algorithm = algorithm, key = key, keyLength = keyLength, mode = mode)
  
    __obj.asInstanceOf[CipherParams]
  }
}

