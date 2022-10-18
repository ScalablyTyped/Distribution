package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteApplicationResponse extends StObject {
  
  /**
    * Information about the deleted application.
    */
  var application: js.UndefOr[ApplicationSummary] = js.undefined
}
object DeleteApplicationResponse {
  
  inline def apply(): DeleteApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteApplicationResponse]
  }
  
  extension [Self <: DeleteApplicationResponse](x: Self) {
    
    inline def setApplication(value: ApplicationSummary): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    
    inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
  }
}
