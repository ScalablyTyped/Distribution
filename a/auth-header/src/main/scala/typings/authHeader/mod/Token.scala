package typings.authHeader.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Token extends js.Object {
  var params: StringDictionary[String | js.Array[String]] = js.native
  var scheme: String = js.native
  var token: Null | String | js.Array[String] = js.native
}

object Token {
  @scala.inline
  def apply(params: StringDictionary[String | js.Array[String]], scheme: String): Token = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParams(value: StringDictionary[String | js.Array[String]]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokenVarargs(value: String*): Self = this.set("token", js.Array(value :_*))
    @scala.inline
    def setToken(value: String | js.Array[String]): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokenNull: Self = this.set("token", null)
  }
  
}

