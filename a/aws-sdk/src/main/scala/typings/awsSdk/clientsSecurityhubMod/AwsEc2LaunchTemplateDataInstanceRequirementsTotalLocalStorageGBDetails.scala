package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataInstanceRequirementsTotalLocalStorageGBDetails extends StObject {
  
  /**
    *  The maximum amount of total local storage, in GB. 
    */
  var Max: js.UndefOr[Double] = js.undefined
  
  /**
    *  The minimum amount of total local storage, in GB. 
    */
  var Min: js.UndefOr[Double] = js.undefined
}
object AwsEc2LaunchTemplateDataInstanceRequirementsTotalLocalStorageGBDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataInstanceRequirementsTotalLocalStorageGBDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataInstanceRequirementsTotalLocalStorageGBDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataInstanceRequirementsTotalLocalStorageGBDetails] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
  }
}
