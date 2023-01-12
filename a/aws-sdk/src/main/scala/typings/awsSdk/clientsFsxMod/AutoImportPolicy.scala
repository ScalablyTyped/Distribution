package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoImportPolicy extends StObject {
  
  /**
    * The AutoImportPolicy can have the following event values:    NEW - Amazon FSx automatically imports metadata of files added to the linked S3 bucket that do not currently exist in the FSx file system.    CHANGED - Amazon FSx automatically updates file metadata and invalidates existing file content on the file system as files change in the data repository.    DELETED - Amazon FSx automatically deletes files on the file system as corresponding files are deleted in the data repository.   You can define any combination of event types for your AutoImportPolicy.
    */
  var Events: js.UndefOr[EventTypes] = js.undefined
}
object AutoImportPolicy {
  
  inline def apply(): AutoImportPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoImportPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoImportPolicy] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: EventTypes): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setEventsVarargs(value: EventType*): Self = StObject.set(x, "Events", js.Array(value*))
  }
}
