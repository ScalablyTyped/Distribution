package typings.awsLambda.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SNSEvent extends js.Object {
  
  var Records: js.Array[SNSEventRecord] = js.native
}
object SNSEvent {
  
  @scala.inline
  def apply(Records: js.Array[SNSEventRecord]): SNSEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[SNSEvent]
  }
  
  @scala.inline
  implicit class SNSEventOps[Self <: SNSEvent] (val x: Self) extends AnyVal {
    
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
    def setRecordsVarargs(value: SNSEventRecord*): Self = this.set("Records", js.Array(value :_*))
    
    @scala.inline
    def setRecords(value: js.Array[SNSEventRecord]): Self = this.set("Records", value.asInstanceOf[js.Any])
  }
}
