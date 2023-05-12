package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRoutingProfileConcurrencyRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instance ID in the Amazon Resource Name (ARN) of the instance.
    */
  var InstanceId: typings.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The channels that agents can handle in the Contact Control Panel (CCP).
    */
  var MediaConcurrencies: typings.awsSdk.clientsConnectMod.MediaConcurrencies
  
  /**
    * The identifier of the routing profile.
    */
  var RoutingProfileId: typings.awsSdk.clientsConnectMod.RoutingProfileId
}
object UpdateRoutingProfileConcurrencyRequest {
  
  inline def apply(InstanceId: InstanceId, MediaConcurrencies: MediaConcurrencies, RoutingProfileId: RoutingProfileId): UpdateRoutingProfileConcurrencyRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], MediaConcurrencies = MediaConcurrencies.asInstanceOf[js.Any], RoutingProfileId = RoutingProfileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoutingProfileConcurrencyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRoutingProfileConcurrencyRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setMediaConcurrencies(value: MediaConcurrencies): Self = StObject.set(x, "MediaConcurrencies", value.asInstanceOf[js.Any])
    
    inline def setMediaConcurrenciesVarargs(value: MediaConcurrency*): Self = StObject.set(x, "MediaConcurrencies", js.Array(value*))
    
    inline def setRoutingProfileId(value: RoutingProfileId): Self = StObject.set(x, "RoutingProfileId", value.asInstanceOf[js.Any])
  }
}
