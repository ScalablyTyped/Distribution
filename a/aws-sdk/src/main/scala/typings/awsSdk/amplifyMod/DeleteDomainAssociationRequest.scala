package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDomainAssociationRequest extends StObject {
  
  /**
    *  The unique id for an Amplify app. 
    */
  var appId: AppId
  
  /**
    *  The name of the domain. 
    */
  var domainName: DomainName
}
object DeleteDomainAssociationRequest {
  
  inline def apply(appId: AppId, domainName: DomainName): DeleteDomainAssociationRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainAssociationRequest]
  }
  
  extension [Self <: DeleteDomainAssociationRequest](x: Self) {
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
