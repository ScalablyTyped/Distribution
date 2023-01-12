package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyClusterSubnetGroupResult extends StObject {
  
  var ClusterSubnetGroup: js.UndefOr[typings.awsSdk.clientsRedshiftMod.ClusterSubnetGroup] = js.undefined
}
object ModifyClusterSubnetGroupResult {
  
  inline def apply(): ModifyClusterSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyClusterSubnetGroupResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyClusterSubnetGroupResult] (val x: Self) extends AnyVal {
    
    inline def setClusterSubnetGroup(value: ClusterSubnetGroup): Self = StObject.set(x, "ClusterSubnetGroup", value.asInstanceOf[js.Any])
    
    inline def setClusterSubnetGroupUndefined: Self = StObject.set(x, "ClusterSubnetGroup", js.undefined)
  }
}
