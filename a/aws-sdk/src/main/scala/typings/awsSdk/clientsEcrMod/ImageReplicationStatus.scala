package typings.awsSdk.clientsEcrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageReplicationStatus extends StObject {
  
  /**
    * The failure code for a replication that has failed.
    */
  var failureCode: js.UndefOr[ReplicationError] = js.undefined
  
  /**
    * The destination Region for the image replication.
    */
  var region: js.UndefOr[Region] = js.undefined
  
  /**
    * The Amazon Web Services account ID associated with the registry to which the image belongs.
    */
  var registryId: js.UndefOr[RegistryId] = js.undefined
  
  /**
    * The image replication status.
    */
  var status: js.UndefOr[ReplicationStatus] = js.undefined
}
object ImageReplicationStatus {
  
  inline def apply(): ImageReplicationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageReplicationStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageReplicationStatus] (val x: Self) extends AnyVal {
    
    inline def setFailureCode(value: ReplicationError): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRegistryId(value: RegistryId): Self = StObject.set(x, "registryId", value.asInstanceOf[js.Any])
    
    inline def setRegistryIdUndefined: Self = StObject.set(x, "registryId", js.undefined)
    
    inline def setStatus(value: ReplicationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
