package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAccountSettingsInput extends StObject {
  
  /**
    * Specifies whether you want to turn group lifecycle events on or off.
    */
  var GroupLifecycleEventsDesiredStatus: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.GroupLifecycleEventsDesiredStatus] = js.undefined
}
object UpdateAccountSettingsInput {
  
  inline def apply(): UpdateAccountSettingsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAccountSettingsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAccountSettingsInput] (val x: Self) extends AnyVal {
    
    inline def setGroupLifecycleEventsDesiredStatus(value: GroupLifecycleEventsDesiredStatus): Self = StObject.set(x, "GroupLifecycleEventsDesiredStatus", value.asInstanceOf[js.Any])
    
    inline def setGroupLifecycleEventsDesiredStatusUndefined: Self = StObject.set(x, "GroupLifecycleEventsDesiredStatus", js.undefined)
  }
}
