package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`process-definition`
import typings.arcgisJsApi.arcgisJsApiStrings.`process-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`process-stop`
import typings.arcgisJsApi.arcgisJsApiStrings.abort
import typings.arcgisJsApi.arcgisJsApiStrings.empty
import typings.arcgisJsApi.arcgisJsApiStrings.error
import typings.arcgisJsApi.arcgisJsApiStrings.informative
import typings.arcgisJsApi.arcgisJsApiStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPMessageProperties extends StObject {
  
  /**
    * The geoprocessing message.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GPMessage.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The geoprocessing message type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GPMessage.html#type)
    */
  var `type`: js.UndefOr[
    informative | `process-definition` | `process-start` | `process-stop` | warning | error | empty | abort
  ] = js.undefined
}
object GPMessageProperties {
  
  inline def apply(): GPMessageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPMessageProperties]
  }
  
  extension [Self <: GPMessageProperties](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setType(
      value: informative | `process-definition` | `process-start` | `process-stop` | warning | error | empty | abort
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
