package typings.arangodb.Foxx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Session extends StObject {
  
  var created: Double
  
  var data: js.Any
  
  var uid: String | Null
}
object Session {
  
  @scala.inline
  def apply(created: Double, data: js.Any): Session = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], uid = null)
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit class SessionMutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUidNull: Self = StObject.set(x, "uid", null)
  }
}
