package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEdgePackagingJobResponse extends StObject {
  
  /**
    * The name of the SageMaker Neo compilation job that is used to locate model artifacts that are being packaged.
    */
  var CompilationJobName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The timestamp of when the packaging job was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the edge packaging job.
    */
  var EdgePackagingJobArn: typings.awsSdk.clientsSagemakerMod.EdgePackagingJobArn
  
  /**
    * The name of the edge packaging job.
    */
  var EdgePackagingJobName: EntityName
  
  /**
    * The current status of the packaging job.
    */
  var EdgePackagingJobStatus: typings.awsSdk.clientsSagemakerMod.EdgePackagingJobStatus
  
  /**
    * Returns a message describing the job status and error messages.
    */
  var EdgePackagingJobStatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp of when the job was last updated.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Simple Storage (S3) URI where model artifacts ares stored.
    */
  var ModelArtifact: js.UndefOr[S3Uri] = js.undefined
  
  /**
    * The name of the model.
    */
  var ModelName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The signature document of files in the model artifact.
    */
  var ModelSignature: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the model.
    */
  var ModelVersion: js.UndefOr[EdgeVersion] = js.undefined
  
  /**
    * The output configuration for the edge packaging job.
    */
  var OutputConfig: js.UndefOr[EdgeOutputConfig] = js.undefined
  
  /**
    * The output of a SageMaker Edge Manager deployable resource.
    */
  var PresetDeploymentOutput: js.UndefOr[EdgePresetDeploymentOutput] = js.undefined
  
  /**
    * The Amazon Web Services KMS key to use when encrypting the EBS volume the job run on.
    */
  var ResourceKey: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that enables Amazon SageMaker to download and upload the model, and to contact Neo.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RoleArn] = js.undefined
}
object DescribeEdgePackagingJobResponse {
  
  inline def apply(
    EdgePackagingJobArn: EdgePackagingJobArn,
    EdgePackagingJobName: EntityName,
    EdgePackagingJobStatus: EdgePackagingJobStatus
  ): DescribeEdgePackagingJobResponse = {
    val __obj = js.Dynamic.literal(EdgePackagingJobArn = EdgePackagingJobArn.asInstanceOf[js.Any], EdgePackagingJobName = EdgePackagingJobName.asInstanceOf[js.Any], EdgePackagingJobStatus = EdgePackagingJobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEdgePackagingJobResponse]
  }
  
  extension [Self <: DescribeEdgePackagingJobResponse](x: Self) {
    
    inline def setCompilationJobName(value: EntityName): Self = StObject.set(x, "CompilationJobName", value.asInstanceOf[js.Any])
    
    inline def setCompilationJobNameUndefined: Self = StObject.set(x, "CompilationJobName", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setEdgePackagingJobArn(value: EdgePackagingJobArn): Self = StObject.set(x, "EdgePackagingJobArn", value.asInstanceOf[js.Any])
    
    inline def setEdgePackagingJobName(value: EntityName): Self = StObject.set(x, "EdgePackagingJobName", value.asInstanceOf[js.Any])
    
    inline def setEdgePackagingJobStatus(value: EdgePackagingJobStatus): Self = StObject.set(x, "EdgePackagingJobStatus", value.asInstanceOf[js.Any])
    
    inline def setEdgePackagingJobStatusMessage(value: String): Self = StObject.set(x, "EdgePackagingJobStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setEdgePackagingJobStatusMessageUndefined: Self = StObject.set(x, "EdgePackagingJobStatusMessage", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setModelArtifact(value: S3Uri): Self = StObject.set(x, "ModelArtifact", value.asInstanceOf[js.Any])
    
    inline def setModelArtifactUndefined: Self = StObject.set(x, "ModelArtifact", js.undefined)
    
    inline def setModelName(value: EntityName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameUndefined: Self = StObject.set(x, "ModelName", js.undefined)
    
    inline def setModelSignature(value: String): Self = StObject.set(x, "ModelSignature", value.asInstanceOf[js.Any])
    
    inline def setModelSignatureUndefined: Self = StObject.set(x, "ModelSignature", js.undefined)
    
    inline def setModelVersion(value: EdgeVersion): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    inline def setModelVersionUndefined: Self = StObject.set(x, "ModelVersion", js.undefined)
    
    inline def setOutputConfig(value: EdgeOutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "OutputConfig", js.undefined)
    
    inline def setPresetDeploymentOutput(value: EdgePresetDeploymentOutput): Self = StObject.set(x, "PresetDeploymentOutput", value.asInstanceOf[js.Any])
    
    inline def setPresetDeploymentOutputUndefined: Self = StObject.set(x, "PresetDeploymentOutput", js.undefined)
    
    inline def setResourceKey(value: KmsKeyId): Self = StObject.set(x, "ResourceKey", value.asInstanceOf[js.Any])
    
    inline def setResourceKeyUndefined: Self = StObject.set(x, "ResourceKey", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
