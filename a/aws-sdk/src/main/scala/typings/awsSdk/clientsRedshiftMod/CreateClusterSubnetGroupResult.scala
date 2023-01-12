package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterSubnetGroupResult extends StObject {
  
  var ClusterSubnetGroup: js.UndefOr[typings.awsSdk.clientsRedshiftMod.ClusterSubnetGroup] = js.undefined
}
object CreateClusterSubnetGroupResult {
  
  inline def apply(): CreateClusterSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterSubnetGroupResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateClusterSubnetGroupResult] (val x: Self) extends AnyVal {
    
    inline def setClusterSubnetGroup(value: ClusterSubnetGroup): Self = StObject.set(x, "ClusterSubnetGroup", value.asInstanceOf[js.Any])
    
    inline def setClusterSubnetGroupUndefined: Self = StObject.set(x, "ClusterSubnetGroup", js.undefined)
  }
}
