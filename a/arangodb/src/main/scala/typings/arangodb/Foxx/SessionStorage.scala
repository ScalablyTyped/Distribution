package typings.arangodb.Foxx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionStorage extends js.Object {
  
  def forClient(session: Session): String | Null = js.native
  
  def fromClient(sid: String): Session | Null = js.native
  
  var `new`: js.UndefOr[js.Function0[Session]] = js.native
}
object SessionStorage {
  
  @scala.inline
  def apply(forClient: Session => String | Null, fromClient: String => Session | Null): SessionStorage = {
    val __obj = js.Dynamic.literal(forClient = js.Any.fromFunction1(forClient), fromClient = js.Any.fromFunction1(fromClient))
    __obj.asInstanceOf[SessionStorage]
  }
  
  @scala.inline
  implicit class SessionStorageOps[Self <: SessionStorage] (val x: Self) extends AnyVal {
    
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
    def setForClient(value: Session => String | Null): Self = this.set("forClient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFromClient(value: String => Session | Null): Self = this.set("fromClient", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNew(value: () => Session): Self = this.set("new", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteNew: Self = this.set("new", js.undefined)
  }
}
