package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataMonitoringDetails extends StObject {
  
  /**
    *  Enables detailed monitoring when true is specified. Otherwise, basic monitoring is enabled. For more information about detailed monitoring, see Enable or turn off detailed monitoring for your instances in the Amazon EC2 User Guide. 
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object AwsEc2LaunchTemplateDataMonitoringDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataMonitoringDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataMonitoringDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataMonitoringDetails] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
