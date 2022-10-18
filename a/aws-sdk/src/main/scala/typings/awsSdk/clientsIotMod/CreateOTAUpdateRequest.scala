package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOTAUpdateRequest extends StObject {
  
  /**
    * A list of additional OTA update parameters which are name-value pairs.
    */
  var additionalParameters: js.UndefOr[AdditionalParameterMap] = js.undefined
  
  /**
    * The criteria that determine when and how a job abort takes place.
    */
  var awsJobAbortConfig: js.UndefOr[AwsJobAbortConfig] = js.undefined
  
  /**
    * Configuration for the rollout of OTA updates.
    */
  var awsJobExecutionsRolloutConfig: js.UndefOr[AwsJobExecutionsRolloutConfig] = js.undefined
  
  /**
    * Configuration information for pre-signed URLs.
    */
  var awsJobPresignedUrlConfig: js.UndefOr[AwsJobPresignedUrlConfig] = js.undefined
  
  /**
    * Specifies the amount of time each device has to finish its execution of the job. A timer is started when the job execution status is set to IN_PROGRESS. If the job execution status is not set to another terminal state before the timer expires, it will be automatically set to TIMED_OUT.
    */
  var awsJobTimeoutConfig: js.UndefOr[AwsJobTimeoutConfig] = js.undefined
  
  /**
    * The description of the OTA update.
    */
  var description: js.UndefOr[OTAUpdateDescription] = js.undefined
  
  /**
    * The files to be streamed by the OTA update.
    */
  var files: OTAUpdateFiles
  
  /**
    * The ID of the OTA update to be created.
    */
  var otaUpdateId: OTAUpdateId
  
  /**
    * The protocol used to transfer the OTA update image. Valid values are [HTTP], [MQTT], [HTTP, MQTT]. When both HTTP and MQTT are specified, the target device can choose the protocol.
    */
  var protocols: js.UndefOr[Protocols] = js.undefined
  
  /**
    * The IAM role that grants Amazon Web Services IoT Core access to the Amazon S3, IoT jobs and Amazon Web Services Code Signing resources to create an OTA update job.
    */
  var roleArn: RoleArn
  
  /**
    * Metadata which can be used to manage updates.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Specifies whether the update will continue to run (CONTINUOUS), or will be complete after all the things specified as targets have completed the update (SNAPSHOT). If continuous, the update may also be run on a thing when a change is detected in a target. For example, an update will run on a thing when the thing is added to a target group, even after the update was completed by all things originally in the group. Valid values: CONTINUOUS | SNAPSHOT.
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.undefined
  
  /**
    * The devices targeted to receive OTA updates.
    */
  var targets: Targets
}
object CreateOTAUpdateRequest {
  
  inline def apply(files: OTAUpdateFiles, otaUpdateId: OTAUpdateId, roleArn: RoleArn, targets: Targets): CreateOTAUpdateRequest = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], otaUpdateId = otaUpdateId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOTAUpdateRequest]
  }
  
  extension [Self <: CreateOTAUpdateRequest](x: Self) {
    
    inline def setAdditionalParameters(value: AdditionalParameterMap): Self = StObject.set(x, "additionalParameters", value.asInstanceOf[js.Any])
    
    inline def setAdditionalParametersUndefined: Self = StObject.set(x, "additionalParameters", js.undefined)
    
    inline def setAwsJobAbortConfig(value: AwsJobAbortConfig): Self = StObject.set(x, "awsJobAbortConfig", value.asInstanceOf[js.Any])
    
    inline def setAwsJobAbortConfigUndefined: Self = StObject.set(x, "awsJobAbortConfig", js.undefined)
    
    inline def setAwsJobExecutionsRolloutConfig(value: AwsJobExecutionsRolloutConfig): Self = StObject.set(x, "awsJobExecutionsRolloutConfig", value.asInstanceOf[js.Any])
    
    inline def setAwsJobExecutionsRolloutConfigUndefined: Self = StObject.set(x, "awsJobExecutionsRolloutConfig", js.undefined)
    
    inline def setAwsJobPresignedUrlConfig(value: AwsJobPresignedUrlConfig): Self = StObject.set(x, "awsJobPresignedUrlConfig", value.asInstanceOf[js.Any])
    
    inline def setAwsJobPresignedUrlConfigUndefined: Self = StObject.set(x, "awsJobPresignedUrlConfig", js.undefined)
    
    inline def setAwsJobTimeoutConfig(value: AwsJobTimeoutConfig): Self = StObject.set(x, "awsJobTimeoutConfig", value.asInstanceOf[js.Any])
    
    inline def setAwsJobTimeoutConfigUndefined: Self = StObject.set(x, "awsJobTimeoutConfig", js.undefined)
    
    inline def setDescription(value: OTAUpdateDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFiles(value: OTAUpdateFiles): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: OTAUpdateFile*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setOtaUpdateId(value: OTAUpdateId): Self = StObject.set(x, "otaUpdateId", value.asInstanceOf[js.Any])
    
    inline def setProtocols(value: Protocols): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
    
    inline def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "protocols", js.Array(value*))
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTargetSelection(value: TargetSelection): Self = StObject.set(x, "targetSelection", value.asInstanceOf[js.Any])
    
    inline def setTargetSelectionUndefined: Self = StObject.set(x, "targetSelection", js.undefined)
    
    inline def setTargets(value: Targets): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "targets", js.Array(value*))
  }
}
