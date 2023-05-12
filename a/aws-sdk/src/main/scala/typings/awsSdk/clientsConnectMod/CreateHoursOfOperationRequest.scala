package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHoursOfOperationRequest extends StObject {
  
  /**
    * Configuration information for the hours of operation: day, start time, and end time.
    */
  var Config: HoursOfOperationConfigList
  
  /**
    * The description of the hours of operation.
    */
  var Description: js.UndefOr[HoursOfOperationDescription] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The name of the hours of operation.
    */
  var Name: CommonNameLength127
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The time zone of the hours of operation.
    */
  var TimeZone: typings.awsSdk.clientsConnectMod.TimeZone
}
object CreateHoursOfOperationRequest {
  
  inline def apply(
    Config: HoursOfOperationConfigList,
    InstanceId: InstanceId,
    Name: CommonNameLength127,
    TimeZone: TimeZone
  ): CreateHoursOfOperationRequest = {
    val __obj = js.Dynamic.literal(Config = Config.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TimeZone = TimeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHoursOfOperationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateHoursOfOperationRequest] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: HoursOfOperationConfigList): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
    
    inline def setConfigVarargs(value: HoursOfOperationConfig*): Self = StObject.set(x, "Config", js.Array(value*))
    
    inline def setDescription(value: HoursOfOperationDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: CommonNameLength127): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTimeZone(value: TimeZone): Self = StObject.set(x, "TimeZone", value.asInstanceOf[js.Any])
  }
}
