package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceActionDetail extends StObject {
  
  /**
    * A map that defines the self-service action.
    */
  var Definition: js.UndefOr[ServiceActionDefinitionMap] = js.undefined
  
  /**
    * Summary information about the self-service action.
    */
  var ServiceActionSummary: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.ServiceActionSummary] = js.undefined
}
object ServiceActionDetail {
  
  inline def apply(): ServiceActionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceActionDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceActionDetail] (val x: Self) extends AnyVal {
    
    inline def setDefinition(value: ServiceActionDefinitionMap): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
    
    inline def setServiceActionSummary(value: ServiceActionSummary): Self = StObject.set(x, "ServiceActionSummary", value.asInstanceOf[js.Any])
    
    inline def setServiceActionSummaryUndefined: Self = StObject.set(x, "ServiceActionSummary", js.undefined)
  }
}
