package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuantumTaskSummary extends StObject {
  
  /**
    * The time at which the task was created.
    */
  var createdAt: js.Date
  
  /**
    * The ARN of the device the task ran on.
    */
  var deviceArn: DeviceArn
  
  /**
    * The time at which the task finished.
    */
  var endedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The S3 bucket where the task result file is stored..
    */
  var outputS3Bucket: String
  
  /**
    * The folder in the S3 bucket where the task result file is stored.
    */
  var outputS3Directory: String
  
  /**
    * The ARN of the task.
    */
  var quantumTaskArn: QuantumTaskArn
  
  /**
    * The shots used for the task.
    */
  var shots: Long
  
  /**
    * The status of the task.
    */
  var status: QuantumTaskStatus
  
  /**
    * Displays the key, value pairs of tags associated with this quantum task.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object QuantumTaskSummary {
  
  inline def apply(
    createdAt: js.Date,
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
  
  extension [Self <: QuantumTaskSummary](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setDeviceArn(value: DeviceArn): Self = StObject.set(x, "deviceArn", value.asInstanceOf[js.Any])
    
    inline def setEndedAt(value: js.Date): Self = StObject.set(x, "endedAt", value.asInstanceOf[js.Any])
    
    inline def setEndedAtUndefined: Self = StObject.set(x, "endedAt", js.undefined)
    
    inline def setOutputS3Bucket(value: String): Self = StObject.set(x, "outputS3Bucket", value.asInstanceOf[js.Any])
    
    inline def setOutputS3Directory(value: String): Self = StObject.set(x, "outputS3Directory", value.asInstanceOf[js.Any])
    
    inline def setQuantumTaskArn(value: QuantumTaskArn): Self = StObject.set(x, "quantumTaskArn", value.asInstanceOf[js.Any])
    
    inline def setShots(value: Long): Self = StObject.set(x, "shots", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: QuantumTaskStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
