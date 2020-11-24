package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrintCompleteEvent extends js.Object {
  
  var results: PrintCompleteEventResults = js.native
}
object PrintCompleteEvent {
  
  @scala.inline
  def apply(results: PrintCompleteEventResults): PrintCompleteEvent = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintCompleteEvent]
  }
  
  @scala.inline
  implicit class PrintCompleteEventOps[Self <: PrintCompleteEvent] (val x: Self) extends AnyVal {
    
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
    def setResults(value: PrintCompleteEventResults): Self = this.set("results", value.asInstanceOf[js.Any])
  }
}
