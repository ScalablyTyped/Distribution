package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartSchemaCreationRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String = js.native
  
  /**
    * The schema definition, in GraphQL schema language format.
    */
  var definition: _Blob = js.native
}
object StartSchemaCreationRequest {
  
  @scala.inline
  def apply(apiId: String, definition: _Blob): StartSchemaCreationRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSchemaCreationRequest]
  }
  
  @scala.inline
  implicit class StartSchemaCreationRequestMutableBuilder[Self <: StartSchemaCreationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinition(value: _Blob): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
  }
}
