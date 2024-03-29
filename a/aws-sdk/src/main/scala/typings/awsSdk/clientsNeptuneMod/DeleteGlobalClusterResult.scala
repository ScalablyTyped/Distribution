package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGlobalClusterResult extends StObject {
  
  var GlobalCluster: js.UndefOr[typings.awsSdk.clientsNeptuneMod.GlobalCluster] = js.undefined
}
object DeleteGlobalClusterResult {
  
  inline def apply(): DeleteGlobalClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteGlobalClusterResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGlobalClusterResult] (val x: Self) extends AnyVal {
    
    inline def setGlobalCluster(value: GlobalCluster): Self = StObject.set(x, "GlobalCluster", value.asInstanceOf[js.Any])
    
    inline def setGlobalClusterUndefined: Self = StObject.set(x, "GlobalCluster", js.undefined)
  }
}
