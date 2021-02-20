package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainAssociationRequest extends StObject {
  
  /**
    *  The unique id for an Amplify app. 
    */
  var appId: AppId = js.native
  
  /**
    *  The name of the domain. 
    */
  var domainName: DomainName = js.native
}
object GetDomainAssociationRequest {
  
  @scala.inline
  def apply(appId: AppId, domainName: DomainName): GetDomainAssociationRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainAssociationRequest]
  }
  
  @scala.inline
  implicit class GetDomainAssociationRequestMutableBuilder[Self <: GetDomainAssociationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
  }
}
