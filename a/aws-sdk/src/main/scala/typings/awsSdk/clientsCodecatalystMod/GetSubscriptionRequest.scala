package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSubscriptionRequest extends StObject {
  
  /**
    * The name of the space.
    */
  var spaceName: NameString
}
object GetSubscriptionRequest {
  
  inline def apply(spaceName: NameString): GetSubscriptionRequest = {
    val __obj = js.Dynamic.literal(spaceName = spaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSubscriptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSubscriptionRequest] (val x: Self) extends AnyVal {
    
    inline def setSpaceName(value: NameString): Self = StObject.set(x, "spaceName", value.asInstanceOf[js.Any])
  }
}
