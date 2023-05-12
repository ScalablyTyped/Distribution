package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecoveryInstance extends StObject {
  
  /**
    * The ARN of the Recovery Instance.
    */
  var arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The Data Replication Info of the Recovery Instance.
    */
  var dataReplicationInfo: js.UndefOr[RecoveryInstanceDataReplicationInfo] = js.undefined
  
  /**
    * The EC2 instance ID of the Recovery Instance.
    */
  var ec2InstanceID: js.UndefOr[EC2InstanceID] = js.undefined
  
  /**
    * The state of the EC2 instance for this Recovery Instance.
    */
  var ec2InstanceState: js.UndefOr[EC2InstanceState] = js.undefined
  
  /**
    * An object representing failback related information of the Recovery Instance.
    */
  var failback: js.UndefOr[RecoveryInstanceFailback] = js.undefined
  
  /**
    * Whether this Recovery Instance was created for a drill or for an actual Recovery event.
    */
  var isDrill: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the Job that created the Recovery Instance.
    */
  var jobID: js.UndefOr[JobID] = js.undefined
  
  /**
    * AWS availability zone associated with the recovery instance.
    */
  var originAvailabilityZone: js.UndefOr[AwsAvailabilityZone] = js.undefined
  
  /**
    * Environment (On Premises / AWS) of the instance that the recovery instance originated from.
    */
  var originEnvironment: js.UndefOr[OriginEnvironment] = js.undefined
  
  /**
    * The date and time of the Point in Time (PIT) snapshot that this Recovery Instance was launched from.
    */
  var pointInTimeSnapshotDateTime: js.UndefOr[ISO8601DatetimeString] = js.undefined
  
  /**
    * The ID of the Recovery Instance.
    */
  var recoveryInstanceID: js.UndefOr[RecoveryInstanceID] = js.undefined
  
  /**
    * Properties of the Recovery Instance machine.
    */
  var recoveryInstanceProperties: js.UndefOr[RecoveryInstanceProperties] = js.undefined
  
  /**
    * The Source Server ID that this Recovery Instance is associated with.
    */
  var sourceServerID: js.UndefOr[SourceServerID] = js.undefined
  
  /**
    * An array of tags that are associated with the Recovery Instance.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object RecoveryInstance {
  
  inline def apply(): RecoveryInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecoveryInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecoveryInstance] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setDataReplicationInfo(value: RecoveryInstanceDataReplicationInfo): Self = StObject.set(x, "dataReplicationInfo", value.asInstanceOf[js.Any])
    
    inline def setDataReplicationInfoUndefined: Self = StObject.set(x, "dataReplicationInfo", js.undefined)
    
    inline def setEc2InstanceID(value: EC2InstanceID): Self = StObject.set(x, "ec2InstanceID", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceIDUndefined: Self = StObject.set(x, "ec2InstanceID", js.undefined)
    
    inline def setEc2InstanceState(value: EC2InstanceState): Self = StObject.set(x, "ec2InstanceState", value.asInstanceOf[js.Any])
    
    inline def setEc2InstanceStateUndefined: Self = StObject.set(x, "ec2InstanceState", js.undefined)
    
    inline def setFailback(value: RecoveryInstanceFailback): Self = StObject.set(x, "failback", value.asInstanceOf[js.Any])
    
    inline def setFailbackUndefined: Self = StObject.set(x, "failback", js.undefined)
    
    inline def setIsDrill(value: Boolean): Self = StObject.set(x, "isDrill", value.asInstanceOf[js.Any])
    
    inline def setIsDrillUndefined: Self = StObject.set(x, "isDrill", js.undefined)
    
    inline def setJobID(value: JobID): Self = StObject.set(x, "jobID", value.asInstanceOf[js.Any])
    
    inline def setJobIDUndefined: Self = StObject.set(x, "jobID", js.undefined)
    
    inline def setOriginAvailabilityZone(value: AwsAvailabilityZone): Self = StObject.set(x, "originAvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setOriginAvailabilityZoneUndefined: Self = StObject.set(x, "originAvailabilityZone", js.undefined)
    
    inline def setOriginEnvironment(value: OriginEnvironment): Self = StObject.set(x, "originEnvironment", value.asInstanceOf[js.Any])
    
    inline def setOriginEnvironmentUndefined: Self = StObject.set(x, "originEnvironment", js.undefined)
    
    inline def setPointInTimeSnapshotDateTime(value: ISO8601DatetimeString): Self = StObject.set(x, "pointInTimeSnapshotDateTime", value.asInstanceOf[js.Any])
    
    inline def setPointInTimeSnapshotDateTimeUndefined: Self = StObject.set(x, "pointInTimeSnapshotDateTime", js.undefined)
    
    inline def setRecoveryInstanceID(value: RecoveryInstanceID): Self = StObject.set(x, "recoveryInstanceID", value.asInstanceOf[js.Any])
    
    inline def setRecoveryInstanceIDUndefined: Self = StObject.set(x, "recoveryInstanceID", js.undefined)
    
    inline def setRecoveryInstanceProperties(value: RecoveryInstanceProperties): Self = StObject.set(x, "recoveryInstanceProperties", value.asInstanceOf[js.Any])
    
    inline def setRecoveryInstancePropertiesUndefined: Self = StObject.set(x, "recoveryInstanceProperties", js.undefined)
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
    
    inline def setSourceServerIDUndefined: Self = StObject.set(x, "sourceServerID", js.undefined)
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
