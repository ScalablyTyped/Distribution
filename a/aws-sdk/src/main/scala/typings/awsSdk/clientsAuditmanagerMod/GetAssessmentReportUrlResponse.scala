package typings.awsSdk.clientsAuditmanagerMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAssessmentReportUrlResponse] (val x: Self) extends AnyVal {
    
    inline def setPreSignedUrl(value: URL): Self = StObject.set(x, "preSignedUrl", value.asInstanceOf[js.Any])
    
    inline def setPreSignedUrlUndefined: Self = StObject.set(x, "preSignedUrl", js.undefined)
  }
}
