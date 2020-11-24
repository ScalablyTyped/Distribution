package typings.awsLambda.mskMod

import typings.awsLambda.awsLambdaStrings.CREATE_TIME
import typings.awsLambda.awsLambdaStrings.LOG_APPEND_TIME
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSKRecord extends js.Object {
  
  var key: String = js.native
  
  var offset: Double = js.native
  
  var partition: Double = js.native
  
  var timestamp: Double = js.native
  
  var timestampType: CREATE_TIME | LOG_APPEND_TIME = js.native
  
  var topic: String = js.native
  
  var value: String = js.native
}
object MSKRecord {
  
  @scala.inline
  def apply(
    key: String,
    offset: Double,
    partition: Double,
    timestamp: Double,
    timestampType: CREATE_TIME | LOG_APPEND_TIME,
    topic: String,
    value: String
  ): MSKRecord = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestampType = timestampType.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSKRecord]
  }
  
  @scala.inline
  implicit class MSKRecordOps[Self <: MSKRecord] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartition(value: Double): Self = this.set("partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampType(value: CREATE_TIME | LOG_APPEND_TIME): Self = this.set("timestampType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
