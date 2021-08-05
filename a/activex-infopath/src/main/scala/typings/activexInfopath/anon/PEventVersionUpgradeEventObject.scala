package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.VersionUpgradeEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PEventVersionUpgradeEventObject extends StObject {
  
  val pEvent: VersionUpgradeEventObject
}
object PEventVersionUpgradeEventObject {
  
  inline def apply(pEvent: VersionUpgradeEventObject): PEventVersionUpgradeEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventVersionUpgradeEventObject]
  }
  
  extension [Self <: PEventVersionUpgradeEventObject](x: Self) {
    
    inline def setPEvent(value: VersionUpgradeEventObject): Self = StObject.set(x, "pEvent", value.asInstanceOf[js.Any])
  }
}
