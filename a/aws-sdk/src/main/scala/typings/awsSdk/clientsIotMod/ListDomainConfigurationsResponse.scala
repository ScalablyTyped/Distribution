package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainConfigurationsResponse extends StObject {
  
  /**
    * A list of objects that contain summary information about the user's domain configurations.
    */
  var domainConfigurations: js.UndefOr[DomainConfigurations] = js.undefined
  
  /**
    * The marker for the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.undefined
}
object ListDomainConfigurationsResponse {
  
  inline def apply(): ListDomainConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainConfigurationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDomainConfigurationsResponse] (val x: Self) extends AnyVal {
    
    inline def setDomainConfigurations(value: DomainConfigurations): Self = StObject.set(x, "domainConfigurations", value.asInstanceOf[js.Any])
    
    inline def setDomainConfigurationsUndefined: Self = StObject.set(x, "domainConfigurations", js.undefined)
    
    inline def setDomainConfigurationsVarargs(value: DomainConfigurationSummary*): Self = StObject.set(x, "domainConfigurations", js.Array(value*))
    
    inline def setNextMarker(value: Marker): Self = StObject.set(x, "nextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "nextMarker", js.undefined)
  }
}
