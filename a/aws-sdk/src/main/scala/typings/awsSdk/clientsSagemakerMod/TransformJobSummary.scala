package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformJobSummary extends StObject {
  
  /**
    * A timestamp that shows when the transform Job was created.
    */
  var CreationTime: js.Date
  
  /**
    * If the transform job failed, the reason it failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * Indicates when the transform job was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates when the transform job ends on compute instances. For successful jobs and stopped jobs, this is the exact time recorded after the results are uploaded. For failed jobs, this is when Amazon SageMaker detected that the job failed.
    */
  var TransformEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the transform job.
    */
  var TransformJobArn: typings.awsSdk.clientsSagemakerMod.TransformJobArn
  
  /**
    * The name of the transform job.
    */
  var TransformJobName: typings.awsSdk.clientsSagemakerMod.TransformJobName
  
  /**
    * The status of the transform job.
    */
  var TransformJobStatus: typings.awsSdk.clientsSagemakerMod.TransformJobStatus
}
object TransformJobSummary {
  
  inline def apply(
    CreationTime: js.Date,
    TransformJobArn: TransformJobArn,
    TransformJobName: TransformJobName,
    TransformJobStatus: TransformJobStatus
  ): TransformJobSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], TransformJobArn = TransformJobArn.asInstanceOf[js.Any], TransformJobName = TransformJobName.asInstanceOf[js.Any], TransformJobStatus = TransformJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformJobSummary]
  }
  
  extension [Self <: TransformJobSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setTransformEndTime(value: js.Date): Self = StObject.set(x, "TransformEndTime", value.asInstanceOf[js.Any])
    
    inline def setTransformEndTimeUndefined: Self = StObject.set(x, "TransformEndTime", js.undefined)
    
    inline def setTransformJobArn(value: TransformJobArn): Self = StObject.set(x, "TransformJobArn", value.asInstanceOf[js.Any])
    
    inline def setTransformJobName(value: TransformJobName): Self = StObject.set(x, "TransformJobName", value.asInstanceOf[js.Any])
    
    inline def setTransformJobStatus(value: TransformJobStatus): Self = StObject.set(x, "TransformJobStatus", value.asInstanceOf[js.Any])
  }
}
