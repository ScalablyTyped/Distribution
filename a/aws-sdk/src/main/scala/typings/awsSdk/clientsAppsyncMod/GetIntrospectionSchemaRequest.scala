package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIntrospectionSchemaRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String
  
  /**
    * The schema format: SDL or JSON.
    */
  var format: OutputType
  
  /**
    * A flag that specifies whether the schema introspection should contain directives.
    */
  var includeDirectives: js.UndefOr[BooleanValue] = js.undefined
}
object GetIntrospectionSchemaRequest {
  
  inline def apply(apiId: String, format: OutputType): GetIntrospectionSchemaRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIntrospectionSchemaRequest]
  }
  
  extension [Self <: GetIntrospectionSchemaRequest](x: Self) {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: OutputType): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setIncludeDirectives(value: BooleanValue): Self = StObject.set(x, "includeDirectives", value.asInstanceOf[js.Any])
    
    inline def setIncludeDirectivesUndefined: Self = StObject.set(x, "includeDirectives", js.undefined)
  }
}
