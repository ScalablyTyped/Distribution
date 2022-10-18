package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountLevelBpaSync extends StObject {
  
  /**
    * A Boolean value that indicates whether account-level block public access is affecting your Lightsail buckets.
    */
  var bpaImpactsLightsail: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The timestamp of when the account-level BPA configuration was last synchronized. This value is null when the account-level BPA configuration has not been synchronized.
    */
  var lastSyncedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A message that provides a reason for a Failed or Defaulted synchronization status. The following messages are possible:    SYNC_ON_HOLD - The synchronization has not yet happened. This status message occurs immediately after you create your first Lightsail bucket. This status message should change after the first synchronization happens, approximately 1 hour after the first bucket is created.    DEFAULTED_FOR_SLR_MISSING - The synchronization failed because the required service-linked role is missing from your Amazon Web Services account. The account-level BPA configuration for your Lightsail buckets is defaulted to active until the synchronization can occur. This means that all your buckets are private and not publicly accessible. For more information about how to create the required service-linked role to allow synchronization, see Using Service-Linked Roles for Amazon Lightsail in the Amazon Lightsail Developer Guide.    DEFAULTED_FOR_SLR_MISSING_ON_HOLD - The synchronization failed because the required service-linked role is missing from your Amazon Web Services account. Account-level BPA is not yet configured for your Lightsail buckets. Therefore, only the bucket access permissions and individual object access permissions apply to your Lightsail buckets. For more information about how to create the required service-linked role to allow synchronization, see Using Service-Linked Roles for Amazon Lightsail in the Amazon Lightsail Developer Guide.    Unknown - The reason that synchronization failed is unknown. Contact Amazon Web Services Support for more information.  
    */
  var message: js.UndefOr[BPAStatusMessage] = js.undefined
  
  /**
    * The status of the account-level BPA synchronization. The following statuses are possible:    InSync - Account-level BPA is synchronized. The Amazon S3 account-level BPA configuration applies to your Lightsail buckets.    NeverSynced - Synchronization has not yet happened. The Amazon S3 account-level BPA configuration does not apply to your Lightsail buckets.    Failed - Synchronization failed. The Amazon S3 account-level BPA configuration does not apply to your Lightsail buckets.    Defaulted - Synchronization failed and account-level BPA for your Lightsail buckets is defaulted to active.    You might need to complete further actions if the status is Failed or Defaulted. The message parameter provides more information for those statuses. 
    */
  var status: js.UndefOr[AccountLevelBpaSyncStatus] = js.undefined
}
object AccountLevelBpaSync {
  
  inline def apply(): AccountLevelBpaSync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountLevelBpaSync]
  }
  
  extension [Self <: AccountLevelBpaSync](x: Self) {
    
    inline def setBpaImpactsLightsail(value: Boolean): Self = StObject.set(x, "bpaImpactsLightsail", value.asInstanceOf[js.Any])
    
    inline def setBpaImpactsLightsailUndefined: Self = StObject.set(x, "bpaImpactsLightsail", js.undefined)
    
    inline def setLastSyncedAt(value: js.Date): Self = StObject.set(x, "lastSyncedAt", value.asInstanceOf[js.Any])
    
    inline def setLastSyncedAtUndefined: Self = StObject.set(x, "lastSyncedAt", js.undefined)
    
    inline def setMessage(value: BPAStatusMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setStatus(value: AccountLevelBpaSyncStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
