package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReusableDelegationSetRequest extends StObject {
  
  /**
    * A unique string that identifies the request, and that allows you to retry failed CreateReusableDelegationSet requests without the risk of executing the operation twice. You must use a unique CallerReference string every time you submit a CreateReusableDelegationSet request. CallerReference can be any unique string, for example a date/time stamp.
    */
  var CallerReference: Nonce
  
  /**
    * If you want to mark the delegation set for an existing hosted zone as reusable, the ID for that hosted zone.
    */
  var HostedZoneId: js.UndefOr[ResourceId] = js.undefined
}
object CreateReusableDelegationSetRequest {
  
  inline def apply(CallerReference: Nonce): CreateReusableDelegationSetRequest = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReusableDelegationSetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateReusableDelegationSetRequest] (val x: Self) extends AnyVal {
    
    inline def setCallerReference(value: Nonce): Self = StObject.set(x, "CallerReference", value.asInstanceOf[js.Any])
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setHostedZoneIdUndefined: Self = StObject.set(x, "HostedZoneId", js.undefined)
  }
}
