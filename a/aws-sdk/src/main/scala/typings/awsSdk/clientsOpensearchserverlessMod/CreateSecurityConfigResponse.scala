package typings.awsSdk.clientsOpensearchserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSecurityConfigResponse extends StObject {
  
  /**
    * Details about the created security configuration. 
    */
  var securityConfigDetail: js.UndefOr[SecurityConfigDetail] = js.undefined
}
object CreateSecurityConfigResponse {
  
  inline def apply(): CreateSecurityConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSecurityConfigResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSecurityConfigResponse] (val x: Self) extends AnyVal {
    
    inline def setSecurityConfigDetail(value: SecurityConfigDetail): Self = StObject.set(x, "securityConfigDetail", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfigDetailUndefined: Self = StObject.set(x, "securityConfigDetail", js.undefined)
  }
}
