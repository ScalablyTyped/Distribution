package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.DocReturnEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PEventDocReturnEventObject extends StObject {
  
  val pEvent: DocReturnEventObject
}
object PEventDocReturnEventObject {
  
  inline def apply(pEvent: DocReturnEventObject): PEventDocReturnEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventDocReturnEventObject]
  }
  
  extension [Self <: PEventDocReturnEventObject](x: Self) {
    
    inline def setPEvent(value: DocReturnEventObject): Self = StObject.set(x, "pEvent", value.asInstanceOf[js.Any])
  }
}
