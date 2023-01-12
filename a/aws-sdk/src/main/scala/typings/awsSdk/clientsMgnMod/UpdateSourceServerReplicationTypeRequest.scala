package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSourceServerReplicationTypeRequest extends StObject {
  
  /**
    * Replication type to which to update source server.
    */
  var replicationType: ReplicationType
  
  /**
    * ID of source server on which to update replication type.
    */
  var sourceServerID: SourceServerID
}
object UpdateSourceServerReplicationTypeRequest {
  
  inline def apply(replicationType: ReplicationType, sourceServerID: SourceServerID): UpdateSourceServerReplicationTypeRequest = {
    val __obj = js.Dynamic.literal(replicationType = replicationType.asInstanceOf[js.Any], sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSourceServerReplicationTypeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSourceServerReplicationTypeRequest] (val x: Self) extends AnyVal {
    
    inline def setReplicationType(value: ReplicationType): Self = StObject.set(x, "replicationType", value.asInstanceOf[js.Any])
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
  }
}
