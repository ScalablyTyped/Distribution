package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIntegrationRequest extends StObject {
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * The URI of the S3 bucket or any other type of data source.
    */
  var Uri: string1To255
}
object DeleteIntegrationRequest {
  
  inline def apply(DomainName: name, Uri: string1To255): DeleteIntegrationRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Uri = Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIntegrationRequest]
  }
  
  extension [Self <: DeleteIntegrationRequest](x: Self) {
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setUri(value: string1To255): Self = StObject.set(x, "Uri", value.asInstanceOf[js.Any])
  }
}
