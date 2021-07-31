package typings.awsSdk.appsyncMod

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
  
  @scala.inline
  def apply(apiId: String, format: OutputType): GetIntrospectionSchemaRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIntrospectionSchemaRequest]
  }
  
  @scala.inline
  implicit class GetIntrospectionSchemaRequestMutableBuilder[Self <: GetIntrospectionSchemaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: OutputType): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDirectives(value: BooleanValue): Self = StObject.set(x, "includeDirectives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDirectivesUndefined: Self = StObject.set(x, "includeDirectives", js.undefined)
  }
}
