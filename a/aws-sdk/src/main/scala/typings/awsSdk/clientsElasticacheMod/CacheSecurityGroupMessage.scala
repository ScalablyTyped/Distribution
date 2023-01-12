package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheSecurityGroupMessage extends StObject {
  
  /**
    * A list of cache security groups. Each element in the list contains detailed information about one group.
    */
  var CacheSecurityGroups: js.UndefOr[typings.awsSdk.clientsElasticacheMod.CacheSecurityGroups] = js.undefined
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.undefined
}
object CacheSecurityGroupMessage {
  
  inline def apply(): CacheSecurityGroupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheSecurityGroupMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheSecurityGroupMessage] (val x: Self) extends AnyVal {
    
    inline def setCacheSecurityGroups(value: CacheSecurityGroups): Self = StObject.set(x, "CacheSecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setCacheSecurityGroupsUndefined: Self = StObject.set(x, "CacheSecurityGroups", js.undefined)
    
    inline def setCacheSecurityGroupsVarargs(value: CacheSecurityGroup*): Self = StObject.set(x, "CacheSecurityGroups", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
