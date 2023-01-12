package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictorSummary extends StObject {
  
  /**
    * When the model training task was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset group that contains the data used to train the predictor.
    */
  var DatasetGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Whether AutoPredictor was used to create the predictor.
    */
  var IsAutoPredictor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The last time the resource was modified. The timestamp depends on the status of the job:    CREATE_PENDING - The CreationTime.    CREATE_IN_PROGRESS - The current timestamp.    CREATE_STOPPING - The current timestamp.    CREATE_STOPPED - When the job stopped.    ACTIVE or CREATE_FAILED - When the job finished or failed.  
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The ARN of the predictor.
    */
  var PredictorArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the predictor.
    */
  var PredictorName: js.UndefOr[Name] = js.undefined
  
  /**
    * A summary of the reference predictor used if the predictor was retrained or upgraded.
    */
  var ReferencePredictorSummary: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.ReferencePredictorSummary] = js.undefined
  
  /**
    * The status of the predictor. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     CREATE_STOPPING, CREATE_STOPPED     The Status of the predictor must be ACTIVE before you can use the predictor to create a forecast. 
    */
  var Status: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Status] = js.undefined
}
object PredictorSummary {
  
  inline def apply(): PredictorSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictorSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PredictorSummary] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "DatasetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetGroupArnUndefined: Self = StObject.set(x, "DatasetGroupArn", js.undefined)
    
    inline def setIsAutoPredictor(value: Boolean): Self = StObject.set(x, "IsAutoPredictor", value.asInstanceOf[js.Any])
    
    inline def setIsAutoPredictorUndefined: Self = StObject.set(x, "IsAutoPredictor", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setPredictorArn(value: Arn): Self = StObject.set(x, "PredictorArn", value.asInstanceOf[js.Any])
    
    inline def setPredictorArnUndefined: Self = StObject.set(x, "PredictorArn", js.undefined)
    
    inline def setPredictorName(value: Name): Self = StObject.set(x, "PredictorName", value.asInstanceOf[js.Any])
    
    inline def setPredictorNameUndefined: Self = StObject.set(x, "PredictorName", js.undefined)
    
    inline def setReferencePredictorSummary(value: ReferencePredictorSummary): Self = StObject.set(x, "ReferencePredictorSummary", value.asInstanceOf[js.Any])
    
    inline def setReferencePredictorSummaryUndefined: Self = StObject.set(x, "ReferencePredictorSummary", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
