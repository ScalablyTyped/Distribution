package typings.awsSdk.clientsLicensemanagerlinuxsubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceSettingsResponse extends StObject {
  
  /**
    * The Region in which License Manager displays the aggregated data for Linux subscriptions.
    */
  var HomeRegions: js.UndefOr[StringList] = js.undefined
  
  /**
    * Lists if discovery has been enabled for Linux subscriptions.
    */
  var LinuxSubscriptionsDiscovery: js.UndefOr[
    typings.awsSdk.clientsLicensemanagerlinuxsubscriptionsMod.LinuxSubscriptionsDiscovery
  ] = js.undefined
  
  /**
    * Lists the settings defined for Linux subscriptions discovery. The settings include if Organizations integration has been enabled, and which Regions data will be aggregated from.
    */
  var LinuxSubscriptionsDiscoverySettings: js.UndefOr[
    typings.awsSdk.clientsLicensemanagerlinuxsubscriptionsMod.LinuxSubscriptionsDiscoverySettings
  ] = js.undefined
  
  /**
    * Indicates the status of Linux subscriptions settings being applied.
    */
  var Status: js.UndefOr[typings.awsSdk.clientsLicensemanagerlinuxsubscriptionsMod.Status] = js.undefined
  
  /**
    * A message which details the Linux subscriptions service settings current status.
    */
  var StatusMessage: js.UndefOr[StringMap] = js.undefined
}
object GetServiceSettingsResponse {
  
  inline def apply(): GetServiceSettingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceSettingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceSettingsResponse] (val x: Self) extends AnyVal {
    
    inline def setHomeRegions(value: StringList): Self = StObject.set(x, "HomeRegions", value.asInstanceOf[js.Any])
    
    inline def setHomeRegionsUndefined: Self = StObject.set(x, "HomeRegions", js.undefined)
    
    inline def setHomeRegionsVarargs(value: StringListMemberString*): Self = StObject.set(x, "HomeRegions", js.Array(value*))
    
    inline def setLinuxSubscriptionsDiscovery(value: LinuxSubscriptionsDiscovery): Self = StObject.set(x, "LinuxSubscriptionsDiscovery", value.asInstanceOf[js.Any])
    
    inline def setLinuxSubscriptionsDiscoverySettings(value: LinuxSubscriptionsDiscoverySettings): Self = StObject.set(x, "LinuxSubscriptionsDiscoverySettings", value.asInstanceOf[js.Any])
    
    inline def setLinuxSubscriptionsDiscoverySettingsUndefined: Self = StObject.set(x, "LinuxSubscriptionsDiscoverySettings", js.undefined)
    
    inline def setLinuxSubscriptionsDiscoveryUndefined: Self = StObject.set(x, "LinuxSubscriptionsDiscovery", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: StringMap): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
