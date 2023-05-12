package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelCardExportJobResponse extends StObject {
  
  /**
    * The date and time that the model export job was created.
    */
  var CreatedAt: js.Date
  
  /**
    * The exported model card artifacts.
    */
  var ExportArtifacts: js.UndefOr[ModelCardExportArtifacts] = js.undefined
  
  /**
    * The failure reason if the model export job fails.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.clientsSagemakerMod.FailureReason] = js.undefined
  
  /**
    * The date and time that the model export job was last modified.
    */
  var LastModifiedAt: js.Date
  
  /**
    * The Amazon Resource Name (ARN) of the model card export job.
    */
  var ModelCardExportJobArn: typings.awsSdk.clientsSagemakerMod.ModelCardExportJobArn
  
  /**
    * The name of the model card export job to describe.
    */
  var ModelCardExportJobName: EntityName
  
  /**
    * The name of the model card that the model export job exports.
    */
  var ModelCardName: EntityName
  
  /**
    * The version of the model card that the model export job exports.
    */
  var ModelCardVersion: Integer
  
  /**
    * The export output details for the model card.
    */
  var OutputConfig: ModelCardExportOutputConfig
  
  /**
    * The completion status of the model card export job.    InProgress: The model card export job is in progress.    Completed: The model card export job is complete.    Failed: The model card export job failed. To see the reason for the failure, see the FailureReason field in the response to a DescribeModelCardExportJob call.  
    */
  var Status: ModelCardExportJobStatus
}
object DescribeModelCardExportJobResponse {
  
  inline def apply(
    CreatedAt: js.Date,
    LastModifiedAt: js.Date,
    ModelCardExportJobArn: ModelCardExportJobArn,
    ModelCardExportJobName: EntityName,
    ModelCardName: EntityName,
    ModelCardVersion: Integer,
    OutputConfig: ModelCardExportOutputConfig,
    Status: ModelCardExportJobStatus
  ): DescribeModelCardExportJobResponse = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], LastModifiedAt = LastModifiedAt.asInstanceOf[js.Any], ModelCardExportJobArn = ModelCardExportJobArn.asInstanceOf[js.Any], ModelCardExportJobName = ModelCardExportJobName.asInstanceOf[js.Any], ModelCardName = ModelCardName.asInstanceOf[js.Any], ModelCardVersion = ModelCardVersion.asInstanceOf[js.Any], OutputConfig = OutputConfig.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelCardExportJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeModelCardExportJobResponse] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setExportArtifacts(value: ModelCardExportArtifacts): Self = StObject.set(x, "ExportArtifacts", value.asInstanceOf[js.Any])
    
    inline def setExportArtifactsUndefined: Self = StObject.set(x, "ExportArtifacts", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setLastModifiedAt(value: js.Date): Self = StObject.set(x, "LastModifiedAt", value.asInstanceOf[js.Any])
    
    inline def setModelCardExportJobArn(value: ModelCardExportJobArn): Self = StObject.set(x, "ModelCardExportJobArn", value.asInstanceOf[js.Any])
    
    inline def setModelCardExportJobName(value: EntityName): Self = StObject.set(x, "ModelCardExportJobName", value.asInstanceOf[js.Any])
    
    inline def setModelCardName(value: EntityName): Self = StObject.set(x, "ModelCardName", value.asInstanceOf[js.Any])
    
    inline def setModelCardVersion(value: Integer): Self = StObject.set(x, "ModelCardVersion", value.asInstanceOf[js.Any])
    
    inline def setOutputConfig(value: ModelCardExportOutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ModelCardExportJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
