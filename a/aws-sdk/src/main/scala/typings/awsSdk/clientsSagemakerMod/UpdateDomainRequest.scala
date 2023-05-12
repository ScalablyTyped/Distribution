package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDomainRequest extends StObject {
  
  /**
    * The entity that creates and manages the required security groups for inter-app communication in VPCOnly mode. Required when CreateDomain.AppNetworkAccessType is VPCOnly and DomainSettings.RStudioServerProDomainSettings.DomainExecutionRoleArn is provided. If setting up the domain for use with RStudio, this value must be set to Service.
    */
  var AppSecurityGroupManagement: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AppSecurityGroupManagement] = js.undefined
  
  /**
    * The default settings used to create a space within the Domain.
    */
  var DefaultSpaceSettings: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DefaultSpaceSettings] = js.undefined
  
  /**
    * A collection of settings.
    */
  var DefaultUserSettings: js.UndefOr[UserSettings] = js.undefined
  
  /**
    * The ID of the domain to be updated.
    */
  var DomainId: typings.awsSdk.clientsSagemakerMod.DomainId
  
  /**
    * A collection of DomainSettings configuration values to update.
    */
  var DomainSettingsForUpdate: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DomainSettingsForUpdate] = js.undefined
}
object UpdateDomainRequest {
  
  inline def apply(DomainId: DomainId): UpdateDomainRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDomainRequest] (val x: Self) extends AnyVal {
    
    inline def setAppSecurityGroupManagement(value: AppSecurityGroupManagement): Self = StObject.set(x, "AppSecurityGroupManagement", value.asInstanceOf[js.Any])
    
    inline def setAppSecurityGroupManagementUndefined: Self = StObject.set(x, "AppSecurityGroupManagement", js.undefined)
    
    inline def setDefaultSpaceSettings(value: DefaultSpaceSettings): Self = StObject.set(x, "DefaultSpaceSettings", value.asInstanceOf[js.Any])
    
    inline def setDefaultSpaceSettingsUndefined: Self = StObject.set(x, "DefaultSpaceSettings", js.undefined)
    
    inline def setDefaultUserSettings(value: UserSettings): Self = StObject.set(x, "DefaultUserSettings", value.asInstanceOf[js.Any])
    
    inline def setDefaultUserSettingsUndefined: Self = StObject.set(x, "DefaultUserSettings", js.undefined)
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setDomainSettingsForUpdate(value: DomainSettingsForUpdate): Self = StObject.set(x, "DomainSettingsForUpdate", value.asInstanceOf[js.Any])
    
    inline def setDomainSettingsForUpdateUndefined: Self = StObject.set(x, "DomainSettingsForUpdate", js.undefined)
  }
}
