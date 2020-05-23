package typings.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Charset extends js.Object {
  var charset: String
}

object Charset {
  @scala.inline
  def apply(charset: String): Charset = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Charset]
  }
}

