package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGlobalClusterResult extends StObject {
  
  var GlobalCluster: js.UndefOr[typings.awsSdk.clientsRdsMod.GlobalCluster] = js.undefined
}
object CreateGlobalClusterResult {
  
  inline def apply(): CreateGlobalClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGlobalClusterResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGlobalClusterResult] (val x: Self) extends AnyVal {
    
    inline def setGlobalCluster(value: GlobalCluster): Self = StObject.set(x, "GlobalCluster", value.asInstanceOf[js.Any])
    
    inline def setGlobalClusterUndefined: Self = StObject.set(x, "GlobalCluster", js.undefined)
  }
}
