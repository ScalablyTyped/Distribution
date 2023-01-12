package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCacheSecurityGroupMessage extends StObject {
  
  /**
    * The name of the cache security group to delete.  You cannot delete the default security group. 
    */
  var CacheSecurityGroupName: String
}
object DeleteCacheSecurityGroupMessage {
  
  inline def apply(CacheSecurityGroupName: String): DeleteCacheSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(CacheSecurityGroupName = CacheSecurityGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCacheSecurityGroupMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCacheSecurityGroupMessage] (val x: Self) extends AnyVal {
    
    inline def setCacheSecurityGroupName(value: String): Self = StObject.set(x, "CacheSecurityGroupName", value.asInstanceOf[js.Any])
  }
}
