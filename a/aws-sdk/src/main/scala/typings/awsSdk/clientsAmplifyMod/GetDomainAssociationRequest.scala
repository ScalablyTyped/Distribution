package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDomainAssociationRequest extends StObject {
  
  /**
    *  The unique id for an Amplify app. 
    */
  var appId: AppId
  
  /**
    *  The name of the domain. 
    */
  var domainName: DomainName
}
object GetDomainAssociationRequest {
  
  inline def apply(appId: AppId, domainName: DomainName): GetDomainAssociationRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainAssociationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDomainAssociationRequest] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
