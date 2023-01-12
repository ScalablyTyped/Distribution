package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterParameterGroupResult extends StObject {
  
  var ClusterParameterGroup: js.UndefOr[typings.awsSdk.clientsRedshiftMod.ClusterParameterGroup] = js.undefined
}
object CreateClusterParameterGroupResult {
  
  inline def apply(): CreateClusterParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterParameterGroupResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateClusterParameterGroupResult] (val x: Self) extends AnyVal {
    
    inline def setClusterParameterGroup(value: ClusterParameterGroup): Self = StObject.set(x, "ClusterParameterGroup", value.asInstanceOf[js.Any])
    
    inline def setClusterParameterGroupUndefined: Self = StObject.set(x, "ClusterParameterGroup", js.undefined)
  }
}
