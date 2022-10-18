package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreDBClusterToPointInTimeResult extends StObject {
  
  var DBCluster: js.UndefOr[typings.awsSdk.clientsNeptuneMod.DBCluster] = js.undefined
}
object RestoreDBClusterToPointInTimeResult {
  
  inline def apply(): RestoreDBClusterToPointInTimeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreDBClusterToPointInTimeResult]
  }
  
  extension [Self <: RestoreDBClusterToPointInTimeResult](x: Self) {
    
    inline def setDBCluster(value: DBCluster): Self = StObject.set(x, "DBCluster", value.asInstanceOf[js.Any])
    
    inline def setDBClusterUndefined: Self = StObject.set(x, "DBCluster", js.undefined)
  }
}
