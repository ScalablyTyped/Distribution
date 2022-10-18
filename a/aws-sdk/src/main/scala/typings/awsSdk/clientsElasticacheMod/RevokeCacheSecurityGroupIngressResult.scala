package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeCacheSecurityGroupIngressResult extends StObject {
  
  var CacheSecurityGroup: js.UndefOr[typings.awsSdk.clientsElasticacheMod.CacheSecurityGroup] = js.undefined
}
object RevokeCacheSecurityGroupIngressResult {
  
  inline def apply(): RevokeCacheSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeCacheSecurityGroupIngressResult]
  }
  
  extension [Self <: RevokeCacheSecurityGroupIngressResult](x: Self) {
    
    inline def setCacheSecurityGroup(value: CacheSecurityGroup): Self = StObject.set(x, "CacheSecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setCacheSecurityGroupUndefined: Self = StObject.set(x, "CacheSecurityGroup", js.undefined)
  }
}
