package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateAssessmentReportIntegrityRequest extends StObject {
  
  /**
    *  The relative path of the Amazon S3 bucket that the assessment report is stored in. 
    */
  var s3RelativePath: S3Url
}
object ValidateAssessmentReportIntegrityRequest {
  
  inline def apply(s3RelativePath: S3Url): ValidateAssessmentReportIntegrityRequest = {
    val __obj = js.Dynamic.literal(s3RelativePath = s3RelativePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateAssessmentReportIntegrityRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateAssessmentReportIntegrityRequest] (val x: Self) extends AnyVal {
    
    inline def setS3RelativePath(value: S3Url): Self = StObject.set(x, "s3RelativePath", value.asInstanceOf[js.Any])
  }
}
