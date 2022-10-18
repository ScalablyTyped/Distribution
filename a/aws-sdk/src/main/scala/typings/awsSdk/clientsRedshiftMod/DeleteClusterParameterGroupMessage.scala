package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClusterParameterGroupMessage extends StObject {
  
  /**
    * The name of the parameter group to be deleted. Constraints:   Must be the name of an existing cluster parameter group.   Cannot delete a default cluster parameter group.  
    */
  var ParameterGroupName: String
}
object DeleteClusterParameterGroupMessage {
  
  inline def apply(ParameterGroupName: String): DeleteClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(ParameterGroupName = ParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterParameterGroupMessage]
  }
  
  extension [Self <: DeleteClusterParameterGroupMessage](x: Self) {
    
    inline def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
  }
}
