package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSecurityConfigResponse extends StObject {
  
  /**
    * Details about the updated security configuration. 
    */
  var securityConfigDetail: js.UndefOr[SecurityConfigDetail] = js.undefined
}
object UpdateSecurityConfigResponse {
  
  inline def apply(): UpdateSecurityConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSecurityConfigResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSecurityConfigResponse] (val x: Self) extends AnyVal {
    
    inline def setSecurityConfigDetail(value: SecurityConfigDetail): Self = StObject.set(x, "securityConfigDetail", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfigDetailUndefined: Self = StObject.set(x, "securityConfigDetail", js.undefined)
  }
}
