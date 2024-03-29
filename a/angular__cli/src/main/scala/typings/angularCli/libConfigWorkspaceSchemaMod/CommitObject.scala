package typings.angularCli.libConfigWorkspaceSchemaMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommitObject
  extends StObject
     with /* property */ StringDictionary[Any] {
  
  var email: String
  
  var message: js.UndefOr[String] = js.undefined
  
  var name: String
}
object CommitObject {
  
  inline def apply(email: String, name: String): CommitObject = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommitObject] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
