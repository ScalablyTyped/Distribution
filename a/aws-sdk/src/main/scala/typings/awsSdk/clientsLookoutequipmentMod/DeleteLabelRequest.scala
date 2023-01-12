package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLabelRequest extends StObject {
  
  /**
    *  The name of the label group that contains the label that you want to delete. Data in this field will be retained for service usage. Follow best practices for the security of your data. 
    */
  var LabelGroupName: typings.awsSdk.clientsLookoutequipmentMod.LabelGroupName
  
  /**
    *  The ID of the label that you want to delete. 
    */
  var LabelId: typings.awsSdk.clientsLookoutequipmentMod.LabelId
}
object DeleteLabelRequest {
  
  inline def apply(LabelGroupName: LabelGroupName, LabelId: LabelId): DeleteLabelRequest = {
    val __obj = js.Dynamic.literal(LabelGroupName = LabelGroupName.asInstanceOf[js.Any], LabelId = LabelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLabelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLabelRequest] (val x: Self) extends AnyVal {
    
    inline def setLabelGroupName(value: LabelGroupName): Self = StObject.set(x, "LabelGroupName", value.asInstanceOf[js.Any])
    
    inline def setLabelId(value: LabelId): Self = StObject.set(x, "LabelId", value.asInstanceOf[js.Any])
  }
}
