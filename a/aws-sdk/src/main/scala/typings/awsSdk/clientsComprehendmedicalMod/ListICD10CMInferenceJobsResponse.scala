package typings.awsSdk.clientsComprehendmedicalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListICD10CMInferenceJobsResponse extends StObject {
  
  /**
    * A list containing the properties of each job that is returned.
    */
  var ComprehendMedicalAsyncJobPropertiesList: js.UndefOr[
    typings.awsSdk.clientsComprehendmedicalMod.ComprehendMedicalAsyncJobPropertiesList
  ] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListICD10CMInferenceJobsResponse {
  
  inline def apply(): ListICD10CMInferenceJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListICD10CMInferenceJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListICD10CMInferenceJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setComprehendMedicalAsyncJobPropertiesList(value: ComprehendMedicalAsyncJobPropertiesList): Self = StObject.set(x, "ComprehendMedicalAsyncJobPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setComprehendMedicalAsyncJobPropertiesListUndefined: Self = StObject.set(x, "ComprehendMedicalAsyncJobPropertiesList", js.undefined)
    
    inline def setComprehendMedicalAsyncJobPropertiesListVarargs(value: ComprehendMedicalAsyncJobProperties*): Self = StObject.set(x, "ComprehendMedicalAsyncJobPropertiesList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
