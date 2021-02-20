package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDomainAssociationRequest extends StObject {
  
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId = js.native
  
  /**
    *  Sets the branch patterns for automatic subdomain creation. 
    */
  var autoSubDomainCreationPatterns: js.UndefOr[AutoSubDomainCreationPatterns] = js.native
  
  /**
    *  The required AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN) for automatically creating subdomains. 
    */
  var autoSubDomainIAMRole: js.UndefOr[AutoSubDomainIAMRole] = js.native
  
  /**
    *  The domain name for the domain association. 
    */
  var domainName: DomainName = js.native
  
  /**
    *  Enables the automated creation of subdomains for branches. 
    */
  var enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain] = js.native
  
  /**
    *  The setting for the subdomain. 
    */
  var subDomainSettings: SubDomainSettings = js.native
}
object CreateDomainAssociationRequest {
  
  @scala.inline
  def apply(appId: AppId, domainName: DomainName, subDomainSettings: SubDomainSettings): CreateDomainAssociationRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], subDomainSettings = subDomainSettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainAssociationRequest]
  }
  
  @scala.inline
  implicit class CreateDomainAssociationRequestMutableBuilder[Self <: CreateDomainAssociationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSubDomainCreationPatterns(value: AutoSubDomainCreationPatterns): Self = StObject.set(x, "autoSubDomainCreationPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSubDomainCreationPatternsUndefined: Self = StObject.set(x, "autoSubDomainCreationPatterns", js.undefined)
    
    @scala.inline
    def setAutoSubDomainCreationPatternsVarargs(value: AutoSubDomainCreationPattern*): Self = StObject.set(x, "autoSubDomainCreationPatterns", js.Array(value :_*))
    
    @scala.inline
    def setAutoSubDomainIAMRole(value: AutoSubDomainIAMRole): Self = StObject.set(x, "autoSubDomainIAMRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSubDomainIAMRoleUndefined: Self = StObject.set(x, "autoSubDomainIAMRole", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutoSubDomain(value: EnableAutoSubDomain): Self = StObject.set(x, "enableAutoSubDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAutoSubDomainUndefined: Self = StObject.set(x, "enableAutoSubDomain", js.undefined)
    
    @scala.inline
    def setSubDomainSettings(value: SubDomainSettings): Self = StObject.set(x, "subDomainSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubDomainSettingsVarargs(value: SubDomainSetting*): Self = StObject.set(x, "subDomainSettings", js.Array(value :_*))
  }
}
