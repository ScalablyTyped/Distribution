package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessageParts extends js.Object {
  var messageParts: js.Array[String]
  var placeHolders: js.Array[String]
}

object AnonMessageParts {
  @scala.inline
  def apply(messageParts: js.Array[String], placeHolders: js.Array[String]): AnonMessageParts = {
    val __obj = js.Dynamic.literal(messageParts = messageParts.asInstanceOf[js.Any], placeHolders = placeHolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessageParts]
  }
}

