package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetails extends StObject {
  
  /**
    *  The maximum number of network interfaces. 
    */
  var Max: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The minimum number of network interfaces. 
    */
  var Min: js.UndefOr[Integer] = js.undefined
}
object AwsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataInstanceRequirementsNetworkInterfaceCountDetails] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Integer): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: Integer): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
  }
}
