package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeCacheSecurityGroupIngressResult extends StObject {
  
  var CacheSecurityGroup: js.UndefOr[typings.awsSdk.clientsElasticacheMod.CacheSecurityGroup] = js.undefined
}
object AuthorizeCacheSecurityGroupIngressResult {
  
  inline def apply(): AuthorizeCacheSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeCacheSecurityGroupIngressResult]
  }
  
  extension [Self <: AuthorizeCacheSecurityGroupIngressResult](x: Self) {
    
    inline def setCacheSecurityGroup(value: CacheSecurityGroup): Self = StObject.set(x, "CacheSecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setCacheSecurityGroupUndefined: Self = StObject.set(x, "CacheSecurityGroup", js.undefined)
  }
}
