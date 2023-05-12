package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetails extends StObject {
  
  /**
    *  The maximum baseline bandwidth, in Mbps. If this parameter is omitted, there's no maximum limit. 
    */
  var Max: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The minimum baseline bandwidth, in Mbps. If this parameter is omitted, there's no minimum limit. 
    */
  var Min: js.UndefOr[Integer] = js.undefined
}
object AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataInstanceRequirementsBaselineEbsBandwidthMbpsDetails] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Integer): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: Integer): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
  }
}
