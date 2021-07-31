package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTypeRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String
  
  /**
    * The type format: SDL or JSON.
    */
  var format: TypeDefinitionFormat
  
  /**
    * The type name.
    */
  var typeName: ResourceName
}
object GetTypeRequest {
  
  @scala.inline
  def apply(apiId: String, format: TypeDefinitionFormat, typeName: ResourceName): GetTypeRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTypeRequest]
  }
  
  @scala.inline
  implicit class GetTypeRequestMutableBuilder[Self <: GetTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: TypeDefinitionFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeName(value: ResourceName): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
