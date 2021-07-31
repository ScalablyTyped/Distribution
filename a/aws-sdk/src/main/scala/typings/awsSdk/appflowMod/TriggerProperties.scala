package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerProperties extends StObject {
  
  /**
    *  Specifies the configuration details of a schedule-triggered flow as defined by the user. 
    */
  var Scheduled: js.UndefOr[ScheduledTriggerProperties] = js.undefined
}
object TriggerProperties {
  
  @scala.inline
  def apply(): TriggerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerProperties]
  }
  
  @scala.inline
  implicit class TriggerPropertiesMutableBuilder[Self <: TriggerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScheduled(value: ScheduledTriggerProperties): Self = StObject.set(x, "Scheduled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledUndefined: Self = StObject.set(x, "Scheduled", js.undefined)
  }
}
