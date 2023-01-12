package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryDataReplicationRequest extends StObject {
  
  /**
    * The ID of the Source Server whose data replication should be retried.
    */
  var sourceServerID: SourceServerID
}
object RetryDataReplicationRequest {
  
  inline def apply(sourceServerID: SourceServerID): RetryDataReplicationRequest = {
    val __obj = js.Dynamic.literal(sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryDataReplicationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RetryDataReplicationRequest] (val x: Self) extends AnyVal {
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
  }
}
