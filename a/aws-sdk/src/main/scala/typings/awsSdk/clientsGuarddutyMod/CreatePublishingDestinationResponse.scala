package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePublishingDestinationResponse extends StObject {
  
  /**
    * The ID of the publishing destination that is created.
    */
  var DestinationId: String
}
object CreatePublishingDestinationResponse {
  
  inline def apply(DestinationId: String): CreatePublishingDestinationResponse = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePublishingDestinationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePublishingDestinationResponse] (val x: Self) extends AnyVal {
    
    inline def setDestinationId(value: String): Self = StObject.set(x, "DestinationId", value.asInstanceOf[js.Any])
  }
}
