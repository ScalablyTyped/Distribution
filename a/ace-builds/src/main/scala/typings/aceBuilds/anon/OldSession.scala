package typings.aceBuilds.anon

import typings.aceBuilds.mod.Ace.EditSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OldSession extends StObject {
  
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
  implicit class OldSessionMutableBuilder[Self <: OldSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldSession(value: EditSession): Self = StObject.set(x, "oldSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: EditSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
