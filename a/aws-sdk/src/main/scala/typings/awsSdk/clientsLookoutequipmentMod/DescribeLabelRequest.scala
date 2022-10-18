package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLabelRequest extends StObject {
  
  /**
    *  Returns the name of the group containing the label. 
    */
  var LabelGroupName: typings.awsSdk.clientsLookoutequipmentMod.LabelGroupName
  
  /**
    *  Returns the ID of the label. 
    */
  var LabelId: typings.awsSdk.clientsLookoutequipmentMod.LabelId
}
object DescribeLabelRequest {
  
  inline def apply(LabelGroupName: LabelGroupName, LabelId: LabelId): DescribeLabelRequest = {
    val __obj = js.Dynamic.literal(LabelGroupName = LabelGroupName.asInstanceOf[js.Any], LabelId = LabelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLabelRequest]
  }
  
  extension [Self <: DescribeLabelRequest](x: Self) {
    
    inline def setLabelGroupName(value: LabelGroupName): Self = StObject.set(x, "LabelGroupName", value.asInstanceOf[js.Any])
    
    inline def setLabelId(value: LabelId): Self = StObject.set(x, "LabelId", value.asInstanceOf[js.Any])
  }
}
