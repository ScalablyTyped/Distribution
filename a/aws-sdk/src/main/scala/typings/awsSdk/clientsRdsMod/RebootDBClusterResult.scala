package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootDBClusterResult extends StObject {
  
  var DBCluster: js.UndefOr[typings.awsSdk.clientsRdsMod.DBCluster] = js.undefined
}
object RebootDBClusterResult {
  
  inline def apply(): RebootDBClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebootDBClusterResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RebootDBClusterResult] (val x: Self) extends AnyVal {
    
    inline def setDBCluster(value: DBCluster): Self = StObject.set(x, "DBCluster", value.asInstanceOf[js.Any])
    
    inline def setDBClusterUndefined: Self = StObject.set(x, "DBCluster", js.undefined)
  }
}
