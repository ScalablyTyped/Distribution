package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopReplicationRequest extends StObject {
  
  /**
    * The ID of the Source Server to stop replication for.
    */
  var sourceServerID: SourceServerID
}
object StopReplicationRequest {
  
  inline def apply(sourceServerID: SourceServerID): StopReplicationRequest = {
    val __obj = js.Dynamic.literal(sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopReplicationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopReplicationRequest] (val x: Self) extends AnyVal {
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
  }
}
