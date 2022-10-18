package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBParameterGroupMessage extends StObject {
  
  /**
    * The name of the DB parameter group. Constraints:   If supplied, must match the name of an existing DBParameterGroup.  
    */
  var DBParameterGroupName: String
  
  /**
    * An array of parameter names, values, and the application methods for the parameter update. At least one parameter name, value, and application method must be supplied; later arguments are optional. A maximum of 20 parameters can be modified in a single request. Valid Values (for the application method): immediate | pending-reboot  You can use the immediate value with dynamic parameters only. You can use the pending-reboot value for both dynamic and static parameters. When the application method is immediate, changes to dynamic parameters are applied immediately to the DB instances associated with the parameter group. When the application method is pending-reboot, changes to dynamic and static parameters are applied after a reboot without failover to the DB instances associated with the parameter group.  You can't use pending-reboot with dynamic parameters on RDS for SQL Server DB instances. Use immediate.  For more information on modifying DB parameters, see Working with DB parameter groups in the Amazon RDS User Guide.
    */
  var Parameters: ParametersList
}
object ModifyDBParameterGroupMessage {
  
  inline def apply(DBParameterGroupName: String, Parameters: ParametersList): ModifyDBParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBParameterGroupName = DBParameterGroupName.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBParameterGroupMessage]
  }
  
  extension [Self <: ModifyDBParameterGroupMessage](x: Self) {
    
    inline def setDBParameterGroupName(value: String): Self = StObject.set(x, "DBParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: ParametersList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "Parameters", js.Array(value*))
  }
}
