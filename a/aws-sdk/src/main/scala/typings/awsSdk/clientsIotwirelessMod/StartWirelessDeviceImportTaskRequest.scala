package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartWirelessDeviceImportTaskRequest extends StObject {
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.ClientRequestToken] = js.undefined
  
  /**
    * The name of the Sidewalk destination that describes the IoT rule to route messages from the devices in the import task that are onboarded to AWS IoT Wireless.
    */
  var DestinationName: typings.awsSdk.clientsIotwirelessMod.DestinationName
  
  /**
    * The Sidewalk-related parameters for importing wireless devices that need to be provisioned in bulk.
    */
  var Sidewalk: SidewalkStartImportInfo
  
  var Tags: js.UndefOr[TagList] = js.undefined
}
object StartWirelessDeviceImportTaskRequest {
  
  inline def apply(DestinationName: DestinationName, Sidewalk: SidewalkStartImportInfo): StartWirelessDeviceImportTaskRequest = {
    val __obj = js.Dynamic.literal(DestinationName = DestinationName.asInstanceOf[js.Any], Sidewalk = Sidewalk.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartWirelessDeviceImportTaskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartWirelessDeviceImportTaskRequest] (val x: Self) extends AnyVal {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDestinationName(value: DestinationName): Self = StObject.set(x, "DestinationName", value.asInstanceOf[js.Any])
    
    inline def setSidewalk(value: SidewalkStartImportInfo): Self = StObject.set(x, "Sidewalk", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
