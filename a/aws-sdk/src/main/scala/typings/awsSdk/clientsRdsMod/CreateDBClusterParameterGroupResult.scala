package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBClusterParameterGroupResult extends StObject {
  
  var DBClusterParameterGroup: js.UndefOr[typings.awsSdk.clientsRdsMod.DBClusterParameterGroup] = js.undefined
}
object CreateDBClusterParameterGroupResult {
  
  inline def apply(): CreateDBClusterParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBClusterParameterGroupResult]
  }
  
  extension [Self <: CreateDBClusterParameterGroupResult](x: Self) {
    
    inline def setDBClusterParameterGroup(value: DBClusterParameterGroup): Self = StObject.set(x, "DBClusterParameterGroup", value.asInstanceOf[js.Any])
    
    inline def setDBClusterParameterGroupUndefined: Self = StObject.set(x, "DBClusterParameterGroup", js.undefined)
  }
}
