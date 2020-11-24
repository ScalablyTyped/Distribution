package typings.awsLambda.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SESEventRecord extends js.Object {
  
  var eventSource: String = js.native
  
  var eventVersion: String = js.native
  
  var ses: SESMessage = js.native
}
object SESEventRecord {
  
  @scala.inline
  def apply(eventSource: String, eventVersion: String, ses: SESMessage): SESEventRecord = {
    val __obj = js.Dynamic.literal(eventSource = eventSource.asInstanceOf[js.Any], eventVersion = eventVersion.asInstanceOf[js.Any], ses = ses.asInstanceOf[js.Any])
    __obj.asInstanceOf[SESEventRecord]
  }
  
  @scala.inline
  implicit class SESEventRecordOps[Self <: SESEventRecord] (val x: Self) extends AnyVal {
    
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
    def setEventSource(value: String): Self = this.set("eventSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventVersion(value: String): Self = this.set("eventVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSes(value: SESMessage): Self = this.set("ses", value.asInstanceOf[js.Any])
  }
}
