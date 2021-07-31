package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTypeRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String
  
  /**
    * The type definition, in GraphQL Schema Definition Language (SDL) format. For more information, see the GraphQL SDL documentation.
    */
  var definition: String
  
  /**
    * The type format: SDL or JSON.
    */
  var format: TypeDefinitionFormat
}
object CreateTypeRequest {
  
  @scala.inline
  def apply(apiId: String, definition: String, format: TypeDefinitionFormat): CreateTypeRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTypeRequest]
  }
  
  @scala.inline
  implicit class CreateTypeRequestMutableBuilder[Self <: CreateTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: TypeDefinitionFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
