package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictorBacktestExportJobSummary extends StObject {
  
  /**
    * When the predictor backtest export job was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  var Destination: js.UndefOr[DataDestination] = js.undefined
  
  /**
    * The last time the resource was modified. The timestamp depends on the status of the job:    CREATE_PENDING - The CreationTime.    CREATE_IN_PROGRESS - The current timestamp.    CREATE_STOPPING - The current timestamp.    CREATE_STOPPED - When the job stopped.    ACTIVE or CREATE_FAILED - When the job finished or failed.  
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Information about any errors that may have occurred during the backtest export.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the predictor backtest export job.
    */
  var PredictorBacktestExportJobArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the predictor backtest export job.
    */
  var PredictorBacktestExportJobName: js.UndefOr[Name] = js.undefined
  
  /**
    * The status of the predictor backtest export job. States include:     ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     CREATE_STOPPING, CREATE_STOPPED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED   
    */
  var Status: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Status] = js.undefined
}
object PredictorBacktestExportJobSummary {
  
  inline def apply(): PredictorBacktestExportJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictorBacktestExportJobSummary]
  }
  
  extension [Self <: PredictorBacktestExportJobSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDestination(value: DataDestination): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setPredictorBacktestExportJobArn(value: Arn): Self = StObject.set(x, "PredictorBacktestExportJobArn", value.asInstanceOf[js.Any])
    
    inline def setPredictorBacktestExportJobArnUndefined: Self = StObject.set(x, "PredictorBacktestExportJobArn", js.undefined)
    
    inline def setPredictorBacktestExportJobName(value: Name): Self = StObject.set(x, "PredictorBacktestExportJobName", value.asInstanceOf[js.Any])
    
    inline def setPredictorBacktestExportJobNameUndefined: Self = StObject.set(x, "PredictorBacktestExportJobName", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
