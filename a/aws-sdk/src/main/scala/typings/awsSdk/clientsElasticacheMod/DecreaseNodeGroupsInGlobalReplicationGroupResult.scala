package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecreaseNodeGroupsInGlobalReplicationGroupResult extends StObject {
  
  var GlobalReplicationGroup: js.UndefOr[typings.awsSdk.clientsElasticacheMod.GlobalReplicationGroup] = js.undefined
}
object DecreaseNodeGroupsInGlobalReplicationGroupResult {
  
  inline def apply(): DecreaseNodeGroupsInGlobalReplicationGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecreaseNodeGroupsInGlobalReplicationGroupResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecreaseNodeGroupsInGlobalReplicationGroupResult] (val x: Self) extends AnyVal {
    
    inline def setGlobalReplicationGroup(value: GlobalReplicationGroup): Self = StObject.set(x, "GlobalReplicationGroup", value.asInstanceOf[js.Any])
    
    inline def setGlobalReplicationGroupUndefined: Self = StObject.set(x, "GlobalReplicationGroup", js.undefined)
  }
}
