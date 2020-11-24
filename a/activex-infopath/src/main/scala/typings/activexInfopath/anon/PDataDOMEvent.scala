package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.DataDOMEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDataDOMEvent extends js.Object {
  
  val pDataDOMEvent: DataDOMEventObject = js.native
}
object PDataDOMEvent {
  
  @scala.inline
  def apply(pDataDOMEvent: DataDOMEventObject): PDataDOMEvent = {
    val __obj = js.Dynamic.literal(pDataDOMEvent = pDataDOMEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDataDOMEvent]
  }
  
  @scala.inline
  implicit class PDataDOMEventOps[Self <: PDataDOMEvent] (val x: Self) extends AnyVal {
    
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
    def setPDataDOMEvent(value: DataDOMEventObject): Self = this.set("pDataDOMEvent", value.asInstanceOf[js.Any])
  }
}
