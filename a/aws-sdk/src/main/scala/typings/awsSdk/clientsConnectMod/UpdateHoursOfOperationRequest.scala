package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateHoursOfOperationRequest extends StObject {
  
  /**
    * Configuration information of the hours of operation.
    */
  var Config: js.UndefOr[HoursOfOperationConfigList] = js.undefined
  
  /**
    * The description of the hours of operation.
    */
  var Description: js.UndefOr[UpdateHoursOfOperationDescription] = js.undefined
  
  /**
    * The identifier of the hours of operation.
    */
  var HoursOfOperationId: typings.awsSdk.clientsConnectMod.HoursOfOperationId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The name of the hours of operation.
    */
  var Name: js.UndefOr[CommonNameLength127] = js.undefined
  
  /**
    * The time zone of the hours of operation.
    */
  var TimeZone: js.UndefOr[typings.awsSdk.clientsConnectMod.TimeZone] = js.undefined
}
object UpdateHoursOfOperationRequest {
  
  inline def apply(HoursOfOperationId: HoursOfOperationId, InstanceId: InstanceId): UpdateHoursOfOperationRequest = {
    val __obj = js.Dynamic.literal(HoursOfOperationId = HoursOfOperationId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHoursOfOperationRequest]
  }
  
  extension [Self <: UpdateHoursOfOperationRequest](x: Self) {
    
    inline def setConfig(value: HoursOfOperationConfigList): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "Config", js.undefined)
    
    inline def setConfigVarargs(value: HoursOfOperationConfig*): Self = StObject.set(x, "Config", js.Array(value*))
    
    inline def setDescription(value: UpdateHoursOfOperationDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setHoursOfOperationId(value: HoursOfOperationId): Self = StObject.set(x, "HoursOfOperationId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: CommonNameLength127): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTimeZone(value: TimeZone): Self = StObject.set(x, "TimeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "TimeZone", js.undefined)
  }
}
