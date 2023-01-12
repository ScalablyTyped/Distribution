package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLabelRequest extends StObject {
  
  /**
    *  A unique identifier for the request to create a label. If you do not set the client request token, Lookout for Equipment generates one. 
    */
  var ClientToken: IdempotenceToken
  
  /**
    *  The end time of the labeled event. 
    */
  var EndTime: js.Date
  
  /**
    *  Indicates that a label pertains to a particular piece of equipment.  Data in this field will be retained for service usage. Follow best practices for the security of your data.
    */
  var Equipment: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.Equipment] = js.undefined
  
  /**
    *  Provides additional information about the label. The fault code must be defined in the FaultCodes attribute of the label group. Data in this field will be retained for service usage. Follow best practices for the security of your data. 
    */
  var FaultCode: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.FaultCode] = js.undefined
  
  /**
    *  The name of a group of labels.  Data in this field will be retained for service usage. Follow best practices for the security of your data. 
    */
  var LabelGroupName: typings.awsSdk.clientsLookoutequipmentMod.LabelGroupName
  
  /**
    *  Metadata providing additional information about the label.  Data in this field will be retained for service usage. Follow best practices for the security of your data.
    */
  var Notes: js.UndefOr[Comments] = js.undefined
  
  /**
    *  Indicates whether a labeled event represents an anomaly. 
    */
  var Rating: LabelRating
  
  /**
    *  The start time of the labeled event. 
    */
  var StartTime: js.Date
}
object CreateLabelRequest {
  
  inline def apply(
    ClientToken: IdempotenceToken,
    EndTime: js.Date,
    LabelGroupName: LabelGroupName,
    Rating: LabelRating,
    StartTime: js.Date
  ): CreateLabelRequest = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], EndTime = EndTime.asInstanceOf[js.Any], LabelGroupName = LabelGroupName.asInstanceOf[js.Any], Rating = Rating.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLabelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLabelRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: IdempotenceToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEquipment(value: Equipment): Self = StObject.set(x, "Equipment", value.asInstanceOf[js.Any])
    
    inline def setEquipmentUndefined: Self = StObject.set(x, "Equipment", js.undefined)
    
    inline def setFaultCode(value: FaultCode): Self = StObject.set(x, "FaultCode", value.asInstanceOf[js.Any])
    
    inline def setFaultCodeUndefined: Self = StObject.set(x, "FaultCode", js.undefined)
    
    inline def setLabelGroupName(value: LabelGroupName): Self = StObject.set(x, "LabelGroupName", value.asInstanceOf[js.Any])
    
    inline def setNotes(value: Comments): Self = StObject.set(x, "Notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "Notes", js.undefined)
    
    inline def setRating(value: LabelRating): Self = StObject.set(x, "Rating", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
  }
}
