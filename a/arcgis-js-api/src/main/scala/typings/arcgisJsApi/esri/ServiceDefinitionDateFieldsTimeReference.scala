package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceDefinitionDateFieldsTimeReference extends StObject {
  
  /**
    * Indicates if datetime fields respects daylight savings.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#dateFieldsTimeReference)
    */
  var respectsDaylightSaving: Boolean
  
  /**
    * the timezone for all datetime fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#dateFieldsTimeReference)
    */
  var timeZone: String
}
object ServiceDefinitionDateFieldsTimeReference {
  
  inline def apply(respectsDaylightSaving: Boolean, timeZone: String): ServiceDefinitionDateFieldsTimeReference = {
    val __obj = js.Dynamic.literal(respectsDaylightSaving = respectsDaylightSaving.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDefinitionDateFieldsTimeReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceDefinitionDateFieldsTimeReference] (val x: Self) extends AnyVal {
    
    inline def setRespectsDaylightSaving(value: Boolean): Self = StObject.set(x, "respectsDaylightSaving", value.asInstanceOf[js.Any])
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
  }
}
