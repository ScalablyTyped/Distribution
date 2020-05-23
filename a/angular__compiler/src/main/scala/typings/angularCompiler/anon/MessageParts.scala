package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageParts extends js.Object {
  var messageParts: js.Array[String]
  var placeHolders: js.Array[String]
}

object MessageParts {
  @scala.inline
  def apply(messageParts: js.Array[String], placeHolders: js.Array[String]): MessageParts = {
    val __obj = js.Dynamic.literal(messageParts = messageParts.asInstanceOf[js.Any], placeHolders = placeHolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageParts]
  }
}

