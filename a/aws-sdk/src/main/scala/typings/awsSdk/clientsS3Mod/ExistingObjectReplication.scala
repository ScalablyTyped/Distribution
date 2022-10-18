package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExistingObjectReplication extends StObject {
  
  /**
    * 
    */
  var Status: ExistingObjectReplicationStatus
}
object ExistingObjectReplication {
  
  inline def apply(Status: ExistingObjectReplicationStatus): ExistingObjectReplication = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistingObjectReplication]
  }
  
  extension [Self <: ExistingObjectReplication](x: Self) {
    
    inline def setStatus(value: ExistingObjectReplicationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
