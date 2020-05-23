package typings.asana.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiKey extends js.Object {
  var apiKey: String
}

object ApiKey {
  @scala.inline
  def apply(apiKey: String): ApiKey = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKey]
  }
}

