package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.VersionUpgradeEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PEventVersionUpgradeEventObject extends StObject {
  
  val pEvent: VersionUpgradeEventObject = js.native
}
object PEventVersionUpgradeEventObject {
  
  @scala.inline
  def apply(pEvent: VersionUpgradeEventObject): PEventVersionUpgradeEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventVersionUpgradeEventObject]
  }
  
  @scala.inline
  implicit class PEventVersionUpgradeEventObjectMutableBuilder[Self <: PEventVersionUpgradeEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPEvent(value: VersionUpgradeEventObject): Self = StObject.set(x, "pEvent", value.asInstanceOf[js.Any])
  }
}
