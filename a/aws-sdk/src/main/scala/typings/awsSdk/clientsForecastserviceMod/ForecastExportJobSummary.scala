package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForecastExportJobSummary extends StObject {
  
  /**
    * When the forecast export job was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The path to the Amazon Simple Storage Service (Amazon S3) bucket where the forecast is exported.
    */
  var Destination: js.UndefOr[DataDestination] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the forecast export job.
    */
  var ForecastExportJobArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the forecast export job.
    */
  var ForecastExportJobName: js.UndefOr[Name] = js.undefined
  
  /**
    * The last time the resource was modified. The timestamp depends on the status of the job:    CREATE_PENDING - The CreationTime.    CREATE_IN_PROGRESS - The current timestamp.    CREATE_STOPPING - The current timestamp.    CREATE_STOPPED - When the job stopped.    ACTIVE or CREATE_FAILED - When the job finished or failed.  
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The status of the forecast export job. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     CREATE_STOPPING, CREATE_STOPPED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     The Status of the forecast export job must be ACTIVE before you can access the forecast in your S3 bucket. 
    */
  var Status: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Status] = js.undefined
}
object ForecastExportJobSummary {
  
  inline def apply(): ForecastExportJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForecastExportJobSummary]
  }
  
  extension [Self <: ForecastExportJobSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDestination(value: DataDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setForecastExportJobArn(value: Arn): Self = StObject.set(x, "ForecastExportJobArn", value.asInstanceOf[js.Any])
    
    inline def setForecastExportJobArnUndefined: Self = StObject.set(x, "ForecastExportJobArn", js.undefined)
    
    inline def setForecastExportJobName(value: Name): Self = StObject.set(x, "ForecastExportJobName", value.asInstanceOf[js.Any])
    
    inline def setForecastExportJobNameUndefined: Self = StObject.set(x, "ForecastExportJobName", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
