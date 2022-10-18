package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterParameterGroupNameMessage extends StObject {
  
  /**
    * The name of the cluster parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the parameter group. For example, if you made a change to a parameter group name-value pair, then the change could be pending a reboot of an associated cluster.
    */
  var ParameterGroupStatus: js.UndefOr[String] = js.undefined
}
object ClusterParameterGroupNameMessage {
  
  inline def apply(): ClusterParameterGroupNameMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterParameterGroupNameMessage]
  }
  
  extension [Self <: ClusterParameterGroupNameMessage](x: Self) {
    
    inline def setParameterGroupName(value: String): Self = StObject.set(x, "ParameterGroupName", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupNameUndefined: Self = StObject.set(x, "ParameterGroupName", js.undefined)
    
    inline def setParameterGroupStatus(value: String): Self = StObject.set(x, "ParameterGroupStatus", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupStatusUndefined: Self = StObject.set(x, "ParameterGroupStatus", js.undefined)
  }
}
