package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoursOfOperation extends StObject {
  
  /**
    * Configuration information for the hours of operation.
    */
  var Config: js.UndefOr[HoursOfOperationConfigList] = js.undefined
  
  /**
    * The description for the hours of operation.
    */
  var Description: js.UndefOr[HoursOfOperationDescription] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the hours of operation.
    */
  var HoursOfOperationArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier for the hours of operation.
    */
  var HoursOfOperationId: js.UndefOr[typings.awsSdk.clientsConnectMod.HoursOfOperationId] = js.undefined
  
  /**
    * The name for the hours of operation.
    */
  var Name: js.UndefOr[CommonNameLength127] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The time zone for the hours of operation.
    */
  var TimeZone: js.UndefOr[typings.awsSdk.clientsConnectMod.TimeZone] = js.undefined
}
object HoursOfOperation {
  
  inline def apply(): HoursOfOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoursOfOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HoursOfOperation] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: HoursOfOperationConfigList): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "Config", js.undefined)
    
    inline def setConfigVarargs(value: HoursOfOperationConfig*): Self = StObject.set(x, "Config", js.Array(value*))
    
    inline def setDescription(value: HoursOfOperationDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setHoursOfOperationArn(value: ARN): Self = StObject.set(x, "HoursOfOperationArn", value.asInstanceOf[js.Any])
    
    inline def setHoursOfOperationArnUndefined: Self = StObject.set(x, "HoursOfOperationArn", js.undefined)
    
    inline def setHoursOfOperationId(value: HoursOfOperationId): Self = StObject.set(x, "HoursOfOperationId", value.asInstanceOf[js.Any])
    
    inline def setHoursOfOperationIdUndefined: Self = StObject.set(x, "HoursOfOperationId", js.undefined)
    
    inline def setName(value: CommonNameLength127): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTimeZone(value: TimeZone): Self = StObject.set(x, "TimeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "TimeZone", js.undefined)
  }
}
