package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLabelGroupResponse extends StObject {
  
  /**
    *  The time at which the label group was created. 
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Codes indicating the type of anomaly associated with the labels in the lagbel group. 
    */
  var FaultCodes: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.FaultCodes] = js.undefined
  
  /**
    *  The ARN of the label group. 
    */
  var LabelGroupArn: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.LabelGroupArn] = js.undefined
  
  /**
    *  The name of the label group. 
    */
  var LabelGroupName: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.LabelGroupName] = js.undefined
  
  /**
    *  The time at which the label group was updated. 
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object DescribeLabelGroupResponse {
  
  inline def apply(): DescribeLabelGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLabelGroupResponse]
  }
  
  extension [Self <: DescribeLabelGroupResponse](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setFaultCodes(value: FaultCodes): Self = StObject.set(x, "FaultCodes", value.asInstanceOf[js.Any])
    
    inline def setFaultCodesUndefined: Self = StObject.set(x, "FaultCodes", js.undefined)
    
    inline def setFaultCodesVarargs(value: FaultCode*): Self = StObject.set(x, "FaultCodes", js.Array(value*))
    
    inline def setLabelGroupArn(value: LabelGroupArn): Self = StObject.set(x, "LabelGroupArn", value.asInstanceOf[js.Any])
    
    inline def setLabelGroupArnUndefined: Self = StObject.set(x, "LabelGroupArn", js.undefined)
    
    inline def setLabelGroupName(value: LabelGroupName): Self = StObject.set(x, "LabelGroupName", value.asInstanceOf[js.Any])
    
    inline def setLabelGroupNameUndefined: Self = StObject.set(x, "LabelGroupName", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
