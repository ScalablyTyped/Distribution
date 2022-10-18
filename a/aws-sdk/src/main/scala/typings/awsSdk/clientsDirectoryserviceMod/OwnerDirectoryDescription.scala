package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnerDirectoryDescription extends StObject {
  
  /**
    * Identifier of the directory owner account.
    */
  var AccountId: js.UndefOr[CustomerId] = js.undefined
  
  /**
    * Identifier of the Managed Microsoft AD directory in the directory owner account.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.DirectoryId] = js.undefined
  
  /**
    * IP address of the directory’s domain controllers.
    */
  var DnsIpAddrs: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.DnsIpAddrs] = js.undefined
  
  /**
    * A RadiusSettings object that contains information about the RADIUS server.
    */
  var RadiusSettings: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.RadiusSettings] = js.undefined
  
  /**
    * Information about the status of the RADIUS server.
    */
  var RadiusStatus: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.RadiusStatus] = js.undefined
  
  /**
    * Information about the VPC settings for the directory.
    */
  var VpcSettings: js.UndefOr[DirectoryVpcSettingsDescription] = js.undefined
}
object OwnerDirectoryDescription {
  
  inline def apply(): OwnerDirectoryDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OwnerDirectoryDescription]
  }
  
  extension [Self <: OwnerDirectoryDescription](x: Self) {
    
    inline def setAccountId(value: CustomerId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setDnsIpAddrs(value: DnsIpAddrs): Self = StObject.set(x, "DnsIpAddrs", value.asInstanceOf[js.Any])
    
    inline def setDnsIpAddrsUndefined: Self = StObject.set(x, "DnsIpAddrs", js.undefined)
    
    inline def setDnsIpAddrsVarargs(value: IpAddr*): Self = StObject.set(x, "DnsIpAddrs", js.Array(value*))
    
    inline def setRadiusSettings(value: RadiusSettings): Self = StObject.set(x, "RadiusSettings", value.asInstanceOf[js.Any])
    
    inline def setRadiusSettingsUndefined: Self = StObject.set(x, "RadiusSettings", js.undefined)
    
    inline def setRadiusStatus(value: RadiusStatus): Self = StObject.set(x, "RadiusStatus", value.asInstanceOf[js.Any])
    
    inline def setRadiusStatusUndefined: Self = StObject.set(x, "RadiusStatus", js.undefined)
    
    inline def setVpcSettings(value: DirectoryVpcSettingsDescription): Self = StObject.set(x, "VpcSettings", value.asInstanceOf[js.Any])
    
    inline def setVpcSettingsUndefined: Self = StObject.set(x, "VpcSettings", js.undefined)
  }
}
