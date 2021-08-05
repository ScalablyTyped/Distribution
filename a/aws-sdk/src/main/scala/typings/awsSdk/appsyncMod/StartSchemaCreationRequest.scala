package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSchemaCreationRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String
  
  /**
    * The schema definition, in GraphQL schema language format.
    */
  var definition: _Blob
}
object StartSchemaCreationRequest {
  
  inline def apply(apiId: String, definition: _Blob): StartSchemaCreationRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSchemaCreationRequest]
  }
  
  extension [Self <: StartSchemaCreationRequest](x: Self) {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    inline def setDefinition(value: _Blob): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
  }
}
