package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssociatedResourceResponse extends StObject {
  
  /**
    * The resource associated with the application.
    */
  var resource: js.UndefOr[Resource] = js.undefined
}
object GetAssociatedResourceResponse {
  
  inline def apply(): GetAssociatedResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssociatedResourceResponse]
  }
  
  extension [Self <: GetAssociatedResourceResponse](x: Self) {
    
    inline def setResource(value: Resource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
