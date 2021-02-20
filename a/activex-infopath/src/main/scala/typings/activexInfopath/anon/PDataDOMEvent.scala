package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.DataDOMEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDataDOMEvent extends StObject {
  
  val pDataDOMEvent: DataDOMEventObject = js.native
}
object PDataDOMEvent {
  
  @scala.inline
  def apply(pDataDOMEvent: DataDOMEventObject): PDataDOMEvent = {
    val __obj = js.Dynamic.literal(pDataDOMEvent = pDataDOMEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDataDOMEvent]
  }
  
  @scala.inline
  implicit class PDataDOMEventMutableBuilder[Self <: PDataDOMEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPDataDOMEvent(value: DataDOMEventObject): Self = StObject.set(x, "pDataDOMEvent", value.asInstanceOf[js.Any])
  }
}
