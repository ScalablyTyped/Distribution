package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextMessage extends js.Object {
  var body: String
  /* Properties */
  var from: String
  var to: String
  var variables: js.UndefOr[IndexableObject] = js.undefined
}

object TextMessage {
  @scala.inline
  def apply(body: String, from: String, to: String, variables: IndexableObject = null): TextMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMessage]
  }
}

