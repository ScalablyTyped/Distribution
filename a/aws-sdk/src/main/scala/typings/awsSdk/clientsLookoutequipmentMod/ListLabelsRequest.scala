package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLabelsRequest extends StObject {
  
  /**
    *  Lists the labels that pertain to a particular piece of equipment. 
    */
  var Equipment: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.Equipment] = js.undefined
  
  /**
    *  Returns labels with a particular fault code. 
    */
  var FaultCode: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.FaultCode] = js.undefined
  
  /**
    *  Returns all labels with a start time earlier than the end time given. 
    */
  var IntervalEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Returns all the labels with a end time equal to or later than the start time given. 
    */
  var IntervalStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Retruns the name of the label group. 
    */
  var LabelGroupName: typings.awsSdk.clientsLookoutequipmentMod.LabelGroupName
  
  /**
    *  Specifies the maximum number of labels to list. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.MaxResults] = js.undefined
  
  /**
    *  An opaque pagination token indicating where to continue the listing of label groups. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.NextToken] = js.undefined
}
object ListLabelsRequest {
  
  inline def apply(LabelGroupName: LabelGroupName): ListLabelsRequest = {
    val __obj = js.Dynamic.literal(LabelGroupName = LabelGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLabelsRequest]
  }
  
  extension [Self <: ListLabelsRequest](x: Self) {
    
    inline def setEquipment(value: Equipment): Self = StObject.set(x, "Equipment", value.asInstanceOf[js.Any])
    
    inline def setEquipmentUndefined: Self = StObject.set(x, "Equipment", js.undefined)
    
    inline def setFaultCode(value: FaultCode): Self = StObject.set(x, "FaultCode", value.asInstanceOf[js.Any])
    
    inline def setFaultCodeUndefined: Self = StObject.set(x, "FaultCode", js.undefined)
    
    inline def setIntervalEndTime(value: js.Date): Self = StObject.set(x, "IntervalEndTime", value.asInstanceOf[js.Any])
    
    inline def setIntervalEndTimeUndefined: Self = StObject.set(x, "IntervalEndTime", js.undefined)
    
    inline def setIntervalStartTime(value: js.Date): Self = StObject.set(x, "IntervalStartTime", value.asInstanceOf[js.Any])
    
    inline def setIntervalStartTimeUndefined: Self = StObject.set(x, "IntervalStartTime", js.undefined)
    
    inline def setLabelGroupName(value: LabelGroupName): Self = StObject.set(x, "LabelGroupName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
