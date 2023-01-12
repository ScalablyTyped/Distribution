package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerProperties extends StObject {
  
  /**
    * Specifies the configuration details of a schedule-triggered flow that you define.
    */
  var Scheduled: js.UndefOr[ScheduledTriggerProperties] = js.undefined
}
object TriggerProperties {
  
  inline def apply(): TriggerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TriggerProperties] (val x: Self) extends AnyVal {
    
    inline def setScheduled(value: ScheduledTriggerProperties): Self = StObject.set(x, "Scheduled", value.asInstanceOf[js.Any])
    
    inline def setScheduledUndefined: Self = StObject.set(x, "Scheduled", js.undefined)
  }
}
