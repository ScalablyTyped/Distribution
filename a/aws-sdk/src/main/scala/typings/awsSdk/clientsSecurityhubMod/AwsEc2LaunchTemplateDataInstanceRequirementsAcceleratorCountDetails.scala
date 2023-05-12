package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetails extends StObject {
  
  /**
    *  The maximum number of accelerators. If this parameter isn't specified, there's no maximum limit. To exclude accelerator-enabled instance types, set Max to 0. 
    */
  var Max: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The minimum number of accelerators. If this parameter isn't specified, there's no minimum limit. 
    */
  var Min: js.UndefOr[Integer] = js.undefined
}
object AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataInstanceRequirementsAcceleratorCountDetails] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Integer): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: Integer): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
  }
}
