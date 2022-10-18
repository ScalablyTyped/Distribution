package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCacheSubnetGroupMessage extends StObject {
  
  /**
    * The name of the cache subnet group to delete. Constraints: Must contain no more than 255 alphanumeric characters or hyphens.
    */
  var CacheSubnetGroupName: String
}
object DeleteCacheSubnetGroupMessage {
  
  inline def apply(CacheSubnetGroupName: String): DeleteCacheSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(CacheSubnetGroupName = CacheSubnetGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCacheSubnetGroupMessage]
  }
  
  extension [Self <: DeleteCacheSubnetGroupMessage](x: Self) {
    
    inline def setCacheSubnetGroupName(value: String): Self = StObject.set(x, "CacheSubnetGroupName", value.asInstanceOf[js.Any])
  }
}
