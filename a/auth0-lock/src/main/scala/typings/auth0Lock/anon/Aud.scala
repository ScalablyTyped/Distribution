package typings.auth0Lock.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aud extends js.Object {
  var aud: String
  var exp: Double
  var iat: Double
  var iss: String
  var sub: String
}

object Aud {
  @scala.inline
  def apply(aud: String, exp: Double, iat: Double, iss: String, sub: String): Aud = {
    val __obj = js.Dynamic.literal(aud = aud.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aud]
  }
}

