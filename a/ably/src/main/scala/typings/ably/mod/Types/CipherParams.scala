package typings.ably.mod.Types

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
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyLength = keyLength.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CipherParams]
  }
}

