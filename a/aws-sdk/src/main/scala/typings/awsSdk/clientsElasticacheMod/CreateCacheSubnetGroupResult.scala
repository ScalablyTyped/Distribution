package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCacheSubnetGroupResult extends StObject {
  
  var CacheSubnetGroup: js.UndefOr[typings.awsSdk.clientsElasticacheMod.CacheSubnetGroup] = js.undefined
}
object CreateCacheSubnetGroupResult {
  
  inline def apply(): CreateCacheSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCacheSubnetGroupResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCacheSubnetGroupResult] (val x: Self) extends AnyVal {
    
    inline def setCacheSubnetGroup(value: CacheSubnetGroup): Self = StObject.set(x, "CacheSubnetGroup", value.asInstanceOf[js.Any])
    
    inline def setCacheSubnetGroupUndefined: Self = StObject.set(x, "CacheSubnetGroup", js.undefined)
  }
}
