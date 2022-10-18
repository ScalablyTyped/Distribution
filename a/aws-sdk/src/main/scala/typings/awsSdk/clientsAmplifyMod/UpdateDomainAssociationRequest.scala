package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDomainAssociationRequest extends StObject {
  
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId
  
  /**
    *  Sets the branch patterns for automatic subdomain creation. 
    */
  var autoSubDomainCreationPatterns: js.UndefOr[AutoSubDomainCreationPatterns] = js.undefined
  
  /**
    *  The required AWS Identity and Access Management (IAM) service role for the Amazon Resource Name (ARN) for automatically creating subdomains. 
    */
  var autoSubDomainIAMRole: js.UndefOr[AutoSubDomainIAMRole] = js.undefined
  
  /**
    *  The name of the domain. 
    */
  var domainName: DomainName
  
  /**
    *  Enables the automated creation of subdomains for branches. 
    */
  var enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain] = js.undefined
  
  /**
    *  Describes the settings for the subdomain. 
    */
  var subDomainSettings: js.UndefOr[SubDomainSettings] = js.undefined
}
object UpdateDomainAssociationRequest {
  
  inline def apply(appId: AppId, domainName: DomainName): UpdateDomainAssociationRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainAssociationRequest]
  }
  
  extension [Self <: UpdateDomainAssociationRequest](x: Self) {
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAutoSubDomainCreationPatterns(value: AutoSubDomainCreationPatterns): Self = StObject.set(x, "autoSubDomainCreationPatterns", value.asInstanceOf[js.Any])
    
    inline def setAutoSubDomainCreationPatternsUndefined: Self = StObject.set(x, "autoSubDomainCreationPatterns", js.undefined)
    
    inline def setAutoSubDomainCreationPatternsVarargs(value: AutoSubDomainCreationPattern*): Self = StObject.set(x, "autoSubDomainCreationPatterns", js.Array(value*))
    
    inline def setAutoSubDomainIAMRole(value: AutoSubDomainIAMRole): Self = StObject.set(x, "autoSubDomainIAMRole", value.asInstanceOf[js.Any])
    
    inline def setAutoSubDomainIAMRoleUndefined: Self = StObject.set(x, "autoSubDomainIAMRole", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoSubDomain(value: EnableAutoSubDomain): Self = StObject.set(x, "enableAutoSubDomain", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoSubDomainUndefined: Self = StObject.set(x, "enableAutoSubDomain", js.undefined)
    
    inline def setSubDomainSettings(value: SubDomainSettings): Self = StObject.set(x, "subDomainSettings", value.asInstanceOf[js.Any])
    
    inline def setSubDomainSettingsUndefined: Self = StObject.set(x, "subDomainSettings", js.undefined)
    
    inline def setSubDomainSettingsVarargs(value: SubDomainSetting*): Self = StObject.set(x, "subDomainSettings", js.Array(value*))
  }
}
