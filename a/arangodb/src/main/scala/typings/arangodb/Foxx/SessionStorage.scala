package typings.arangodb.Foxx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionStorage extends StObject {
  
  def forClient(session: Session): String | Null
  
  def fromClient(sid: String): Session | Null
  
  var `new`: js.UndefOr[js.Function0[Session]] = js.undefined
}
object SessionStorage {
  
  @scala.inline
  def apply(forClient: Session => String | Null, fromClient: String => Session | Null): SessionStorage = {
    val __obj = js.Dynamic.literal(forClient = js.Any.fromFunction1(forClient), fromClient = js.Any.fromFunction1(fromClient))
    __obj.asInstanceOf[SessionStorage]
  }
  
  @scala.inline
  implicit class SessionStorageMutableBuilder[Self <: SessionStorage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForClient(value: Session => String | Null): Self = StObject.set(x, "forClient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFromClient(value: String => Session | Null): Self = StObject.set(x, "fromClient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNew(value: () => Session): Self = StObject.set(x, "new", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewUndefined: Self = StObject.set(x, "new", js.undefined)
  }
}
