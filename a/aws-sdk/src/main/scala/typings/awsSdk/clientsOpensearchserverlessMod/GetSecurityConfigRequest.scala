package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSecurityConfigRequest extends StObject {
  
  /**
    * The unique identifier of the security configuration.
    */
  var id: SecurityConfigId
}
object GetSecurityConfigRequest {
  
  inline def apply(id: SecurityConfigId): GetSecurityConfigRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSecurityConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSecurityConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: SecurityConfigId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
