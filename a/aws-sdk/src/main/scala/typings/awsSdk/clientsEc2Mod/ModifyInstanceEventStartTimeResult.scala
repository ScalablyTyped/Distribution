package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyInstanceEventStartTimeResult extends StObject {
  
  /**
    * Information about the event.
    */
  var Event: js.UndefOr[InstanceStatusEvent] = js.undefined
}
object ModifyInstanceEventStartTimeResult {
  
  inline def apply(): ModifyInstanceEventStartTimeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyInstanceEventStartTimeResult]
  }
  
  extension [Self <: ModifyInstanceEventStartTimeResult](x: Self) {
    
    inline def setEvent(value: InstanceStatusEvent): Self = StObject.set(x, "Event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "Event", js.undefined)
  }
}
