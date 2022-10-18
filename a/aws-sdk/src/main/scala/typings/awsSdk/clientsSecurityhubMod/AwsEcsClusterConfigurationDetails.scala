package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsClusterConfigurationDetails extends StObject {
  
  /**
    * Contains the run command configuration for the cluster.
    */
  var ExecuteCommandConfiguration: js.UndefOr[AwsEcsClusterConfigurationExecuteCommandConfigurationDetails] = js.undefined
}
object AwsEcsClusterConfigurationDetails {
  
  inline def apply(): AwsEcsClusterConfigurationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsClusterConfigurationDetails]
  }
  
  extension [Self <: AwsEcsClusterConfigurationDetails](x: Self) {
    
    inline def setExecuteCommandConfiguration(value: AwsEcsClusterConfigurationExecuteCommandConfigurationDetails): Self = StObject.set(x, "ExecuteCommandConfiguration", value.asInstanceOf[js.Any])
    
    inline def setExecuteCommandConfigurationUndefined: Self = StObject.set(x, "ExecuteCommandConfiguration", js.undefined)
  }
}
