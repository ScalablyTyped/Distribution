package typings.accedoAccedoOne.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alpha2Code extends js.Object {
  var alpha2Code: String
  var alpha3Code: String
}

object Alpha2Code {
  @scala.inline
  def apply(alpha2Code: String, alpha3Code: String): Alpha2Code = {
    val __obj = js.Dynamic.literal(alpha2Code = alpha2Code.asInstanceOf[js.Any], alpha3Code = alpha3Code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alpha2Code]
  }
}

