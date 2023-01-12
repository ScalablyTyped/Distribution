package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeICD10CMInferenceJobResponse extends StObject {
  
  /**
    * An object that contains the properties associated with a detection job.
    */
  var ComprehendMedicalAsyncJobProperties: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.ComprehendMedicalAsyncJobProperties] = js.undefined
}
object DescribeICD10CMInferenceJobResponse {
  
  inline def apply(): DescribeICD10CMInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeICD10CMInferenceJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeICD10CMInferenceJobResponse] (val x: Self) extends AnyVal {
    
    inline def setComprehendMedicalAsyncJobProperties(value: ComprehendMedicalAsyncJobProperties): Self = StObject.set(x, "ComprehendMedicalAsyncJobProperties", value.asInstanceOf[js.Any])
    
    inline def setComprehendMedicalAsyncJobPropertiesUndefined: Self = StObject.set(x, "ComprehendMedicalAsyncJobProperties", js.undefined)
  }
}
