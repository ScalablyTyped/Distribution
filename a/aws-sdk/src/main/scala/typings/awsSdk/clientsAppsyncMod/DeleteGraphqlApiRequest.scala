package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGraphqlApiRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String
}
object DeleteGraphqlApiRequest {
  
  inline def apply(apiId: String): DeleteGraphqlApiRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGraphqlApiRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGraphqlApiRequest] (val x: Self) extends AnyVal {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
  }
}
