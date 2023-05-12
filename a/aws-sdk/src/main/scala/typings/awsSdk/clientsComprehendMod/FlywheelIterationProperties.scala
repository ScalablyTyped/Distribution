package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlywheelIterationProperties extends StObject {
  
  /**
    * The creation start time of the flywheel iteration.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The completion time of this flywheel iteration.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the evaluated model associated with this flywheel iteration.
    */
  var EvaluatedModelArn: js.UndefOr[ComprehendModelArn] = js.undefined
  
  var EvaluatedModelMetrics: js.UndefOr[FlywheelModelEvaluationMetrics] = js.undefined
  
  /**
    * 
    */
  var EvaluationManifestS3Prefix: js.UndefOr[S3Uri] = js.undefined
  
  /**
    * 
    */
  var FlywheelArn: js.UndefOr[ComprehendFlywheelArn] = js.undefined
  
  /**
    * 
    */
  var FlywheelIterationId: js.UndefOr[typings.awsSdk.clientsComprehendMod.FlywheelIterationId] = js.undefined
  
  /**
    * A description of the status of the flywheel iteration.
    */
  var Message: js.UndefOr[AnyLengthString] = js.undefined
  
  /**
    * The status of the flywheel iteration.
    */
  var Status: js.UndefOr[FlywheelIterationStatus] = js.undefined
  
  /**
    * The ARN of the trained model associated with this flywheel iteration.
    */
  var TrainedModelArn: js.UndefOr[ComprehendModelArn] = js.undefined
  
  /**
    * The metrics associated with the trained model.
    */
  var TrainedModelMetrics: js.UndefOr[FlywheelModelEvaluationMetrics] = js.undefined
}
object FlywheelIterationProperties {
  
  inline def apply(): FlywheelIterationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlywheelIterationProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlywheelIterationProperties] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setEvaluatedModelArn(value: ComprehendModelArn): Self = StObject.set(x, "EvaluatedModelArn", value.asInstanceOf[js.Any])
    
    inline def setEvaluatedModelArnUndefined: Self = StObject.set(x, "EvaluatedModelArn", js.undefined)
    
    inline def setEvaluatedModelMetrics(value: FlywheelModelEvaluationMetrics): Self = StObject.set(x, "EvaluatedModelMetrics", value.asInstanceOf[js.Any])
    
    inline def setEvaluatedModelMetricsUndefined: Self = StObject.set(x, "EvaluatedModelMetrics", js.undefined)
    
    inline def setEvaluationManifestS3Prefix(value: S3Uri): Self = StObject.set(x, "EvaluationManifestS3Prefix", value.asInstanceOf[js.Any])
    
    inline def setEvaluationManifestS3PrefixUndefined: Self = StObject.set(x, "EvaluationManifestS3Prefix", js.undefined)
    
    inline def setFlywheelArn(value: ComprehendFlywheelArn): Self = StObject.set(x, "FlywheelArn", value.asInstanceOf[js.Any])
    
    inline def setFlywheelArnUndefined: Self = StObject.set(x, "FlywheelArn", js.undefined)
    
    inline def setFlywheelIterationId(value: FlywheelIterationId): Self = StObject.set(x, "FlywheelIterationId", value.asInstanceOf[js.Any])
    
    inline def setFlywheelIterationIdUndefined: Self = StObject.set(x, "FlywheelIterationId", js.undefined)
    
    inline def setMessage(value: AnyLengthString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setStatus(value: FlywheelIterationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTrainedModelArn(value: ComprehendModelArn): Self = StObject.set(x, "TrainedModelArn", value.asInstanceOf[js.Any])
    
    inline def setTrainedModelArnUndefined: Self = StObject.set(x, "TrainedModelArn", js.undefined)
    
    inline def setTrainedModelMetrics(value: FlywheelModelEvaluationMetrics): Self = StObject.set(x, "TrainedModelMetrics", value.asInstanceOf[js.Any])
    
    inline def setTrainedModelMetricsUndefined: Self = StObject.set(x, "TrainedModelMetrics", js.undefined)
  }
}
