package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewContactEvent extends js.Object {
  /** The ID of the viewed contact. */
  var contactId: String
}

object ViewContactEvent {
  @scala.inline
  def apply(contactId: String): ViewContactEvent = {
    val __obj = js.Dynamic.literal(contactId = contactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewContactEvent]
  }
}

