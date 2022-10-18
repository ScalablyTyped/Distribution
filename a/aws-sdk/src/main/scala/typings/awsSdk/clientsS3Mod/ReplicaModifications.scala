package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaModifications extends StObject {
  
  /**
    * Specifies whether Amazon S3 replicates modifications on replicas.
    */
  var Status: ReplicaModificationsStatus
}
object ReplicaModifications {
  
  inline def apply(Status: ReplicaModificationsStatus): ReplicaModifications = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaModifications]
  }
  
  extension [Self <: ReplicaModifications](x: Self) {
    
    inline def setStatus(value: ReplicaModificationsStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
