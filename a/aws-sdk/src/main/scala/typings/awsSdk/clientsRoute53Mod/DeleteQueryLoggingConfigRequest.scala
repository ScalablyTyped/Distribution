package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteQueryLoggingConfigRequest extends StObject {
  
  /**
    * The ID of the configuration that you want to delete. 
    */
  var Id: QueryLoggingConfigId
}
object DeleteQueryLoggingConfigRequest {
  
  inline def apply(Id: QueryLoggingConfigId): DeleteQueryLoggingConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteQueryLoggingConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteQueryLoggingConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: QueryLoggingConfigId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
