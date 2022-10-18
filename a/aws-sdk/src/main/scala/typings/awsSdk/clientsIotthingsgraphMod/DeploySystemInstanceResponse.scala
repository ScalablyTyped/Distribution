package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploySystemInstanceResponse extends StObject {
  
  /**
    * The ID of the Greengrass deployment used to deploy the system instance.
    */
  var greengrassDeploymentId: js.UndefOr[GreengrassDeploymentId] = js.undefined
  
  /**
    * An object that contains summary information about a system instance that was deployed. 
    */
  var summary: SystemInstanceSummary
}
object DeploySystemInstanceResponse {
  
  inline def apply(summary: SystemInstanceSummary): DeploySystemInstanceResponse = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploySystemInstanceResponse]
  }
  
  extension [Self <: DeploySystemInstanceResponse](x: Self) {
    
    inline def setGreengrassDeploymentId(value: GreengrassDeploymentId): Self = StObject.set(x, "greengrassDeploymentId", value.asInstanceOf[js.Any])
    
    inline def setGreengrassDeploymentIdUndefined: Self = StObject.set(x, "greengrassDeploymentId", js.undefined)
    
    inline def setSummary(value: SystemInstanceSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
