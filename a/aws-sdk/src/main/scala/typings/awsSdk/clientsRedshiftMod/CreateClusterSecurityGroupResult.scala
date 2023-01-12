package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClusterSecurityGroupResult extends StObject {
  
  var ClusterSecurityGroup: js.UndefOr[typings.awsSdk.clientsRedshiftMod.ClusterSecurityGroup] = js.undefined
}
object CreateClusterSecurityGroupResult {
  
  inline def apply(): CreateClusterSecurityGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterSecurityGroupResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateClusterSecurityGroupResult] (val x: Self) extends AnyVal {
    
    inline def setClusterSecurityGroup(value: ClusterSecurityGroup): Self = StObject.set(x, "ClusterSecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setClusterSecurityGroupUndefined: Self = StObject.set(x, "ClusterSecurityGroup", js.undefined)
  }
}
