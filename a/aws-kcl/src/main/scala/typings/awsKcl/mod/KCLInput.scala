package typings.awsKcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KCLInput extends js.Object {
  
  var recordProcessor: RecordProcessor = js.native
  
  var version: js.Symbol = js.native
}
object KCLInput {
  
  @scala.inline
  def apply(recordProcessor: RecordProcessor, version: js.Symbol): KCLInput = {
    val __obj = js.Dynamic.literal(recordProcessor = recordProcessor.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[KCLInput]
  }
  
  @scala.inline
  implicit class KCLInputOps[Self <: KCLInput] (val x: Self) extends AnyVal {
    
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
    def setRecordProcessor(value: RecordProcessor): Self = this.set("recordProcessor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: js.Symbol): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
