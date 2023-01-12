package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoExportPolicy extends StObject {
  
  /**
    * The AutoExportPolicy can have the following event values:    NEW - New files and directories are automatically exported to the data repository as they are added to the file system.    CHANGED - Changes to files and directories on the file system are automatically exported to the data repository.    DELETED - Files and directories are automatically deleted on the data repository when they are deleted on the file system.   You can define any combination of event types for your AutoExportPolicy.
    */
  var Events: js.UndefOr[EventTypes] = js.undefined
}
object AutoExportPolicy {
  
  inline def apply(): AutoExportPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoExportPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoExportPolicy] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: EventTypes): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setEventsVarargs(value: EventType*): Self = StObject.set(x, "Events", js.Array(value*))
  }
}
