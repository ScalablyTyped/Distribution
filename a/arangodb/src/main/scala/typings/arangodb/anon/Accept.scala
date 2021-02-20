package typings.arangodb.anon

import typings.arangodb.arangodbStrings.applicationSlashjson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accept extends StObject {
  
  var accept: applicationSlashjson = js.native
  
  var authorization: String = js.native
}
object Accept {
  
  @scala.inline
  def apply(accept: applicationSlashjson, authorization: String): Accept = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], authorization = authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accept]
  }
  
  @scala.inline
  implicit class AcceptMutableBuilder[Self <: Accept] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccept(value: applicationSlashjson): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
  }
}
