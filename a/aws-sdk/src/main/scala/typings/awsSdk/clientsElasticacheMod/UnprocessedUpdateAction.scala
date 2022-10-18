package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnprocessedUpdateAction extends StObject {
  
  /**
    * The ID of the cache cluster
    */
  var CacheClusterId: js.UndefOr[String] = js.undefined
  
  /**
    * The error message that describes the reason the request was not processed
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The error type for requests that are not processed
    */
  var ErrorType: js.UndefOr[String] = js.undefined
  
  /**
    * The replication group ID
    */
  var ReplicationGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.undefined
}
object UnprocessedUpdateAction {
  
  inline def apply(): UnprocessedUpdateAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnprocessedUpdateAction]
  }
  
  extension [Self <: UnprocessedUpdateAction](x: Self) {
    
    inline def setCacheClusterId(value: String): Self = StObject.set(x, "CacheClusterId", value.asInstanceOf[js.Any])
    
    inline def setCacheClusterIdUndefined: Self = StObject.set(x, "CacheClusterId", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setErrorType(value: String): Self = StObject.set(x, "ErrorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "ErrorType", js.undefined)
    
    inline def setReplicationGroupId(value: String): Self = StObject.set(x, "ReplicationGroupId", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupIdUndefined: Self = StObject.set(x, "ReplicationGroupId", js.undefined)
    
    inline def setServiceUpdateName(value: String): Self = StObject.set(x, "ServiceUpdateName", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateNameUndefined: Self = StObject.set(x, "ServiceUpdateName", js.undefined)
  }
}
