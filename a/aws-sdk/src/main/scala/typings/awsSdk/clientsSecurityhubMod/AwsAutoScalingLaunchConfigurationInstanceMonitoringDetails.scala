package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsAutoScalingLaunchConfigurationInstanceMonitoringDetails extends StObject {
  
  /**
    * If set to true, then instances in the group launch with detailed monitoring. If set to false, then instances in the group launch with basic monitoring.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object AwsAutoScalingLaunchConfigurationInstanceMonitoringDetails {
  
  inline def apply(): AwsAutoScalingLaunchConfigurationInstanceMonitoringDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsAutoScalingLaunchConfigurationInstanceMonitoringDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsAutoScalingLaunchConfigurationInstanceMonitoringDetails] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
