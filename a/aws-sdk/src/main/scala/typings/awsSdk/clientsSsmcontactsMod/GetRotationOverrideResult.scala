package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRotationOverrideResult extends StObject {
  
  /**
    * The date and time when the override was created.
    */
  var CreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time when the override ends.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Names (ARNs) of the contacts assigned to the override of the on-call rotation.
    */
  var NewContactIds: js.UndefOr[SsmContactsArnList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the on-call rotation that was overridden.
    */
  var RotationArn: js.UndefOr[SsmContactsArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the override to an on-call rotation.
    */
  var RotationOverrideId: js.UndefOr[Uuid] = js.undefined
  
  /**
    * The date and time when the override goes into effect.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object GetRotationOverrideResult {
  
  inline def apply(): GetRotationOverrideResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRotationOverrideResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRotationOverrideResult] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setNewContactIds(value: SsmContactsArnList): Self = StObject.set(x, "NewContactIds", value.asInstanceOf[js.Any])
    
    inline def setNewContactIdsUndefined: Self = StObject.set(x, "NewContactIds", js.undefined)
    
    inline def setNewContactIdsVarargs(value: SsmContactsArn*): Self = StObject.set(x, "NewContactIds", js.Array(value*))
    
    inline def setRotationArn(value: SsmContactsArn): Self = StObject.set(x, "RotationArn", value.asInstanceOf[js.Any])
    
    inline def setRotationArnUndefined: Self = StObject.set(x, "RotationArn", js.undefined)
    
    inline def setRotationOverrideId(value: Uuid): Self = StObject.set(x, "RotationOverrideId", value.asInstanceOf[js.Any])
    
    inline def setRotationOverrideIdUndefined: Self = StObject.set(x, "RotationOverrideId", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
