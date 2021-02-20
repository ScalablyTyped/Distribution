package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverRequest extends StObject {
  
  /**
    * The API ID.
    */
  var apiId: String = js.native
  
  /**
    * The resolver field name.
    */
  var fieldName: ResourceName = js.native
  
  /**
    * The resolver type name.
    */
  var typeName: ResourceName = js.native
}
object GetResolverRequest {
  
  @scala.inline
  def apply(apiId: String, fieldName: ResourceName, typeName: ResourceName): GetResolverRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRequest]
  }
  
  @scala.inline
  implicit class GetResolverRequestMutableBuilder[Self <: GetResolverRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldName(value: ResourceName): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeName(value: ResourceName): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
  }
}
