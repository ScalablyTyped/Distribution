package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BusinessReport extends StObject {
  
  /**
    * The time of report delivery.
    */
  var DeliveryTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The download link where a user can download the report.
    */
  var DownloadUrl: js.UndefOr[BusinessReportDownloadUrl] = js.undefined
  
  /**
    * The failure code.
    */
  var FailureCode: js.UndefOr[BusinessReportFailureCode] = js.undefined
  
  /**
    * The S3 location of the output reports.
    */
  var S3Location: js.UndefOr[BusinessReportS3Location] = js.undefined
  
  /**
    * The status of the report generation execution (RUNNING, SUCCEEDED, or FAILED).
    */
  var Status: js.UndefOr[BusinessReportStatus] = js.undefined
}
object BusinessReport {
  
  inline def apply(): BusinessReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessReport]
  }
  
  extension [Self <: BusinessReport](x: Self) {
    
    inline def setDeliveryTime(value: js.Date): Self = StObject.set(x, "DeliveryTime", value.asInstanceOf[js.Any])
    
    inline def setDeliveryTimeUndefined: Self = StObject.set(x, "DeliveryTime", js.undefined)
    
    inline def setDownloadUrl(value: BusinessReportDownloadUrl): Self = StObject.set(x, "DownloadUrl", value.asInstanceOf[js.Any])
    
    inline def setDownloadUrlUndefined: Self = StObject.set(x, "DownloadUrl", js.undefined)
    
    inline def setFailureCode(value: BusinessReportFailureCode): Self = StObject.set(x, "FailureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "FailureCode", js.undefined)
    
    inline def setS3Location(value: BusinessReportS3Location): Self = StObject.set(x, "S3Location", value.asInstanceOf[js.Any])
    
    inline def setS3LocationUndefined: Self = StObject.set(x, "S3Location", js.undefined)
    
    inline def setStatus(value: BusinessReportStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
