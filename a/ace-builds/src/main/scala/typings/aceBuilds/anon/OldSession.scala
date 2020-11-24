package typings.aceBuilds.anon

import typings.aceBuilds.mod.Ace.EditSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OldSession extends js.Object {
  
  var oldSession: EditSession = js.native
  
  var session: EditSession = js.native
}
object OldSession {
  
  @scala.inline
  def apply(oldSession: EditSession, session: EditSession): OldSession = {
    val __obj = js.Dynamic.literal(oldSession = oldSession.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldSession]
  }
  
  @scala.inline
  implicit class OldSessionOps[Self <: OldSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOldSession(value: EditSession): Self = this.set("oldSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: EditSession): Self = this.set("session", value.asInstanceOf[js.Any])
  }
}
