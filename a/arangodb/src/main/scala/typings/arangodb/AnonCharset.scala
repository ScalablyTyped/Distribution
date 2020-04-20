package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCharset extends js.Object {
  var charset: String
}

object AnonCharset {
  @scala.inline
  def apply(charset: String): AnonCharset = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCharset]
  }
}

