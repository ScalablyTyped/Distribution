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
    val __obj = js.Dynamic.literal(algorithm = algorithm, key = key, keyLength = keyLength, mode = mode)
  
    __obj.asInstanceOf[CipherParams]
  }
}

