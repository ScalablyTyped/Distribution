package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceServerActionsRequestFilters extends StObject {
  
  /**
    * Action IDs to filter source server post migration custom actions by.
    */
  var actionIDs: js.UndefOr[ActionIDs] = js.undefined
}
object SourceServerActionsRequestFilters {
  
  inline def apply(): SourceServerActionsRequestFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceServerActionsRequestFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceServerActionsRequestFilters] (val x: Self) extends AnyVal {
    
    inline def setActionIDs(value: ActionIDs): Self = StObject.set(x, "actionIDs", value.asInstanceOf[js.Any])
    
    inline def setActionIDsUndefined: Self = StObject.set(x, "actionIDs", js.undefined)
    
    inline def setActionIDsVarargs(value: ActionID*): Self = StObject.set(x, "actionIDs", js.Array(value*))
  }
}
