package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMarkerReplication extends StObject {
  
  /**
    * Indicates whether to replicate delete markers.
    */
  var Status: DeleteMarkerReplicationStatus
}
object DeleteMarkerReplication {
  
  inline def apply(Status: DeleteMarkerReplicationStatus): DeleteMarkerReplication = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMarkerReplication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMarkerReplication] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: DeleteMarkerReplicationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
