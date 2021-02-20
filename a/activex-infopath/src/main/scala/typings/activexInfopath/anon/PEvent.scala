package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.DocActionEventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PEvent extends StObject {
  
  val pEvent: DocActionEventObject = js.native
}
object PEvent {
  
  @scala.inline
  def apply(pEvent: DocActionEventObject): PEvent = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEvent]
  }
  
  @scala.inline
  implicit class PEventMutableBuilder[Self <: PEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPEvent(value: DocActionEventObject): Self = StObject.set(x, "pEvent", value.asInstanceOf[js.Any])
  }
}
