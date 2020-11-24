package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.MergeEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PEventMergeEventObject extends js.Object {
  
  val pEvent: MergeEventObject = js.native
}
object PEventMergeEventObject {
  
  @scala.inline
  def apply(pEvent: MergeEventObject): PEventMergeEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventMergeEventObject]
  }
  
  @scala.inline
  implicit class PEventMergeEventObjectOps[Self <: PEventMergeEventObject] (val x: Self) extends AnyVal {
    
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
    def setPEvent(value: MergeEventObject): Self = this.set("pEvent", value.asInstanceOf[js.Any])
  }
}
