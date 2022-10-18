package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobData extends StObject {
  
  /**
    * Represents information about an action configuration.
    */
  var actionConfiguration: js.UndefOr[ActionConfiguration] = js.undefined
  
  /**
    * Represents information about an action type.
    */
  var actionTypeId: js.UndefOr[ActionTypeId] = js.undefined
  
  /**
    * Represents an AWS session credentials object. These credentials are temporary credentials that are issued by AWS Secure Token Service (STS). They can be used to access input and output artifacts in the S3 bucket used to store artifacts for the pipeline in AWS CodePipeline.
    */
  var artifactCredentials: js.UndefOr[AWSSessionCredentials] = js.undefined
  
  /**
    * A system-generated token, such as a AWS CodeDeploy deployment ID, required by a job to continue the job asynchronously.
    */
  var continuationToken: js.UndefOr[ContinuationToken] = js.undefined
  
  /**
    * Represents information about the key used to encrypt data in the artifact store, such as an AWS Key Management Service (AWS KMS) key. 
    */
  var encryptionKey: js.UndefOr[EncryptionKey] = js.undefined
  
  /**
    * The artifact supplied to the job.
    */
  var inputArtifacts: js.UndefOr[ArtifactList] = js.undefined
  
  /**
    * The output of the job.
    */
  var outputArtifacts: js.UndefOr[ArtifactList] = js.undefined
  
  /**
    * Represents information about a pipeline to a job worker.  Includes pipelineArn and pipelineExecutionId for custom jobs. 
    */
  var pipelineContext: js.UndefOr[PipelineContext] = js.undefined
}
object JobData {
  
  inline def apply(): JobData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobData]
  }
  
  extension [Self <: JobData](x: Self) {
    
    inline def setActionConfiguration(value: ActionConfiguration): Self = StObject.set(x, "actionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setActionConfigurationUndefined: Self = StObject.set(x, "actionConfiguration", js.undefined)
    
    inline def setActionTypeId(value: ActionTypeId): Self = StObject.set(x, "actionTypeId", value.asInstanceOf[js.Any])
    
    inline def setActionTypeIdUndefined: Self = StObject.set(x, "actionTypeId", js.undefined)
    
    inline def setArtifactCredentials(value: AWSSessionCredentials): Self = StObject.set(x, "artifactCredentials", value.asInstanceOf[js.Any])
    
    inline def setArtifactCredentialsUndefined: Self = StObject.set(x, "artifactCredentials", js.undefined)
    
    inline def setContinuationToken(value: ContinuationToken): Self = StObject.set(x, "continuationToken", value.asInstanceOf[js.Any])
    
    inline def setContinuationTokenUndefined: Self = StObject.set(x, "continuationToken", js.undefined)
    
    inline def setEncryptionKey(value: EncryptionKey): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setInputArtifacts(value: ArtifactList): Self = StObject.set(x, "inputArtifacts", value.asInstanceOf[js.Any])
    
    inline def setInputArtifactsUndefined: Self = StObject.set(x, "inputArtifacts", js.undefined)
    
    inline def setInputArtifactsVarargs(value: Artifact*): Self = StObject.set(x, "inputArtifacts", js.Array(value*))
    
    inline def setOutputArtifacts(value: ArtifactList): Self = StObject.set(x, "outputArtifacts", value.asInstanceOf[js.Any])
    
    inline def setOutputArtifactsUndefined: Self = StObject.set(x, "outputArtifacts", js.undefined)
    
    inline def setOutputArtifactsVarargs(value: Artifact*): Self = StObject.set(x, "outputArtifacts", js.Array(value*))
    
    inline def setPipelineContext(value: PipelineContext): Self = StObject.set(x, "pipelineContext", value.asInstanceOf[js.Any])
    
    inline def setPipelineContextUndefined: Self = StObject.set(x, "pipelineContext", js.undefined)
  }
}
