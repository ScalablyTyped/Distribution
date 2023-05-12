package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExistingObjectReplication extends StObject {
  
  /**
    * Specifies whether Amazon S3 replicates existing source bucket objects. 
    */
  var Status: ExistingObjectReplicationStatus
}
object ExistingObjectReplication {
  
  inline def apply(Status: ExistingObjectReplicationStatus): ExistingObjectReplication = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistingObjectReplication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExistingObjectReplication] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: ExistingObjectReplicationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
