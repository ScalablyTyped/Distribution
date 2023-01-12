package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteReplicationConfigurationTemplateRequest extends StObject {
  
  /**
    * The ID of the Replication Configuration Template to be deleted.
    */
  var replicationConfigurationTemplateID: ReplicationConfigurationTemplateID
}
object DeleteReplicationConfigurationTemplateRequest {
  
  inline def apply(replicationConfigurationTemplateID: ReplicationConfigurationTemplateID): DeleteReplicationConfigurationTemplateRequest = {
    val __obj = js.Dynamic.literal(replicationConfigurationTemplateID = replicationConfigurationTemplateID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReplicationConfigurationTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteReplicationConfigurationTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setReplicationConfigurationTemplateID(value: ReplicationConfigurationTemplateID): Self = StObject.set(x, "replicationConfigurationTemplateID", value.asInstanceOf[js.Any])
  }
}
