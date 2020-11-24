package typings.awsLambda.kinesisFirehoseTransformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseRecordMetadata extends js.Object {
  
  var approximateArrivalTimestamp: Double = js.native
  
  var partitionKey: String = js.native
  
  var sequenceNumber: String = js.native
  
  var shardId: String = js.native
  
  var subsequenceNumber: String = js.native
}
object FirehoseRecordMetadata {
  
  @scala.inline
  def apply(
    approximateArrivalTimestamp: Double,
    partitionKey: String,
    sequenceNumber: String,
    shardId: String,
    subsequenceNumber: String
  ): FirehoseRecordMetadata = {
    val __obj = js.Dynamic.literal(approximateArrivalTimestamp = approximateArrivalTimestamp.asInstanceOf[js.Any], partitionKey = partitionKey.asInstanceOf[js.Any], sequenceNumber = sequenceNumber.asInstanceOf[js.Any], shardId = shardId.asInstanceOf[js.Any], subsequenceNumber = subsequenceNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseRecordMetadata]
  }
  
  @scala.inline
  implicit class FirehoseRecordMetadataOps[Self <: FirehoseRecordMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApproximateArrivalTimestamp(value: Double): Self = this.set("approximateArrivalTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionKey(value: String): Self = this.set("partitionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceNumber(value: String): Self = this.set("sequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardId(value: String): Self = this.set("shardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubsequenceNumber(value: String): Self = this.set("subsequenceNumber", value.asInstanceOf[js.Any])
  }
}
