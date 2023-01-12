package typings.aceBuilds.anon

import typings.aceBuilds.mod.Ace.EditSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldSession extends StObject {
  
  var oldSession: EditSession
  
  var session: EditSession
}
object OldSession {
  
  inline def apply(oldSession: EditSession, session: EditSession): OldSession = {
    val __obj = js.Dynamic.literal(oldSession = oldSession.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldSession]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OldSession] (val x: Self) extends AnyVal {
    
    inline def setOldSession(value: EditSession): Self = StObject.set(x, "oldSession", value.asInstanceOf[js.Any])
    
    inline def setSession(value: EditSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
  }
}
