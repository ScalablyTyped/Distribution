package typings.authmosphere.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenInfoEndpoint extends js.Object {
  var tokenInfoEndpoint: String
}

object TokenInfoEndpoint {
  @scala.inline
  def apply(tokenInfoEndpoint: String): TokenInfoEndpoint = {
    val __obj = js.Dynamic.literal(tokenInfoEndpoint = tokenInfoEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenInfoEndpoint]
  }
}

