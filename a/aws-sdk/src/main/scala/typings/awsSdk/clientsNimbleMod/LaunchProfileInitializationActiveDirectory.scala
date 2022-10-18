package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchProfileInitializationActiveDirectory extends StObject {
  
  /**
    * A collection of custom attributes for an Active Directory computer.
    */
  var computerAttributes: js.UndefOr[ActiveDirectoryComputerAttributeList] = js.undefined
  
  /**
    * The directory ID of the Directory Service for Microsoft Active Directory to access using this launch profile.
    */
  var directoryId: js.UndefOr[DirectoryId] = js.undefined
  
  /**
    * The directory name.
    */
  var directoryName: js.UndefOr[String] = js.undefined
  
  /**
    * The DNS IP address.
    */
  var dnsIpAddresses: js.UndefOr[ActiveDirectoryDnsIpAddressList] = js.undefined
  
  /**
    * The name for the organizational unit distinguished name.
    */
  var organizationalUnitDistinguishedName: js.UndefOr[ActiveDirectoryOrganizationalUnitDistinguishedName] = js.undefined
  
  /**
    * The unique identifier for a studio component resource.
    */
  var studioComponentId: js.UndefOr[StudioComponentId] = js.undefined
  
  /**
    * The name for the studio component.
    */
  var studioComponentName: js.UndefOr[StudioComponentName] = js.undefined
}
object LaunchProfileInitializationActiveDirectory {
  
  inline def apply(): LaunchProfileInitializationActiveDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchProfileInitializationActiveDirectory]
  }
  
  extension [Self <: LaunchProfileInitializationActiveDirectory](x: Self) {
    
    inline def setComputerAttributes(value: ActiveDirectoryComputerAttributeList): Self = StObject.set(x, "computerAttributes", value.asInstanceOf[js.Any])
    
    inline def setComputerAttributesUndefined: Self = StObject.set(x, "computerAttributes", js.undefined)
    
    inline def setComputerAttributesVarargs(value: ActiveDirectoryComputerAttribute*): Self = StObject.set(x, "computerAttributes", js.Array(value*))
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "directoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "directoryId", js.undefined)
    
    inline def setDirectoryName(value: String): Self = StObject.set(x, "directoryName", value.asInstanceOf[js.Any])
    
    inline def setDirectoryNameUndefined: Self = StObject.set(x, "directoryName", js.undefined)
    
    inline def setDnsIpAddresses(value: ActiveDirectoryDnsIpAddressList): Self = StObject.set(x, "dnsIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setDnsIpAddressesUndefined: Self = StObject.set(x, "dnsIpAddresses", js.undefined)
    
    inline def setDnsIpAddressesVarargs(value: ActiveDirectoryDnsIpAddress*): Self = StObject.set(x, "dnsIpAddresses", js.Array(value*))
    
    inline def setOrganizationalUnitDistinguishedName(value: ActiveDirectoryOrganizationalUnitDistinguishedName): Self = StObject.set(x, "organizationalUnitDistinguishedName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitDistinguishedNameUndefined: Self = StObject.set(x, "organizationalUnitDistinguishedName", js.undefined)
    
    inline def setStudioComponentId(value: StudioComponentId): Self = StObject.set(x, "studioComponentId", value.asInstanceOf[js.Any])
    
    inline def setStudioComponentIdUndefined: Self = StObject.set(x, "studioComponentId", js.undefined)
    
    inline def setStudioComponentName(value: StudioComponentName): Self = StObject.set(x, "studioComponentName", value.asInstanceOf[js.Any])
    
    inline def setStudioComponentNameUndefined: Self = StObject.set(x, "studioComponentName", js.undefined)
  }
}
