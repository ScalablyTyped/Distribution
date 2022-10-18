package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBClusterResult extends StObject {
  
  var DBCluster: js.UndefOr[typings.awsSdk.clientsNeptuneMod.DBCluster] = js.undefined
}
object CreateDBClusterResult {
  
  inline def apply(): CreateDBClusterResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBClusterResult]
  }
  
  extension [Self <: CreateDBClusterResult](x: Self) {
    
    inline def setDBCluster(value: DBCluster): Self = StObject.set(x, "DBCluster", value.asInstanceOf[js.Any])
    
    inline def setDBClusterUndefined: Self = StObject.set(x, "DBCluster", js.undefined)
  }
}
