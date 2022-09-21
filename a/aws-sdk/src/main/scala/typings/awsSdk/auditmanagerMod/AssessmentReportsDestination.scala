package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssessmentReportsDestination extends StObject {
  
  /**
    *  The destination of the assessment report. 
    */
  var destination: js.UndefOr[S3Url] = js.undefined
  
  /**
    *  The destination type, such as Amazon S3. 
    */
  var destinationType: js.UndefOr[AssessmentReportDestinationType] = js.undefined
}
object AssessmentReportsDestination {
  
  inline def apply(): AssessmentReportsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssessmentReportsDestination]
  }
  
  extension [Self <: AssessmentReportsDestination](x: Self) {
    
    inline def setDestination(value: S3Url): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationType(value: AssessmentReportDestinationType): Self = StObject.set(x, "destinationType", value.asInstanceOf[js.Any])
    
    inline def setDestinationTypeUndefined: Self = StObject.set(x, "destinationType", js.undefined)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
  }
}
