package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.DocReturnEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PEventDocReturnEventObject extends js.Object {
  
  val pEvent: DocReturnEventObject = js.native
}
object PEventDocReturnEventObject {
  
  @scala.inline
  def apply(pEvent: DocReturnEventObject): PEventDocReturnEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventDocReturnEventObject]
  }
  
  @scala.inline
  implicit class PEventDocReturnEventObjectOps[Self <: PEventDocReturnEventObject] (val x: Self) extends AnyVal {
    
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
    def setPEvent(value: DocReturnEventObject): Self = this.set("pEvent", value.asInstanceOf[js.Any])
  }
}
