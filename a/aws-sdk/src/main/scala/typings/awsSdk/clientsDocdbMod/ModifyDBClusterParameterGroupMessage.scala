package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBClusterParameterGroupMessage extends StObject {
  
  /**
    * The name of the cluster parameter group to modify.
    */
  var DBClusterParameterGroupName: String
  
  /**
    * A list of parameters in the cluster parameter group to modify.
    */
  var Parameters: ParametersList
}
object ModifyDBClusterParameterGroupMessage {
  
  inline def apply(DBClusterParameterGroupName: String, Parameters: ParametersList): ModifyDBClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBClusterParameterGroupName = DBClusterParameterGroupName.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBClusterParameterGroupMessage]
  }
  
  extension [Self <: ModifyDBClusterParameterGroupMessage](x: Self) {
    
    inline def setDBClusterParameterGroupName(value: String): Self = StObject.set(x, "DBClusterParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: ParametersList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value*))
  }
}
