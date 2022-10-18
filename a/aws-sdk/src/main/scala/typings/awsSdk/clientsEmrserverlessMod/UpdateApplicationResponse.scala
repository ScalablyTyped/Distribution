package typings.awsSdk.clientsEmrserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationResponse extends StObject {
  
  /**
    * Information about the updated application.
    */
  var application: Application
}
object UpdateApplicationResponse {
  
  inline def apply(application: Application): UpdateApplicationResponse = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationResponse]
  }
  
  extension [Self <: UpdateApplicationResponse](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
  }
}
