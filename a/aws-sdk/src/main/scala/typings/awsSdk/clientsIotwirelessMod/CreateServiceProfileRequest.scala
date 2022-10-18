package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceProfileRequest extends StObject {
  
  /**
    * Each resource must have a unique client request token. If you try to create a new resource with the same token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate a unique client request. 
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.ClientRequestToken] = js.undefined
  
  /**
    * The service profile information to use to create the service profile.
    */
  var LoRaWAN: js.UndefOr[LoRaWANServiceProfile] = js.undefined
  
  /**
    * The name of the new resource.
    */
  var Name: js.UndefOr[ServiceProfileName] = js.undefined
  
  /**
    * The tags to attach to the new service profile. Tags are metadata that you can use to manage a resource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateServiceProfileRequest {
  
  inline def apply(): CreateServiceProfileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceProfileRequest]
  }
  
  extension [Self <: CreateServiceProfileRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setLoRaWAN(value: LoRaWANServiceProfile): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
    
    inline def setName(value: ServiceProfileName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
