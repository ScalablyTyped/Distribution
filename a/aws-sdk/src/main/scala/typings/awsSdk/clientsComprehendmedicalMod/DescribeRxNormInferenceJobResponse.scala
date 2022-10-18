package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRxNormInferenceJobResponse extends StObject {
  
  /**
    * An object that contains the properties associated with a detection job.
    */
  var ComprehendMedicalAsyncJobProperties: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.ComprehendMedicalAsyncJobProperties] = js.undefined
}
object DescribeRxNormInferenceJobResponse {
  
  inline def apply(): DescribeRxNormInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRxNormInferenceJobResponse]
  }
  
  extension [Self <: DescribeRxNormInferenceJobResponse](x: Self) {
    
    inline def setComprehendMedicalAsyncJobProperties(value: ComprehendMedicalAsyncJobProperties): Self = StObject.set(x, "ComprehendMedicalAsyncJobProperties", value.asInstanceOf[js.Any])
    
    inline def setComprehendMedicalAsyncJobPropertiesUndefined: Self = StObject.set(x, "ComprehendMedicalAsyncJobProperties", js.undefined)
  }
}
