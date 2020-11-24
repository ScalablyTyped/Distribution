package typings.awsLambda.cloudwatchLogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWatchLogsEvent extends js.Object {
  
  var awslogs: CloudWatchLogsEventData = js.native
}
object CloudWatchLogsEvent {
  
  @scala.inline
  def apply(awslogs: CloudWatchLogsEventData): CloudWatchLogsEvent = {
    val __obj = js.Dynamic.literal(awslogs = awslogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogsEvent]
  }
  
  @scala.inline
  implicit class CloudWatchLogsEventOps[Self <: CloudWatchLogsEvent] (val x: Self) extends AnyVal {
    
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
    def setAwslogs(value: CloudWatchLogsEventData): Self = this.set("awslogs", value.asInstanceOf[js.Any])
  }
}
