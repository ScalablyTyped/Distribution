package typings.awsLambda.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Event extends js.Object {
  
  var Records: js.Array[S3EventRecord] = js.native
}
object S3Event {
  
  @scala.inline
  def apply(Records: js.Array[S3EventRecord]): S3Event = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Event]
  }
  
  @scala.inline
  implicit class S3EventOps[Self <: S3Event] (val x: Self) extends AnyVal {
    
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
    def setRecordsVarargs(value: S3EventRecord*): Self = this.set("Records", js.Array(value :_*))
    
    @scala.inline
    def setRecords(value: js.Array[S3EventRecord]): Self = this.set("Records", value.asInstanceOf[js.Any])
  }
}
