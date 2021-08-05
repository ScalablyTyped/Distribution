package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.DataDOMEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDataDOMEvent extends StObject {
  
  val pDataDOMEvent: DataDOMEventObject
}
object PDataDOMEvent {
  
  inline def apply(pDataDOMEvent: DataDOMEventObject): PDataDOMEvent = {
    val __obj = js.Dynamic.literal(pDataDOMEvent = pDataDOMEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDataDOMEvent]
  }
  
  extension [Self <: PDataDOMEvent](x: Self) {
    
    inline def setPDataDOMEvent(value: DataDOMEventObject): Self = StObject.set(x, "pDataDOMEvent", value.asInstanceOf[js.Any])
  }
}
