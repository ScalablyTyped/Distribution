package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotationShift extends StObject {
  
  /**
    * The Amazon Resource Names (ARNs) of the contacts who are part of the shift rotation. 
    */
  var ContactIds: js.UndefOr[SsmContactsArnList] = js.undefined
  
  /**
    * The time a shift rotation ends.
    */
  var EndTime: js.Date
  
  /**
    * Additional information about an on-call rotation shift.
    */
  var ShiftDetails: js.UndefOr[typings.awsSdk.clientsSsmcontactsMod.ShiftDetails] = js.undefined
  
  /**
    * The time a shift rotation begins.
    */
  var StartTime: js.Date
  
  /**
    * The type of shift rotation.
    */
  var Type: js.UndefOr[ShiftType] = js.undefined
}
object RotationShift {
  
  inline def apply(EndTime: js.Date, StartTime: js.Date): RotationShift = {
    val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationShift]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RotationShift] (val x: Self) extends AnyVal {
    
    inline def setContactIds(value: SsmContactsArnList): Self = StObject.set(x, "ContactIds", value.asInstanceOf[js.Any])
    
    inline def setContactIdsUndefined: Self = StObject.set(x, "ContactIds", js.undefined)
    
    inline def setContactIdsVarargs(value: SsmContactsArn*): Self = StObject.set(x, "ContactIds", js.Array(value*))
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setShiftDetails(value: ShiftDetails): Self = StObject.set(x, "ShiftDetails", value.asInstanceOf[js.Any])
    
    inline def setShiftDetailsUndefined: Self = StObject.set(x, "ShiftDetails", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setType(value: ShiftType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
