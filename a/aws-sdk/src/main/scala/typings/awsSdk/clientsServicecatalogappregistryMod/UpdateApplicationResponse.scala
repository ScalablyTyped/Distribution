package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationResponse extends StObject {
  
  /**
    * The updated information of the application.
    */
  var application: js.UndefOr[Application] = js.undefined
}
object UpdateApplicationResponse {
  
  inline def apply(): UpdateApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateApplicationResponse]
  }
  
  extension [Self <: UpdateApplicationResponse](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
  }
}
