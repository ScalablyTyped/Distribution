package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReplicationRequest extends StObject {
  
  /**
    * The ID of the Source Server to start replication for.
    */
  var sourceServerID: SourceServerID
}
object StartReplicationRequest {
  
  inline def apply(sourceServerID: SourceServerID): StartReplicationRequest = {
    val __obj = js.Dynamic.literal(sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReplicationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartReplicationRequest] (val x: Self) extends AnyVal {
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
  }
}
