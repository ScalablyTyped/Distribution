package typings.awsSdk.braketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuantumTaskSummary extends js.Object {
  
  /**
    * The time at which the task was created.
    */
  var createdAt: SyntheticTimestampDateTime = js.native
  
  /**
    * The ARN of the device the task ran on.
    */
  var deviceArn: DeviceArn = js.native
  
  /**
    * The time at which the task finished.
    */
  var endedAt: js.UndefOr[SyntheticTimestampDateTime] = js.native
  
  /**
    * The S3 bucket where the task result file is stored..
    */
  var outputS3Bucket: String = js.native
  
  /**
    * The folder in the S3 bucket where the task result file is stored.
    */
  var outputS3Directory: String = js.native
  
  /**
    * The ARN of the task.
    */
  var quantumTaskArn: QuantumTaskArn = js.native
  
  /**
    * The shots used for the task.
    */
  var shots: Long = js.native
  
  /**
    * The status of the task.
    */
  var status: QuantumTaskStatus = js.native
  
  /**
    * Displays the key, value pairs of tags associated with this quantum task.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}
object QuantumTaskSummary {
  
  @scala.inline
  def apply(
    createdAt: SyntheticTimestampDateTime,
    deviceArn: DeviceArn,
    outputS3Bucket: String,
    outputS3Directory: String,
    quantumTaskArn: QuantumTaskArn,
    shots: Long,
    status: QuantumTaskStatus
  ): QuantumTaskSummary = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], deviceArn = deviceArn.asInstanceOf[js.Any], outputS3Bucket = outputS3Bucket.asInstanceOf[js.Any], outputS3Directory = outputS3Directory.asInstanceOf[js.Any], quantumTaskArn = quantumTaskArn.asInstanceOf[js.Any], shots = shots.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantumTaskSummary]
  }
  
  @scala.inline
  implicit class QuantumTaskSummaryOps[Self <: QuantumTaskSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreatedAt(value: SyntheticTimestampDateTime): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceArn(value: DeviceArn): Self = this.set("deviceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputS3Bucket(value: String): Self = this.set("outputS3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputS3Directory(value: String): Self = this.set("outputS3Directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantumTaskArn(value: QuantumTaskArn): Self = this.set("quantumTaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShots(value: Long): Self = this.set("shots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: QuantumTaskStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndedAt(value: SyntheticTimestampDateTime): Self = this.set("endedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndedAt: Self = this.set("endedAt", js.undefined)
    
    @scala.inline
    def setTags(value: TagsMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
