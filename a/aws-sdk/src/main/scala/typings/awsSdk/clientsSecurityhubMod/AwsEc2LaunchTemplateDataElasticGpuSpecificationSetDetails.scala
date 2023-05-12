package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails extends StObject {
  
  /**
    *  The type of Elastic Graphics accelerator. 
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataElasticGpuSpecificationSetDetails] (val x: Self) extends AnyVal {
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
