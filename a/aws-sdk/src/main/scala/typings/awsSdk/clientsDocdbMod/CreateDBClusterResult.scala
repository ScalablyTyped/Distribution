package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBClusterResult extends StObject {
  
  var DBCluster: js.UndefOr[typings.awsSdk.clientsDocdbMod.DBCluster] = js.undefined
}
object CreateDBClusterResult {
  
  inline def apply(): CreateDBClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBClusterResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDBClusterResult] (val x: Self) extends AnyVal {
    
    inline def setDBCluster(value: DBCluster): Self = StObject.set(x, "DBCluster", value.asInstanceOf[js.Any])
    
    inline def setDBClusterUndefined: Self = StObject.set(x, "DBCluster", js.undefined)
  }
}
