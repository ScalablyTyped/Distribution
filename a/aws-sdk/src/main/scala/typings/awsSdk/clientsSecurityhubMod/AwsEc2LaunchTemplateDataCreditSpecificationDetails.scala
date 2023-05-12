package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataCreditSpecificationDetails extends StObject {
  
  /**
    *  The credit option for CPU usage of a T instance. 
    */
  var CpuCredits: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2LaunchTemplateDataCreditSpecificationDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataCreditSpecificationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataCreditSpecificationDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataCreditSpecificationDetails] (val x: Self) extends AnyVal {
    
    inline def setCpuCredits(value: NonEmptyString): Self = StObject.set(x, "CpuCredits", value.asInstanceOf[js.Any])
    
    inline def setCpuCreditsUndefined: Self = StObject.set(x, "CpuCredits", js.undefined)
  }
}
