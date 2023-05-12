package typings.awsSdk.clientsLicensemanagerlinuxsubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinuxSubscriptionsDiscoverySettings extends StObject {
  
  /**
    * Details if you have enabled resource discovery across your accounts in Organizations.
    */
  var OrganizationIntegration: typings.awsSdk.clientsLicensemanagerlinuxsubscriptionsMod.OrganizationIntegration
  
  /**
    * The Regions in which to discover data for Linux subscriptions.
    */
  var SourceRegions: StringList
}
object LinuxSubscriptionsDiscoverySettings {
  
  inline def apply(OrganizationIntegration: OrganizationIntegration, SourceRegions: StringList): LinuxSubscriptionsDiscoverySettings = {
    val __obj = js.Dynamic.literal(OrganizationIntegration = OrganizationIntegration.asInstanceOf[js.Any], SourceRegions = SourceRegions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinuxSubscriptionsDiscoverySettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinuxSubscriptionsDiscoverySettings] (val x: Self) extends AnyVal {
    
    inline def setOrganizationIntegration(value: OrganizationIntegration): Self = StObject.set(x, "OrganizationIntegration", value.asInstanceOf[js.Any])
    
    inline def setSourceRegions(value: StringList): Self = StObject.set(x, "SourceRegions", value.asInstanceOf[js.Any])
    
    inline def setSourceRegionsVarargs(value: StringListMemberString*): Self = StObject.set(x, "SourceRegions", js.Array(value*))
  }
}
