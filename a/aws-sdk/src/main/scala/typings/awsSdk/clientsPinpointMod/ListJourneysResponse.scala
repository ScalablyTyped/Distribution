package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJourneysResponse extends StObject {
  
  var JourneysResponse: typings.awsSdk.clientsPinpointMod.JourneysResponse
}
object ListJourneysResponse {
  
  inline def apply(JourneysResponse: JourneysResponse): ListJourneysResponse = {
    val __obj = js.Dynamic.literal(JourneysResponse = JourneysResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJourneysResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListJourneysResponse] (val x: Self) extends AnyVal {
    
    inline def setJourneysResponse(value: JourneysResponse): Self = StObject.set(x, "JourneysResponse", value.asInstanceOf[js.Any])
  }
}
