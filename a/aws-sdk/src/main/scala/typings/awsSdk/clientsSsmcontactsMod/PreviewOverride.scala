package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewOverride extends StObject {
  
  /**
    * Information about the time a rotation override would end.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Information about contacts to add to an on-call rotation override.
    */
  var NewMembers: js.UndefOr[RotationOverridePreviewMemberList] = js.undefined
  
  /**
    * Information about the time a rotation override would begin.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object PreviewOverride {
  
  inline def apply(): PreviewOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewOverride]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreviewOverride] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setNewMembers(value: RotationOverridePreviewMemberList): Self = StObject.set(x, "NewMembers", value.asInstanceOf[js.Any])
    
    inline def setNewMembersUndefined: Self = StObject.set(x, "NewMembers", js.undefined)
    
    inline def setNewMembersVarargs(value: Member*): Self = StObject.set(x, "NewMembers", js.Array(value*))
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
