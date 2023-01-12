package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelledSpotInstanceRequest extends StObject {
  
  /**
    * The ID of the Spot Instance request.
    */
  var SpotInstanceRequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the Spot Instance request.
    */
  var State: js.UndefOr[CancelSpotInstanceRequestState] = js.undefined
}
object CancelledSpotInstanceRequest {
  
  inline def apply(): CancelledSpotInstanceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelledSpotInstanceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelledSpotInstanceRequest] (val x: Self) extends AnyVal {
    
    inline def setSpotInstanceRequestId(value: String): Self = StObject.set(x, "SpotInstanceRequestId", value.asInstanceOf[js.Any])
    
    inline def setSpotInstanceRequestIdUndefined: Self = StObject.set(x, "SpotInstanceRequestId", js.undefined)
    
    inline def setState(value: CancelSpotInstanceRequestState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
