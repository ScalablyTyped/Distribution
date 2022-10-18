package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCacheParameterGroupResult extends StObject {
  
  var CacheParameterGroup: js.UndefOr[typings.awsSdk.clientsElasticacheMod.CacheParameterGroup] = js.undefined
}
object CreateCacheParameterGroupResult {
  
  inline def apply(): CreateCacheParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCacheParameterGroupResult]
  }
  
  extension [Self <: CreateCacheParameterGroupResult](x: Self) {
    
    inline def setCacheParameterGroup(value: CacheParameterGroup): Self = StObject.set(x, "CacheParameterGroup", value.asInstanceOf[js.Any])
    
    inline def setCacheParameterGroupUndefined: Self = StObject.set(x, "CacheParameterGroup", js.undefined)
  }
}
