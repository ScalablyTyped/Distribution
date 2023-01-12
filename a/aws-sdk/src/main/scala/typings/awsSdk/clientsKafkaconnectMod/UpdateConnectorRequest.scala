package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectorRequest extends StObject {
  
  /**
    * The target capacity.
    */
  var capacity: CapacityUpdate
  
  /**
    * The Amazon Resource Name (ARN) of the connector that you want to update.
    */
  var connectorArn: string
  
  /**
    * The current version of the connector that you want to update.
    */
  var currentVersion: string
}
object UpdateConnectorRequest {
  
  inline def apply(capacity: CapacityUpdate, connectorArn: string, currentVersion: string): UpdateConnectorRequest = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], connectorArn = connectorArn.asInstanceOf[js.Any], currentVersion = currentVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConnectorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateConnectorRequest] (val x: Self) extends AnyVal {
    
    inline def setCapacity(value: CapacityUpdate): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setConnectorArn(value: string): Self = StObject.set(x, "connectorArn", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersion(value: string): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
  }
}
