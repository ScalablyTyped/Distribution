package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSNOMEDCTInferenceJobResponse extends StObject {
  
  var ComprehendMedicalAsyncJobProperties: js.UndefOr[typings.awsSdk.clientsComprehendmedicalMod.ComprehendMedicalAsyncJobProperties] = js.undefined
}
object DescribeSNOMEDCTInferenceJobResponse {
  
  inline def apply(): DescribeSNOMEDCTInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSNOMEDCTInferenceJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSNOMEDCTInferenceJobResponse] (val x: Self) extends AnyVal {
    
    inline def setComprehendMedicalAsyncJobProperties(value: ComprehendMedicalAsyncJobProperties): Self = StObject.set(x, "ComprehendMedicalAsyncJobProperties", value.asInstanceOf[js.Any])
    
    inline def setComprehendMedicalAsyncJobPropertiesUndefined: Self = StObject.set(x, "ComprehendMedicalAsyncJobProperties", js.undefined)
  }
}
