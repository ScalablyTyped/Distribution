package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshSchemasStatus extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var EndpointArn: js.UndefOr[String] = js.undefined
  
  /**
    * The last failure message for the schema.
    */
  var LastFailureMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The date the schema was last refreshed.
    */
  var LastRefreshDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  var ReplicationInstanceArn: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the schema.
    */
  var Status: js.UndefOr[RefreshSchemasStatusTypeValue] = js.undefined
}
object RefreshSchemasStatus {
  
  inline def apply(): RefreshSchemasStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshSchemasStatus]
  }
  
  extension [Self <: RefreshSchemasStatus](x: Self) {
    
    inline def setEndpointArn(value: String): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointArnUndefined: Self = StObject.set(x, "EndpointArn", js.undefined)
    
    inline def setLastFailureMessage(value: String): Self = StObject.set(x, "LastFailureMessage", value.asInstanceOf[js.Any])
    
    inline def setLastFailureMessageUndefined: Self = StObject.set(x, "LastFailureMessage", js.undefined)
    
    inline def setLastRefreshDate(value: js.Date): Self = StObject.set(x, "LastRefreshDate", value.asInstanceOf[js.Any])
    
    inline def setLastRefreshDateUndefined: Self = StObject.set(x, "LastRefreshDate", js.undefined)
    
    inline def setReplicationInstanceArn(value: String): Self = StObject.set(x, "ReplicationInstanceArn", value.asInstanceOf[js.Any])
    
    inline def setReplicationInstanceArnUndefined: Self = StObject.set(x, "ReplicationInstanceArn", js.undefined)
    
    inline def setStatus(value: RefreshSchemasStatusTypeValue): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
