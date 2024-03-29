package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyGlobalClusterResult extends StObject {
  
  var GlobalCluster: js.UndefOr[typings.awsSdk.clientsDocdbMod.GlobalCluster] = js.undefined
}
object ModifyGlobalClusterResult {
  
  inline def apply(): ModifyGlobalClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyGlobalClusterResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyGlobalClusterResult] (val x: Self) extends AnyVal {
    
    inline def setGlobalCluster(value: GlobalCluster): Self = StObject.set(x, "GlobalCluster", value.asInstanceOf[js.Any])
    
    inline def setGlobalClusterUndefined: Self = StObject.set(x, "GlobalCluster", js.undefined)
  }
}
