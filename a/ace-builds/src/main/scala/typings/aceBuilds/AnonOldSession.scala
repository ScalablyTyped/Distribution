package typings.aceBuilds

import typings.aceBuilds.mod.Ace.EditSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOldSession extends js.Object {
  var oldSession: EditSession
  var session: EditSession
}

object AnonOldSession {
  @scala.inline
  def apply(oldSession: EditSession, session: EditSession): AnonOldSession = {
    val __obj = js.Dynamic.literal(oldSession = oldSession.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOldSession]
  }
}

