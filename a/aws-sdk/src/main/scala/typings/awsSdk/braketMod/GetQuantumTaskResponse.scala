package typings.awsSdk.braketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQuantumTaskResponse extends StObject {
  
  /**
    * The time at which the task was created.
    */
  var createdAt: SyntheticTimestampDateTime
  
  /**
    * The ARN of the device the task was run on.
    */
  var deviceArn: DeviceArn
  
  /**
    * The parameters for the device on which the task ran.
    */
  var deviceParameters: JsonValue
  
  /**
    * The time at which the task ended.
    */
  var endedAt: js.UndefOr[SyntheticTimestampDateTime] = js.undefined
  
  /**
    * The reason that a task failed.
    */
  var failureReason: js.UndefOr[String] = js.undefined
  
  /**
    * The S3 bucket where task results are stored.
    */
  var outputS3Bucket: String
  
  /**
    * The folder in the S3 bucket where task results are stored.
    */
  var outputS3Directory: String
  
  /**
    * The ARN of the task.
    */
  var quantumTaskArn: QuantumTaskArn
  
  /**
    * The number of shots used in the task.
    */
  var shots: Long
  
  /**
    * The status of the task.
    */
  var status: QuantumTaskStatus
  
  /**
    * The tags that belong to this task.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object GetQuantumTaskResponse {
  
  @scala.inline
  def apply(
    createdAt: SyntheticTimestampDateTime,
    deviceArn: DeviceArn,
    deviceParameters: JsonValue,
    outputS3Bucket: String,
    outputS3Directory: String,
    quantumTaskArn: QuantumTaskArn,
    shots: Long,
    status: QuantumTaskStatus
  ): GetQuantumTaskResponse = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], deviceArn = deviceArn.asInstanceOf[js.Any], deviceParameters = deviceParameters.asInstanceOf[js.Any], outputS3Bucket = outputS3Bucket.asInstanceOf[js.Any], outputS3Directory = outputS3Directory.asInstanceOf[js.Any], quantumTaskArn = quantumTaskArn.asInstanceOf[js.Any], shots = shots.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQuantumTaskResponse]
  }
  
  @scala.inline
  implicit class GetQuantumTaskResponseMutableBuilder[Self <: GetQuantumTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: SyntheticTimestampDateTime): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceArn(value: DeviceArn): Self = StObject.set(x, "deviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceParameters(value: JsonValue): Self = StObject.set(x, "deviceParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndedAt(value: SyntheticTimestampDateTime): Self = StObject.set(x, "endedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndedAtUndefined: Self = StObject.set(x, "endedAt", js.undefined)
    
    @scala.inline
    def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    @scala.inline
    def setOutputS3Bucket(value: String): Self = StObject.set(x, "outputS3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputS3Directory(value: String): Self = StObject.set(x, "outputS3Directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantumTaskArn(value: QuantumTaskArn): Self = StObject.set(x, "quantumTaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShots(value: Long): Self = StObject.set(x, "shots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: QuantumTaskStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
