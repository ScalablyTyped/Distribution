package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTypeRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String = js.native
  
  /**
    * The new definition.
    */
  var definition: js.UndefOr[String] = js.native
  
  /**
    * The new type format: SDL or JSON.
    */
  var format: TypeDefinitionFormat = js.native
  
  /**
    * The new type name.
    */
  var typeName: ResourceName = js.native
}
object UpdateTypeRequest {
  
  @scala.inline
  def apply(apiId: String, format: TypeDefinitionFormat, typeName: ResourceName): UpdateTypeRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTypeRequest]
  }
  
  @scala.inline
  implicit class UpdateTypeRequestMutableBuilder[Self <: UpdateTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    @scala.inline
    def setFormat(value: TypeDefinitionFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeName(value: ResourceName): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
