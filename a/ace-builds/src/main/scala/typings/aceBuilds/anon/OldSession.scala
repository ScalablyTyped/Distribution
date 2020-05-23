package typings.aceBuilds.anon

import typings.aceBuilds.mod.Ace.EditSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OldSession extends js.Object {
  var oldSession: EditSession
  var session: EditSession
}

object OldSession {
  @scala.inline
  def apply(oldSession: EditSession, session: EditSession): OldSession = {
    val __obj = js.Dynamic.literal(oldSession = oldSession.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldSession]
  }
}

