package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.DocActionEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PEvent extends StObject {
  
  val pEvent: DocActionEventObject
}
object PEvent {
  
  inline def apply(pEvent: DocActionEventObject): PEvent = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEvent]
  }
  
  extension [Self <: PEvent](x: Self) {
    
    inline def setPEvent(value: DocActionEventObject): Self = StObject.set(x, "pEvent", value.asInstanceOf[js.Any])
  }
}
