package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSMBSettingsOutput extends StObject {
  
  /**
    * Indicates the status of a gateway that is a member of the Active Directory domain.    ACCESS_DENIED: Indicates that the JoinDomain operation failed due to an authentication error.    DETACHED: Indicates that gateway is not joined to a domain.    JOINED: Indicates that the gateway has successfully joined a domain.    JOINING: Indicates that a JoinDomain operation is in progress.    NETWORK_ERROR: Indicates that JoinDomain operation failed due to a network or connectivity error.    TIMEOUT: Indicates that the JoinDomain operation failed because the operation didn't complete within the allotted time.    UNKNOWN_ERROR: Indicates that the JoinDomain operation failed due to another type of error.  
    */
  var ActiveDirectoryStatus: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.ActiveDirectoryStatus] = js.undefined
  
  /**
    * The name of the domain that the gateway is joined to.
    */
  var DomainName: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.DomainName] = js.undefined
  
  /**
    * The shares on this gateway appear when listing shares. Only supported for S3 File Gateways. 
    */
  var FileSharesVisible: js.UndefOr[Boolean] = js.undefined
  
  var GatewayARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
  
  /**
    * This value is true if a password for the guest user smbguest is set, otherwise false. Only supported for S3 File Gateways. Valid Values: true | false 
    */
  var SMBGuestPasswordSet: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of Active Directory users and groups that have special permissions for SMB file shares on the gateway.
    */
  var SMBLocalGroups: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.SMBLocalGroups] = js.undefined
  
  /**
    * The type of security strategy that was specified for file gateway.    ClientSpecified: If you use this option, requests are established based on what is negotiated by the client. This option is recommended when you want to maximize compatibility across different clients in your environment. Only supported for S3 File Gateways.    MandatorySigning: If you use this option, file gateway only allows connections from SMBv2 or SMBv3 clients that have signing enabled. This option works with SMB clients on Microsoft Windows Vista, Windows Server 2008 or newer.    MandatoryEncryption: If you use this option, file gateway only allows connections from SMBv3 clients that have encryption enabled. This option is highly recommended for environments that handle sensitive data. This option works with SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.  
    */
  var SMBSecurityStrategy: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.SMBSecurityStrategy] = js.undefined
}
object DescribeSMBSettingsOutput {
  
  inline def apply(): DescribeSMBSettingsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSMBSettingsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSMBSettingsOutput] (val x: Self) extends AnyVal {
    
    inline def setActiveDirectoryStatus(value: ActiveDirectoryStatus): Self = StObject.set(x, "ActiveDirectoryStatus", value.asInstanceOf[js.Any])
    
    inline def setActiveDirectoryStatusUndefined: Self = StObject.set(x, "ActiveDirectoryStatus", js.undefined)
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setFileSharesVisible(value: Boolean): Self = StObject.set(x, "FileSharesVisible", value.asInstanceOf[js.Any])
    
    inline def setFileSharesVisibleUndefined: Self = StObject.set(x, "FileSharesVisible", js.undefined)
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
    
    inline def setSMBGuestPasswordSet(value: Boolean): Self = StObject.set(x, "SMBGuestPasswordSet", value.asInstanceOf[js.Any])
    
    inline def setSMBGuestPasswordSetUndefined: Self = StObject.set(x, "SMBGuestPasswordSet", js.undefined)
    
    inline def setSMBLocalGroups(value: SMBLocalGroups): Self = StObject.set(x, "SMBLocalGroups", value.asInstanceOf[js.Any])
    
    inline def setSMBLocalGroupsUndefined: Self = StObject.set(x, "SMBLocalGroups", js.undefined)
    
    inline def setSMBSecurityStrategy(value: SMBSecurityStrategy): Self = StObject.set(x, "SMBSecurityStrategy", value.asInstanceOf[js.Any])
    
    inline def setSMBSecurityStrategyUndefined: Self = StObject.set(x, "SMBSecurityStrategy", js.undefined)
  }
}
