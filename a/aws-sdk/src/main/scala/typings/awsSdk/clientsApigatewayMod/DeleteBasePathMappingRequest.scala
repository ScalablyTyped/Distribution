package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBasePathMappingRequest extends StObject {
  
  /**
    * The base path name of the BasePathMapping resource to delete. To specify an empty base path, set this parameter to '(none)'.
    */
  var basePath: String
  
  /**
    * The domain name of the BasePathMapping resource to delete.
    */
  var domainName: String
}
object DeleteBasePathMappingRequest {
  
  inline def apply(basePath: String, domainName: String): DeleteBasePathMappingRequest = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBasePathMappingRequest]
  }
  
  extension [Self <: DeleteBasePathMappingRequest](x: Self) {
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
