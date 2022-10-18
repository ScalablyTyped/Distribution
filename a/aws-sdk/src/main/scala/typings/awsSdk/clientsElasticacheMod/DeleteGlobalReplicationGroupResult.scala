package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGlobalReplicationGroupResult extends StObject {
  
  var GlobalReplicationGroup: js.UndefOr[typings.awsSdk.clientsElasticacheMod.GlobalReplicationGroup] = js.undefined
}
object DeleteGlobalReplicationGroupResult {
  
  inline def apply(): DeleteGlobalReplicationGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGlobalReplicationGroupResult]
  }
  
  extension [Self <: DeleteGlobalReplicationGroupResult](x: Self) {
    
    inline def setGlobalReplicationGroup(value: GlobalReplicationGroup): Self = StObject.set(x, "GlobalReplicationGroup", value.asInstanceOf[js.Any])
    
    inline def setGlobalReplicationGroupUndefined: Self = StObject.set(x, "GlobalReplicationGroup", js.undefined)
  }
}
