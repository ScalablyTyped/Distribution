package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateHubResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the hub.
    */
  var HubArn: typings.awsSdk.clientsSagemakerMod.HubArn
}
object CreateHubResponse {
  
  inline def apply(HubArn: HubArn): CreateHubResponse = {
    val __obj = js.Dynamic.literal(HubArn = HubArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHubResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateHubResponse] (val x: Self) extends AnyVal {
    
    inline def setHubArn(value: HubArn): Self = StObject.set(x, "HubArn", value.asInstanceOf[js.Any])
  }
}
