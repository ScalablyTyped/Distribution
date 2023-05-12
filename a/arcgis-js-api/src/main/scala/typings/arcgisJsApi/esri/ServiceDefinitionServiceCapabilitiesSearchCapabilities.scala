package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.esriTypeBoth
import typings.arcgisJsApi.arcgisJsApiStrings.esriTypeEntity
import typings.arcgisJsApi.arcgisJsApiStrings.esriTypeRelationship
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceDefinitionServiceCapabilitiesSearchCapabilities extends StObject {
  
  /**
    * Specifies if search strings can contain a leading wildcard operator (`*`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#serviceCapabilities)
    */
  var allowLeadingWildcardQueries: Boolean
  
  /**
    * The search category filters supported by this service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#serviceCapabilities)
    */
  var searchTypeFilterCapabilities: esriTypeEntity | esriTypeRelationship | esriTypeBoth
}
object ServiceDefinitionServiceCapabilitiesSearchCapabilities {
  
  inline def apply(
    allowLeadingWildcardQueries: Boolean,
    searchTypeFilterCapabilities: esriTypeEntity | esriTypeRelationship | esriTypeBoth
  ): ServiceDefinitionServiceCapabilitiesSearchCapabilities = {
    val __obj = js.Dynamic.literal(allowLeadingWildcardQueries = allowLeadingWildcardQueries.asInstanceOf[js.Any], searchTypeFilterCapabilities = searchTypeFilterCapabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDefinitionServiceCapabilitiesSearchCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceDefinitionServiceCapabilitiesSearchCapabilities] (val x: Self) extends AnyVal {
    
    inline def setAllowLeadingWildcardQueries(value: Boolean): Self = StObject.set(x, "allowLeadingWildcardQueries", value.asInstanceOf[js.Any])
    
    inline def setSearchTypeFilterCapabilities(value: esriTypeEntity | esriTypeRelationship | esriTypeBoth): Self = StObject.set(x, "searchTypeFilterCapabilities", value.asInstanceOf[js.Any])
  }
}
