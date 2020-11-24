package typings.awsKcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitializeInput extends js.Object {
  
  var sequenceNumber: js.UndefOr[String] = js.native
  
  var shardId: String = js.native
  
  var subSequenceNumber: js.UndefOr[Double] = js.native
}
object InitializeInput {
  
  @scala.inline
  def apply(shardId: String): InitializeInput = {
    val __obj = js.Dynamic.literal(shardId = shardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializeInput]
  }
  
  @scala.inline
  implicit class InitializeInputOps[Self <: InitializeInput] (val x: Self) extends AnyVal {
    
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
    def setShardId(value: String): Self = this.set("shardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceNumber(value: String): Self = this.set("sequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequenceNumber: Self = this.set("sequenceNumber", js.undefined)
    
    @scala.inline
    def setSubSequenceNumber(value: Double): Self = this.set("subSequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubSequenceNumber: Self = this.set("subSequenceNumber", js.undefined)
  }
}
