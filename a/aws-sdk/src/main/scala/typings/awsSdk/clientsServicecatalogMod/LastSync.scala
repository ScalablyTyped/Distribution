package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastSync extends StObject {
  
  /**
    * The ProvisioningArtifactID of the ProvisioningArtifact created from the latest successful sync. 
    */
  var LastSuccessfulSyncProvisioningArtifactId: js.UndefOr[Id] = js.undefined
  
  /**
    * The time of the latest successful sync from the source repo artifact to the Service Catalog product.
    */
  var LastSuccessfulSyncTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current status of the sync. Responses include SUCCEEDED or FAILED. 
    */
  var LastSyncStatus: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.LastSyncStatus] = js.undefined
  
  /**
    * The sync's status message. 
    */
  var LastSyncStatusMessage: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.LastSyncStatusMessage] = js.undefined
  
  /**
    * The time of the last attempted sync from the repository to the Service Catalog product. 
    */
  var LastSyncTime: js.UndefOr[js.Date] = js.undefined
}
object LastSync {
  
  inline def apply(): LastSync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastSync]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LastSync] (val x: Self) extends AnyVal {
    
    inline def setLastSuccessfulSyncProvisioningArtifactId(value: Id): Self = StObject.set(x, "LastSuccessfulSyncProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulSyncProvisioningArtifactIdUndefined: Self = StObject.set(x, "LastSuccessfulSyncProvisioningArtifactId", js.undefined)
    
    inline def setLastSuccessfulSyncTime(value: js.Date): Self = StObject.set(x, "LastSuccessfulSyncTime", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulSyncTimeUndefined: Self = StObject.set(x, "LastSuccessfulSyncTime", js.undefined)
    
    inline def setLastSyncStatus(value: LastSyncStatus): Self = StObject.set(x, "LastSyncStatus", value.asInstanceOf[js.Any])
    
    inline def setLastSyncStatusMessage(value: LastSyncStatusMessage): Self = StObject.set(x, "LastSyncStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setLastSyncStatusMessageUndefined: Self = StObject.set(x, "LastSyncStatusMessage", js.undefined)
    
    inline def setLastSyncStatusUndefined: Self = StObject.set(x, "LastSyncStatus", js.undefined)
    
    inline def setLastSyncTime(value: js.Date): Self = StObject.set(x, "LastSyncTime", value.asInstanceOf[js.Any])
    
    inline def setLastSyncTimeUndefined: Self = StObject.set(x, "LastSyncTime", js.undefined)
  }
}
