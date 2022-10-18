package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateCredentialReportResponse extends StObject {
  
  /**
    * Information about the credential report.
    */
  var Description: js.UndefOr[ReportStateDescriptionType] = js.undefined
  
  /**
    * Information about the state of the credential report.
    */
  var State: js.UndefOr[ReportStateType] = js.undefined
}
object GenerateCredentialReportResponse {
  
  inline def apply(): GenerateCredentialReportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateCredentialReportResponse]
  }
  
  extension [Self <: GenerateCredentialReportResponse](x: Self) {
    
    inline def setDescription(value: ReportStateDescriptionType): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setState(value: ReportStateType): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
