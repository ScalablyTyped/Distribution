package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthCra extends js.Object {
  def derive_key(secret: String, salt: String, iterations: Double, keylen: Double): String
  def sign(key: String, challenge: String): String
}

object IAuthCra {
  @scala.inline
  def apply(derive_key: (String, String, Double, Double) => String, sign: (String, String) => String): IAuthCra = {
    val __obj = js.Dynamic.literal(derive_key = js.Any.fromFunction4(derive_key), sign = js.Any.fromFunction2(sign))
    __obj.asInstanceOf[IAuthCra]
  }
}

