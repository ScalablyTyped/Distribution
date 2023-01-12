package typings.arangodb.anon

import typings.arangodb.arangodbStrings.applicationSlashjson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accept extends StObject {
  
  var accept: applicationSlashjson
  
  var authorization: String
}
object Accept {
  
  inline def apply(authorization: String): Accept = {
    val __obj = js.Dynamic.literal(accept = "application/json", authorization = authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accept]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Accept] (val x: Self) extends AnyVal {
    
    inline def setAccept(value: applicationSlashjson): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
  }
}
