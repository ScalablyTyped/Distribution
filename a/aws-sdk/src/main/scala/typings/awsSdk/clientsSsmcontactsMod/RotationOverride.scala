package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotationOverride extends StObject {
  
  /**
    * The time a rotation override was created.
    */
  var CreateTime: js.Date
  
  /**
    * The time a rotation override ends.
    */
  var EndTime: js.Date
  
  /**
    * The Amazon Resource Names (ARNs) of the contacts assigned to the override of the on-call rotation.
    */
  var NewContactIds: SsmContactsArnList
  
  /**
    * The Amazon Resource Name (ARN) of the override to an on-call rotation.
    */
  var RotationOverrideId: Uuid
  
  /**
    * The time a rotation override begins.
    */
  var StartTime: js.Date
}
object RotationOverride {
  
  inline def apply(
    CreateTime: js.Date,
    EndTime: js.Date,
    NewContactIds: SsmContactsArnList,
    RotationOverrideId: Uuid,
    StartTime: js.Date
  ): RotationOverride = {
    val __obj = js.Dynamic.literal(CreateTime = CreateTime.asInstanceOf[js.Any], EndTime = EndTime.asInstanceOf[js.Any], NewContactIds = NewContactIds.asInstanceOf[js.Any], RotationOverrideId = RotationOverrideId.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationOverride]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RotationOverride] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setNewContactIds(value: SsmContactsArnList): Self = StObject.set(x, "NewContactIds", value.asInstanceOf[js.Any])
    
    inline def setNewContactIdsVarargs(value: SsmContactsArn*): Self = StObject.set(x, "NewContactIds", js.Array(value*))
    
    inline def setRotationOverrideId(value: Uuid): Self = StObject.set(x, "RotationOverrideId", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
