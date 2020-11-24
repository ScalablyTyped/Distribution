package typings.awsKcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessRecordsInput extends CheckpointInput {
  
  var millisBehindLatest: js.UndefOr[Double] = js.native
  
  var records: js.Array[Record] = js.native
}
object ProcessRecordsInput {
  
  @scala.inline
  def apply(checkpointer: Checkpointer, records: js.Array[Record]): ProcessRecordsInput = {
    val __obj = js.Dynamic.literal(checkpointer = checkpointer.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessRecordsInput]
  }
  
  @scala.inline
  implicit class ProcessRecordsInputOps[Self <: ProcessRecordsInput] (val x: Self) extends AnyVal {
    
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
    def setRecordsVarargs(value: Record*): Self = this.set("records", js.Array(value :_*))
    
    @scala.inline
    def setRecords(value: js.Array[Record]): Self = this.set("records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMillisBehindLatest(value: Double): Self = this.set("millisBehindLatest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMillisBehindLatest: Self = this.set("millisBehindLatest", js.undefined)
  }
}
