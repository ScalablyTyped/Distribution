package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLabelResponse extends StObject {
  
  /**
    *  The time at which the label was created. 
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The end time of the requested label. 
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Indicates that a label pertains to a particular piece of equipment. 
    */
  var Equipment: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.Equipment] = js.undefined
  
  /**
    *  Indicates the type of anomaly associated with the label.  Data in this field will be retained for service usage. Follow best practices for the security of your data.
    */
  var FaultCode: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.FaultCode] = js.undefined
  
  /**
    *  The ARN of the requested label group. 
    */
  var LabelGroupArn: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.LabelGroupArn] = js.undefined
  
  /**
    *  The name of the requested label group. 
    */
  var LabelGroupName: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.LabelGroupName] = js.undefined
  
  /**
    *  The ID of the requested label. 
    */
  var LabelId: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.LabelId] = js.undefined
  
  /**
    * Metadata providing additional information about the label. Data in this field will be retained for service usage. Follow best practices for the security of your data.
    */
  var Notes: js.UndefOr[Comments] = js.undefined
  
  /**
    *  Indicates whether a labeled event represents an anomaly. 
    */
  var Rating: js.UndefOr[LabelRating] = js.undefined
  
  /**
    *  The start time of the requested label. 
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
}
object DescribeLabelResponse {
  
  inline def apply(): DescribeLabelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLabelResponse]
  }
  
  extension [Self <: DescribeLabelResponse](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setEquipment(value: Equipment): Self = StObject.set(x, "Equipment", value.asInstanceOf[js.Any])
    
    inline def setEquipmentUndefined: Self = StObject.set(x, "Equipment", js.undefined)
    
    inline def setFaultCode(value: FaultCode): Self = StObject.set(x, "FaultCode", value.asInstanceOf[js.Any])
    
    inline def setFaultCodeUndefined: Self = StObject.set(x, "FaultCode", js.undefined)
    
    inline def setLabelGroupArn(value: LabelGroupArn): Self = StObject.set(x, "LabelGroupArn", value.asInstanceOf[js.Any])
    
    inline def setLabelGroupArnUndefined: Self = StObject.set(x, "LabelGroupArn", js.undefined)
    
    inline def setLabelGroupName(value: LabelGroupName): Self = StObject.set(x, "LabelGroupName", value.asInstanceOf[js.Any])
    
    inline def setLabelGroupNameUndefined: Self = StObject.set(x, "LabelGroupName", js.undefined)
    
    inline def setLabelId(value: LabelId): Self = StObject.set(x, "LabelId", value.asInstanceOf[js.Any])
    
    inline def setLabelIdUndefined: Self = StObject.set(x, "LabelId", js.undefined)
    
    inline def setNotes(value: Comments): Self = StObject.set(x, "Notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "Notes", js.undefined)
    
    inline def setRating(value: LabelRating): Self = StObject.set(x, "Rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "Rating", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
