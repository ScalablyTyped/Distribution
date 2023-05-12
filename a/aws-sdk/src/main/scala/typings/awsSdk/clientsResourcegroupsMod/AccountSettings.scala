package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSettings extends StObject {
  
  /**
    * The desired target status of the group lifecycle events feature. If
    */
  var GroupLifecycleEventsDesiredStatus: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.GroupLifecycleEventsDesiredStatus] = js.undefined
  
  /**
    * The current status of the group lifecycle events feature.
    */
  var GroupLifecycleEventsStatus: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.GroupLifecycleEventsStatus] = js.undefined
  
  /**
    * The text of any error message occurs during an attempt to turn group lifecycle events on or off.
    */
  var GroupLifecycleEventsStatusMessage: js.UndefOr[typings.awsSdk.clientsResourcegroupsMod.GroupLifecycleEventsStatusMessage] = js.undefined
}
object AccountSettings {
  
  inline def apply(): AccountSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountSettings] (val x: Self) extends AnyVal {
    
    inline def setGroupLifecycleEventsDesiredStatus(value: GroupLifecycleEventsDesiredStatus): Self = StObject.set(x, "GroupLifecycleEventsDesiredStatus", value.asInstanceOf[js.Any])
    
    inline def setGroupLifecycleEventsDesiredStatusUndefined: Self = StObject.set(x, "GroupLifecycleEventsDesiredStatus", js.undefined)
    
    inline def setGroupLifecycleEventsStatus(value: GroupLifecycleEventsStatus): Self = StObject.set(x, "GroupLifecycleEventsStatus", value.asInstanceOf[js.Any])
    
    inline def setGroupLifecycleEventsStatusMessage(value: GroupLifecycleEventsStatusMessage): Self = StObject.set(x, "GroupLifecycleEventsStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setGroupLifecycleEventsStatusMessageUndefined: Self = StObject.set(x, "GroupLifecycleEventsStatusMessage", js.undefined)
    
    inline def setGroupLifecycleEventsStatusUndefined: Self = StObject.set(x, "GroupLifecycleEventsStatus", js.undefined)
  }
}
