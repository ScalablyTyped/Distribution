package typings.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTokenInfoEndpoint extends js.Object {
  var tokenInfoEndpoint: String
}

object AnonTokenInfoEndpoint {
  @scala.inline
  def apply(tokenInfoEndpoint: String): AnonTokenInfoEndpoint = {
    val __obj = js.Dynamic.literal(tokenInfoEndpoint = tokenInfoEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTokenInfoEndpoint]
  }
}

