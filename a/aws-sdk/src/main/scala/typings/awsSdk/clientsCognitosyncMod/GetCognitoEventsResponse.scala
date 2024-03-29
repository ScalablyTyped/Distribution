package typings.awsSdk.clientsCognitosyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCognitoEventsResponse extends StObject {
  
  /**
    * The Cognito Events returned from the GetCognitoEvents request
    */
  var Events: js.UndefOr[typings.awsSdk.clientsCognitosyncMod.Events] = js.undefined
}
object GetCognitoEventsResponse {
  
  inline def apply(): GetCognitoEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCognitoEventsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCognitoEventsResponse] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: Events): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
  }
}
