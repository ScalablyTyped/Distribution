package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2LaunchTemplateDataElasticInferenceAcceleratorSetDetails extends StObject {
  
  /**
    *  The number of Elastic Inference accelerators to attach to the instance. 
    */
  var Count: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The type of Elastic Inference accelerator. 
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2LaunchTemplateDataElasticInferenceAcceleratorSetDetails {
  
  inline def apply(): AwsEc2LaunchTemplateDataElasticInferenceAcceleratorSetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2LaunchTemplateDataElasticInferenceAcceleratorSetDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2LaunchTemplateDataElasticInferenceAcceleratorSetDetails] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
