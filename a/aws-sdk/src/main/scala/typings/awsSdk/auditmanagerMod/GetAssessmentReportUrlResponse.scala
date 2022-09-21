package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssessmentReportUrlResponse extends StObject {
  
  var preSignedUrl: js.UndefOr[URL] = js.undefined
}
object GetAssessmentReportUrlResponse {
  
  inline def apply(): GetAssessmentReportUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssessmentReportUrlResponse]
  }
  
  extension [Self <: GetAssessmentReportUrlResponse](x: Self) {
    
    inline def setPreSignedUrl(value: URL): Self = StObject.set(x, "preSignedUrl", value.asInstanceOf[js.Any])
    
    inline def setPreSignedUrlUndefined: Self = StObject.set(x, "preSignedUrl", js.undefined)
  }
}
