package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateHubResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the updated hub.
    */
  var HubArn: typings.awsSdk.clientsSagemakerMod.HubArn
}
object UpdateHubResponse {
  
  inline def apply(HubArn: HubArn): UpdateHubResponse = {
    val __obj = js.Dynamic.literal(HubArn = HubArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHubResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateHubResponse] (val x: Self) extends AnyVal {
    
    inline def setHubArn(value: HubArn): Self = StObject.set(x, "HubArn", value.asInstanceOf[js.Any])
  }
}
