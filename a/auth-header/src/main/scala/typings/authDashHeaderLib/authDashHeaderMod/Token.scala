package typings
package authDashHeaderLib.authDashHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var params: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  var scheme: java.lang.String
  var token: scala.Null | java.lang.String | js.Array[java.lang.String]
}

object Token {
  @scala.inline
  def apply(
    params: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]],
    scheme: java.lang.String,
    token: java.lang.String | js.Array[java.lang.String] = null
  ): Token = {
    val __obj = js.Dynamic.literal(params = params, scheme = scheme)
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

