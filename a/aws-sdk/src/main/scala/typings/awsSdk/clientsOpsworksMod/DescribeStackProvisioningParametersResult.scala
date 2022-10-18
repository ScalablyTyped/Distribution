package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStackProvisioningParametersResult extends StObject {
  
  /**
    * The AWS OpsWorks Stacks agent installer's URL.
    */
  var AgentInstallerUrl: js.UndefOr[String] = js.undefined
  
  /**
    * An embedded object that contains the provisioning parameters.
    */
  var Parameters: js.UndefOr[typings.awsSdk.clientsOpsworksMod.Parameters] = js.undefined
}
object DescribeStackProvisioningParametersResult {
  
  inline def apply(): DescribeStackProvisioningParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStackProvisioningParametersResult]
  }
  
  extension [Self <: DescribeStackProvisioningParametersResult](x: Self) {
    
    inline def setAgentInstallerUrl(value: String): Self = StObject.set(x, "AgentInstallerUrl", value.asInstanceOf[js.Any])
    
    inline def setAgentInstallerUrlUndefined: Self = StObject.set(x, "AgentInstallerUrl", js.undefined)
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
  }
}
