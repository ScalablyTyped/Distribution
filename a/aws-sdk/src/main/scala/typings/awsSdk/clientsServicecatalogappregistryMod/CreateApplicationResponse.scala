package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationResponse extends StObject {
  
  /**
    * Information about the application.
    */
  var application: js.UndefOr[Application] = js.undefined
}
object CreateApplicationResponse {
  
  inline def apply(): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApplicationResponse]
  }
  
  extension [Self <: CreateApplicationResponse](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
  }
}
