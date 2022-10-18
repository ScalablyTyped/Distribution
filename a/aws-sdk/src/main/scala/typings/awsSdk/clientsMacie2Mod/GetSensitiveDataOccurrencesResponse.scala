package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSensitiveDataOccurrencesResponse extends StObject {
  
  /**
    * If an error occurred when Amazon Macie attempted to retrieve occurrences of sensitive data reported by the finding, a description of the error that occurred. This value is null if the status (status) of the request is PROCESSING or SUCCESS.
    */
  var error: js.UndefOr[string] = js.undefined
  
  /**
    * A map that specifies 1-100 types of sensitive data reported by the finding and, for each type, 1-10 occurrences of sensitive data.
    */
  var sensitiveDataOccurrences: js.UndefOr[SensitiveDataOccurrences] = js.undefined
  
  /**
    * The status of the request to retrieve occurrences of sensitive data reported by the finding. Possible values are: ERROR - An error occurred when Amazon Macie attempted to locate, retrieve, or encrypt the sensitive data. The error value indicates the nature of the error that occurred. PROCESSING - Macie is processing the request. SUCCESS - Macie successfully located, retrieved, and encrypted the sensitive data.
    */
  var status: js.UndefOr[RevealRequestStatus] = js.undefined
}
object GetSensitiveDataOccurrencesResponse {
  
  inline def apply(): GetSensitiveDataOccurrencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSensitiveDataOccurrencesResponse]
  }
  
  extension [Self <: GetSensitiveDataOccurrencesResponse](x: Self) {
    
    inline def setError(value: string): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setSensitiveDataOccurrences(value: SensitiveDataOccurrences): Self = StObject.set(x, "sensitiveDataOccurrences", value.asInstanceOf[js.Any])
    
    inline def setSensitiveDataOccurrencesUndefined: Self = StObject.set(x, "sensitiveDataOccurrences", js.undefined)
    
    inline def setStatus(value: RevealRequestStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
