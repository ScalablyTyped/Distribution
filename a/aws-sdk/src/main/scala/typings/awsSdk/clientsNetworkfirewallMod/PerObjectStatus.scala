package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerObjectStatus extends StObject {
  
  /**
    * Indicates whether this object is in sync with the version indicated in the update token.
    */
  var SyncStatus: js.UndefOr[PerObjectSyncStatus] = js.undefined
  
  /**
    * The current version of the object that is either in sync or pending synchronization. 
    */
  var UpdateToken: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.UpdateToken] = js.undefined
}
object PerObjectStatus {
  
  inline def apply(): PerObjectStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerObjectStatus]
  }
  
  extension [Self <: PerObjectStatus](x: Self) {
    
    inline def setSyncStatus(value: PerObjectSyncStatus): Self = StObject.set(x, "SyncStatus", value.asInstanceOf[js.Any])
    
    inline def setSyncStatusUndefined: Self = StObject.set(x, "SyncStatus", js.undefined)
    
    inline def setUpdateToken(value: UpdateToken): Self = StObject.set(x, "UpdateToken", value.asInstanceOf[js.Any])
    
    inline def setUpdateTokenUndefined: Self = StObject.set(x, "UpdateToken", js.undefined)
  }
}
