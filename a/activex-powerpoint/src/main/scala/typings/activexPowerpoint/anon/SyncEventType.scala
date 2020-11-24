package typings.activexPowerpoint.anon

import typings.activexOffice.Office.MsoSyncEventType
import typings.activexPowerpoint.PowerPoint.Presentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyncEventType extends js.Object {
  
  val Pres: Presentation = js.native
  
  val SyncEventType: MsoSyncEventType = js.native
}
object SyncEventType {
  
  @scala.inline
  def apply(Pres: Presentation, SyncEventType: MsoSyncEventType): SyncEventType = {
    val __obj = js.Dynamic.literal(Pres = Pres.asInstanceOf[js.Any], SyncEventType = SyncEventType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncEventType]
  }
  
  @scala.inline
  implicit class SyncEventTypeOps[Self <: SyncEventType] (val x: Self) extends AnyVal {
    
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
    def setPres(value: Presentation): Self = this.set("Pres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncEventType(value: MsoSyncEventType): Self = this.set("SyncEventType", value.asInstanceOf[js.Any])
  }
}
