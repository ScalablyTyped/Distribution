package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyClusterIamRolesResult extends StObject {
  
  var Cluster: js.UndefOr[typings.awsSdk.clientsRedshiftMod.Cluster] = js.undefined
}
object ModifyClusterIamRolesResult {
  
  inline def apply(): ModifyClusterIamRolesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyClusterIamRolesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyClusterIamRolesResult] (val x: Self) extends AnyVal {
    
    inline def setCluster(value: Cluster): Self = StObject.set(x, "Cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "Cluster", js.undefined)
  }
}
