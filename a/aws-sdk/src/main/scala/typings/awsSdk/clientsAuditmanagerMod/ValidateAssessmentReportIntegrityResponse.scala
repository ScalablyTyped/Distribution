package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateAssessmentReportIntegrityResponse extends StObject {
  
  /**
    *  The signature algorithm that's used to code sign the assessment report file. 
    */
  var signatureAlgorithm: js.UndefOr[String] = js.undefined
  
  /**
    *  The date and time signature that specifies when the assessment report was created. 
    */
  var signatureDateTime: js.UndefOr[String] = js.undefined
  
  /**
    *  The unique identifier for the validation signature key. 
    */
  var signatureKeyId: js.UndefOr[String] = js.undefined
  
  /**
    *  Specifies whether the signature key is valid. 
    */
  var signatureValid: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Represents any errors that occurred when validating the assessment report. 
    */
  var validationErrors: js.UndefOr[ValidationErrors] = js.undefined
}
object ValidateAssessmentReportIntegrityResponse {
  
  inline def apply(): ValidateAssessmentReportIntegrityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateAssessmentReportIntegrityResponse]
  }
  
  extension [Self <: ValidateAssessmentReportIntegrityResponse](x: Self) {
    
    inline def setSignatureAlgorithm(value: String): Self = StObject.set(x, "signatureAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSignatureAlgorithmUndefined: Self = StObject.set(x, "signatureAlgorithm", js.undefined)
    
    inline def setSignatureDateTime(value: String): Self = StObject.set(x, "signatureDateTime", value.asInstanceOf[js.Any])
    
    inline def setSignatureDateTimeUndefined: Self = StObject.set(x, "signatureDateTime", js.undefined)
    
    inline def setSignatureKeyId(value: String): Self = StObject.set(x, "signatureKeyId", value.asInstanceOf[js.Any])
    
    inline def setSignatureKeyIdUndefined: Self = StObject.set(x, "signatureKeyId", js.undefined)
    
    inline def setSignatureValid(value: Boolean): Self = StObject.set(x, "signatureValid", value.asInstanceOf[js.Any])
    
    inline def setSignatureValidUndefined: Self = StObject.set(x, "signatureValid", js.undefined)
    
    inline def setValidationErrors(value: ValidationErrors): Self = StObject.set(x, "validationErrors", value.asInstanceOf[js.Any])
    
    inline def setValidationErrorsUndefined: Self = StObject.set(x, "validationErrors", js.undefined)
    
    inline def setValidationErrorsVarargs(value: NonEmptyString*): Self = StObject.set(x, "validationErrors", js.Array(value*))
  }
}
