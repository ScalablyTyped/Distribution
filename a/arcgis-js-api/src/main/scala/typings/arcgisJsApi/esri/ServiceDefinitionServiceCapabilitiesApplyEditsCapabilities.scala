package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceDefinitionServiceCapabilitiesApplyEditsCapabilities extends StObject {
  
  /**
  		 * If `true`, when an apply edits operation fails, the data will revert to it's state before the change.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#serviceCapabilities)
  		 */
  var graphDefaultRollbackOnFailure: Boolean
}
object ServiceDefinitionServiceCapabilitiesApplyEditsCapabilities {
  
  inline def apply(graphDefaultRollbackOnFailure: Boolean): ServiceDefinitionServiceCapabilitiesApplyEditsCapabilities = {
    val __obj = js.Dynamic.literal(graphDefaultRollbackOnFailure = graphDefaultRollbackOnFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDefinitionServiceCapabilitiesApplyEditsCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceDefinitionServiceCapabilitiesApplyEditsCapabilities] (val x: Self) extends AnyVal {
    
    inline def setGraphDefaultRollbackOnFailure(value: Boolean): Self = StObject.set(x, "graphDefaultRollbackOnFailure", value.asInstanceOf[js.Any])
  }
}
