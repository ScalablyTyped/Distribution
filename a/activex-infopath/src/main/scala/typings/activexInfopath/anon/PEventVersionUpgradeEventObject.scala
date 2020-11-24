package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.VersionUpgradeEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PEventVersionUpgradeEventObject extends js.Object {
  
  val pEvent: VersionUpgradeEventObject = js.native
}
object PEventVersionUpgradeEventObject {
  
  @scala.inline
  def apply(pEvent: VersionUpgradeEventObject): PEventVersionUpgradeEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventVersionUpgradeEventObject]
  }
  
  @scala.inline
  implicit class PEventVersionUpgradeEventObjectOps[Self <: PEventVersionUpgradeEventObject] (val x: Self) extends AnyVal {
    
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
    def setPEvent(value: VersionUpgradeEventObject): Self = this.set("pEvent", value.asInstanceOf[js.Any])
  }
}
