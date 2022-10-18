package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBClusterResult extends StObject {
  
  var DBCluster: js.UndefOr[typings.awsSdk.clientsDocdbMod.DBCluster] = js.undefined
}
object ModifyDBClusterResult {
  
  inline def apply(): ModifyDBClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBClusterResult]
  }
  
  extension [Self <: ModifyDBClusterResult](x: Self) {
    
    inline def setDBCluster(value: DBCluster): Self = StObject.set(x, "DBCluster", value.asInstanceOf[js.Any])
    
    inline def setDBClusterUndefined: Self = StObject.set(x, "DBCluster", js.undefined)
  }
}
