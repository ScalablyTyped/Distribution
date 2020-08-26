package typings.authmosphere.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenInfoEndpoint extends js.Object {
  var tokenInfoEndpoint: String = js.native
}

object TokenInfoEndpoint {
  @scala.inline
  def apply(tokenInfoEndpoint: String): TokenInfoEndpoint = {
    val __obj = js.Dynamic.literal(tokenInfoEndpoint = tokenInfoEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenInfoEndpoint]
  }
  @scala.inline
  implicit class TokenInfoEndpointOps[Self <: TokenInfoEndpoint] (val x: Self) extends AnyVal {
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
    def setTokenInfoEndpoint(value: String): Self = this.set("tokenInfoEndpoint", value.asInstanceOf[js.Any])
  }
  
}

