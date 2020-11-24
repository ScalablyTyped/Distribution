package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.SaveEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PEventSaveEventObject extends js.Object {
  
  val pEvent: SaveEventObject = js.native
}
object PEventSaveEventObject {
  
  @scala.inline
  def apply(pEvent: SaveEventObject): PEventSaveEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventSaveEventObject]
  }
  
  @scala.inline
  implicit class PEventSaveEventObjectOps[Self <: PEventSaveEventObject] (val x: Self) extends AnyVal {
    
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
    def setPEvent(value: SaveEventObject): Self = this.set("pEvent", value.asInstanceOf[js.Any])
  }
}
