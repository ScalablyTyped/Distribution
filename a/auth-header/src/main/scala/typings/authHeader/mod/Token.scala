package typings.authHeader.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var params: StringDictionary[String | js.Array[String]]
  var scheme: String
  var token: Null | String | js.Array[String]
}

object Token {
  @scala.inline
  def apply(
    params: StringDictionary[String | js.Array[String]],
    scheme: String,
    token: String | js.Array[String] = null
  ): Token = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

