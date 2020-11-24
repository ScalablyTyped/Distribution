package typings.awsLambda.kinesisFirehoseTransformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseTransformationEvent extends js.Object {
  
  var deliveryStreamArn: String = js.native
  
  var invocationId: String = js.native
  
  var records: js.Array[FirehoseTransformationEventRecord] = js.native
  
  var region: String = js.native
}
object FirehoseTransformationEvent {
  
  @scala.inline
  def apply(
    deliveryStreamArn: String,
    invocationId: String,
    records: js.Array[FirehoseTransformationEventRecord],
    region: String
  ): FirehoseTransformationEvent = {
    val __obj = js.Dynamic.literal(deliveryStreamArn = deliveryStreamArn.asInstanceOf[js.Any], invocationId = invocationId.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseTransformationEvent]
  }
  
  @scala.inline
  implicit class FirehoseTransformationEventOps[Self <: FirehoseTransformationEvent] (val x: Self) extends AnyVal {
    
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
    def setDeliveryStreamArn(value: String): Self = this.set("deliveryStreamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvocationId(value: String): Self = this.set("invocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordsVarargs(value: FirehoseTransformationEventRecord*): Self = this.set("records", js.Array(value :_*))
    
    @scala.inline
    def setRecords(value: js.Array[FirehoseTransformationEventRecord]): Self = this.set("records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
  }
}
