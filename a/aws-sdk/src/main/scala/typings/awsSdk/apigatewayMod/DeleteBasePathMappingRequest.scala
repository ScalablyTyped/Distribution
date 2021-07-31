package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBasePathMappingRequest extends StObject {
  
  /**
    * [Required] The base path name of the BasePathMapping resource to delete. To specify an empty base path, set this parameter to '(none)'.
    */
  var basePath: String
  
  /**
    * [Required] The domain name of the BasePathMapping resource to delete.
    */
  var domainName: String
}
object DeleteBasePathMappingRequest {
  
  @scala.inline
  def apply(basePath: String, domainName: String): DeleteBasePathMappingRequest = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBasePathMappingRequest]
  }
  
  @scala.inline
  implicit class DeleteBasePathMappingRequestMutableBuilder[Self <: DeleteBasePathMappingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
