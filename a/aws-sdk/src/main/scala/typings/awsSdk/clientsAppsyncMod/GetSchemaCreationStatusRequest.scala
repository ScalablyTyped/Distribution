package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSchemaCreationStatusRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String
}
object GetSchemaCreationStatusRequest {
  
  inline def apply(apiId: String): GetSchemaCreationStatusRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSchemaCreationStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSchemaCreationStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
  }
}
