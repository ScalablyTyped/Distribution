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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPMessageProperties extends StObject {
  
  /**
    * The geoprocessing message.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GPMessage.html#description)
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The geoprocessing message type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GPMessage.html#type)
    */
  var `type`: js.UndefOr[
    informative | `process-definition` | `process-start` | `process-stop` | warning | error | empty | abort
  ] = js.native
}
object GPMessageProperties {
  
  @scala.inline
  def apply(): GPMessageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPMessageProperties]
  }
  
  @scala.inline
  implicit class GPMessagePropertiesMutableBuilder[Self <: GPMessageProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setType(
      value: informative | `process-definition` | `process-start` | `process-stop` | warning | error | empty | abort
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
