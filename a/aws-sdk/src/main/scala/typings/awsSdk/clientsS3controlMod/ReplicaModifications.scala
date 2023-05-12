package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaModifications extends StObject {
  
  /**
    * Specifies whether S3 on Outposts replicates modifications to object metadata on replicas.
    */
  var Status: ReplicaModificationsStatus
}
object ReplicaModifications {
  
  inline def apply(Status: ReplicaModificationsStatus): ReplicaModifications = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaModifications]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicaModifications] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: ReplicaModificationsStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
