package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestConnectionMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var EndpointArn: String
  
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: String
}
object TestConnectionMessage {
  
  inline def apply(EndpointArn: String, ReplicationInstanceArn: String): TestConnectionMessage = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any], ReplicationInstanceArn = ReplicationInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestConnectionMessage]
  }
  
  extension [Self <: TestConnectionMessage](x: Self) {
    
    inline def setEndpointArn(value: String): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    inline def setReplicationInstanceArn(value: String): Self = StObject.set(x, "ReplicationInstanceArn", value.asInstanceOf[js.Any])
  }
}
