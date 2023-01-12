package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBClusterParameterGroupResult extends StObject {
  
  var DBClusterParameterGroup: js.UndefOr[typings.awsSdk.clientsDocdbMod.DBClusterParameterGroup] = js.undefined
}
object CreateDBClusterParameterGroupResult {
  
  inline def apply(): CreateDBClusterParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBClusterParameterGroupResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDBClusterParameterGroupResult] (val x: Self) extends AnyVal {
    
    inline def setDBClusterParameterGroup(value: DBClusterParameterGroup): Self = StObject.set(x, "DBClusterParameterGroup", value.asInstanceOf[js.Any])
    
    inline def setDBClusterParameterGroupUndefined: Self = StObject.set(x, "DBClusterParameterGroup", js.undefined)
  }
}
