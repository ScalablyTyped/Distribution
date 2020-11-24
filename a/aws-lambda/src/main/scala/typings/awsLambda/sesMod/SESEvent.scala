package typings.awsLambda.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SESEvent extends js.Object {
  
  var Records: js.Array[SESEventRecord] = js.native
}
object SESEvent {
  
  @scala.inline
  def apply(Records: js.Array[SESEventRecord]): SESEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[SESEvent]
  }
  
  @scala.inline
  implicit class SESEventOps[Self <: SESEvent] (val x: Self) extends AnyVal {
    
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
    def setRecordsVarargs(value: SESEventRecord*): Self = this.set("Records", js.Array(value :_*))
    
    @scala.inline
    def setRecords(value: js.Array[SESEventRecord]): Self = this.set("Records", value.asInstanceOf[js.Any])
  }
}
