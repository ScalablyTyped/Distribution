package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSessionResponse extends StObject {
  
  /**
    * Returns the session object in the response.
    */
  var Session: js.UndefOr[typings.awsSdk.clientsGlueMod.Session] = js.undefined
}
object CreateSessionResponse {
  
  inline def apply(): CreateSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSessionResponse]
  }
  
  extension [Self <: CreateSessionResponse](x: Self) {
    
    inline def setSession(value: Session): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "Session", js.undefined)
  }
}
