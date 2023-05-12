package typings.awsSdk.clientsLicensemanagerlinuxsubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceSettingsRequest extends StObject {
  
  /**
    * Describes if updates are allowed to the service settings for Linux subscriptions. If you allow updates, you can aggregate Linux subscription data in more than one home Region.
    */
  var AllowUpdate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Describes if the discovery of Linux subscriptions is enabled.
    */
  var LinuxSubscriptionsDiscovery: typings.awsSdk.clientsLicensemanagerlinuxsubscriptionsMod.LinuxSubscriptionsDiscovery
  
  /**
    * The settings defined for Linux subscriptions discovery. The settings include if Organizations integration has been enabled, and which Regions data will be aggregated from.
    */
  var LinuxSubscriptionsDiscoverySettings: typings.awsSdk.clientsLicensemanagerlinuxsubscriptionsMod.LinuxSubscriptionsDiscoverySettings
}
object UpdateServiceSettingsRequest {
  
  inline def apply(
    LinuxSubscriptionsDiscovery: LinuxSubscriptionsDiscovery,
    LinuxSubscriptionsDiscoverySettings: LinuxSubscriptionsDiscoverySettings
  ): UpdateServiceSettingsRequest = {
    val __obj = js.Dynamic.literal(LinuxSubscriptionsDiscovery = LinuxSubscriptionsDiscovery.asInstanceOf[js.Any], LinuxSubscriptionsDiscoverySettings = LinuxSubscriptionsDiscoverySettings.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceSettingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateServiceSettingsRequest] (val x: Self) extends AnyVal {
    
    inline def setAllowUpdate(value: Boolean): Self = StObject.set(x, "AllowUpdate", value.asInstanceOf[js.Any])
    
    inline def setAllowUpdateUndefined: Self = StObject.set(x, "AllowUpdate", js.undefined)
    
    inline def setLinuxSubscriptionsDiscovery(value: LinuxSubscriptionsDiscovery): Self = StObject.set(x, "LinuxSubscriptionsDiscovery", value.asInstanceOf[js.Any])
    
    inline def setLinuxSubscriptionsDiscoverySettings(value: LinuxSubscriptionsDiscoverySettings): Self = StObject.set(x, "LinuxSubscriptionsDiscoverySettings", value.asInstanceOf[js.Any])
  }
}
