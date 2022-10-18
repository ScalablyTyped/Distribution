package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAgentVersionsResult extends StObject {
  
  /**
    * The agent versions for the specified stack or configuration manager. Note that this value is the complete version number, not the abbreviated number used by the console.
    */
  var AgentVersions: js.UndefOr[typings.awsSdk.clientsOpsworksMod.AgentVersions] = js.undefined
}
object DescribeAgentVersionsResult {
  
  inline def apply(): DescribeAgentVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAgentVersionsResult]
  }
  
  extension [Self <: DescribeAgentVersionsResult](x: Self) {
    
    inline def setAgentVersions(value: AgentVersions): Self = StObject.set(x, "AgentVersions", value.asInstanceOf[js.Any])
    
    inline def setAgentVersionsUndefined: Self = StObject.set(x, "AgentVersions", js.undefined)
    
    inline def setAgentVersionsVarargs(value: AgentVersion*): Self = StObject.set(x, "AgentVersions", js.Array(value*))
  }
}
