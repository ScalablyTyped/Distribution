package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceError extends StObject {
  
  /**
    * When the error occurred.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * A message that describes the error.
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    * The error ID.
    */
  var ServiceErrorId: js.UndefOr[String] = js.undefined
  
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
  
  /**
    * The error type.
    */
  var Type: js.UndefOr[String] = js.undefined
}
object ServiceError {
  
  inline def apply(): ServiceError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceError]
  }
  
  extension [Self <: ServiceError](x: Self) {
    
    inline def setCreatedAt(value: DateTime): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setServiceErrorId(value: String): Self = StObject.set(x, "ServiceErrorId", value.asInstanceOf[js.Any])
    
    inline def setServiceErrorIdUndefined: Self = StObject.set(x, "ServiceErrorId", js.undefined)
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
