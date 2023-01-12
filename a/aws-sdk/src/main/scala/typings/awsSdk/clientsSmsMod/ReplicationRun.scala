package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationRun extends StObject {
  
  /**
    * The ID of the Amazon Machine Image (AMI) from the replication run.
    */
  var amiId: js.UndefOr[AmiId] = js.undefined
  
  /**
    * The completion time of the last replication run.
    */
  var completedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the replication run.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * Indicates whether the replication run should produce an encrypted AMI.
    */
  var encrypted: js.UndefOr[Encrypted] = js.undefined
  
  /**
    * The ID of the KMS key for replication jobs that produce encrypted AMIs. This value can be any of the following:   KMS key ID   KMS key alias   ARN referring to the KMS key ID   ARN referring to the KMS key alias    If encrypted is true but a KMS key ID is not specified, the customer's default KMS key for Amazon EBS is used. 
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * The ID of the replication run.
    */
  var replicationRunId: js.UndefOr[ReplicationRunId] = js.undefined
  
  /**
    * The start time of the next replication run.
    */
  var scheduledStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Details about the current stage of the replication run.
    */
  var stageDetails: js.UndefOr[ReplicationRunStageDetails] = js.undefined
  
  /**
    * The state of the replication run.
    */
  var state: js.UndefOr[ReplicationRunState] = js.undefined
  
  /**
    * The description of the current status of the replication job.
    */
  var statusMessage: js.UndefOr[ReplicationRunStatusMessage] = js.undefined
  
  /**
    * The type of replication run.
    */
  var `type`: js.UndefOr[ReplicationRunType] = js.undefined
}
object ReplicationRun {
  
  inline def apply(): ReplicationRun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationRun]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicationRun] (val x: Self) extends AnyVal {
    
    inline def setAmiId(value: AmiId): Self = StObject.set(x, "amiId", value.asInstanceOf[js.Any])
    
    inline def setAmiIdUndefined: Self = StObject.set(x, "amiId", js.undefined)
    
    inline def setCompletedTime(value: js.Date): Self = StObject.set(x, "completedTime", value.asInstanceOf[js.Any])
    
    inline def setCompletedTimeUndefined: Self = StObject.set(x, "completedTime", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEncrypted(value: Encrypted): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setReplicationRunId(value: ReplicationRunId): Self = StObject.set(x, "replicationRunId", value.asInstanceOf[js.Any])
    
    inline def setReplicationRunIdUndefined: Self = StObject.set(x, "replicationRunId", js.undefined)
    
    inline def setScheduledStartTime(value: js.Date): Self = StObject.set(x, "scheduledStartTime", value.asInstanceOf[js.Any])
    
    inline def setScheduledStartTimeUndefined: Self = StObject.set(x, "scheduledStartTime", js.undefined)
    
    inline def setStageDetails(value: ReplicationRunStageDetails): Self = StObject.set(x, "stageDetails", value.asInstanceOf[js.Any])
    
    inline def setStageDetailsUndefined: Self = StObject.set(x, "stageDetails", js.undefined)
    
    inline def setState(value: ReplicationRunState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatusMessage(value: ReplicationRunStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setType(value: ReplicationRunType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
