package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.DocContextChangeEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PEventDocContextChangeEventObject extends js.Object {
  
  val pEvent: DocContextChangeEventObject = js.native
}
object PEventDocContextChangeEventObject {
  
  @scala.inline
  def apply(pEvent: DocContextChangeEventObject): PEventDocContextChangeEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventDocContextChangeEventObject]
  }
  
  @scala.inline
  implicit class PEventDocContextChangeEventObjectOps[Self <: PEventDocContextChangeEventObject] (val x: Self) extends AnyVal {
    
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
    def setPEvent(value: DocContextChangeEventObject): Self = this.set("pEvent", value.asInstanceOf[js.Any])
  }
}
