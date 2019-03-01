package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CipherParams extends js.Object {
  var algorithm: java.lang.String
  var key: js.Any
  var keyLength: scala.Double
  var mode: java.lang.String
}

object CipherParams {
  @scala.inline
  def apply(algorithm: java.lang.String, key: js.Any, keyLength: scala.Double, mode: java.lang.String): CipherParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("algorithm")(algorithm)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("keyLength")(keyLength)
    __obj.updateDynamic("mode")(mode)
    __obj.asInstanceOf[CipherParams]
  }
}

