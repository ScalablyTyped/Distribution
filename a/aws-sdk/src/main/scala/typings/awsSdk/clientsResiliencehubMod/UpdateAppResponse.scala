package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppResponse extends StObject {
  
  /**
    * The specified application, returned as an object with details including compliance status, creation time, description, resiliency score, and more.
    */
  var app: App
}
object UpdateAppResponse {
  
  inline def apply(app: App): UpdateAppResponse = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppResponse]
  }
  
  extension [Self <: UpdateAppResponse](x: Self) {
    
    inline def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
  }
}
