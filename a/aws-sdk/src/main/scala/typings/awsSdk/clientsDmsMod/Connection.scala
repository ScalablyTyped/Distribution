package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connection extends StObject {
  
  /**
    * The ARN string that uniquely identifies the endpoint.
    */
  var EndpointArn: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the endpoint. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
    */
  var EndpointIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The error message when the connection last failed.
    */
  var LastFailureMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the replication instance.
    */
  var ReplicationInstanceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The replication instance identifier. This parameter is stored as a lowercase string.
    */
  var ReplicationInstanceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The connection status. This parameter can return one of the following values:    "successful"     "testing"     "failed"     "deleting"   
    */
  var Status: js.UndefOr[String] = js.undefined
}
object Connection {
  
  inline def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  
  extension [Self <: Connection](x: Self) {
    
    inline def setEndpointArn(value: String): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointArnUndefined: Self = StObject.set(x, "EndpointArn", js.undefined)
    
    inline def setEndpointIdentifier(value: String): Self = StObject.set(x, "EndpointIdentifier", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdentifierUndefined: Self = StObject.set(x, "EndpointIdentifier", js.undefined)
    
    inline def setLastFailureMessage(value: String): Self = StObject.set(x, "LastFailureMessage", value.asInstanceOf[js.Any])
    
    inline def setLastFailureMessageUndefined: Self = StObject.set(x, "LastFailureMessage", js.undefined)
    
    inline def setReplicationInstanceArn(value: String): Self = StObject.set(x, "ReplicationInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setReplicationInstanceArnUndefined: Self = StObject.set(x, "ReplicationInstanceArn", js.undefined)
    
    inline def setReplicationInstanceIdentifier(value: String): Self = StObject.set(x, "ReplicationInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setReplicationInstanceIdentifierUndefined: Self = StObject.set(x, "ReplicationInstanceIdentifier", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
