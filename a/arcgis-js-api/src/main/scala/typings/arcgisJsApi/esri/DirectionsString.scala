package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`alt-name`
import typings.arcgisJsApi.arcgisJsApiStrings.`cross-street`
import typings.arcgisJsApi.arcgisJsApiStrings.`cumulative-length`
import typings.arcgisJsApi.arcgisJsApiStrings.`estimated-arrival-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`service-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`street-name`
import typings.arcgisJsApi.arcgisJsApiStrings.`time-window`
import typings.arcgisJsApi.arcgisJsApiStrings.`violation-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`wait-time`
import typings.arcgisJsApi.arcgisJsApiStrings.arrive
import typings.arcgisJsApi.arcgisJsApiStrings.branch
import typings.arcgisJsApi.arcgisJsApiStrings.depart
import typings.arcgisJsApi.arcgisJsApiStrings.exit
import typings.arcgisJsApi.arcgisJsApiStrings.general
import typings.arcgisJsApi.arcgisJsApiStrings.length
import typings.arcgisJsApi.arcgisJsApiStrings.summary
import typings.arcgisJsApi.arcgisJsApiStrings.time
import typings.arcgisJsApi.arcgisJsApiStrings.toward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsString extends StObject {
  
  /**
    * The direction text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeatureSet.html#DirectionsString)
    */
  var text: String
  
  /**
    * The type of event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionsFeatureSet.html#DirectionsString)
    */
  var `type`: `alt-name` | arrive | branch | `cross-street` | `cumulative-length` | depart | `estimated-arrival-time` | exit | general | length | `service-time` | `street-name` | summary | time | `time-window` | toward | `violation-time` | `wait-time`
}
object DirectionsString {
  
  inline def apply(
    text: String,
    `type`: `alt-name` | arrive | branch | `cross-street` | `cumulative-length` | depart | `estimated-arrival-time` | exit | general | length | `service-time` | `street-name` | summary | time | `time-window` | toward | `violation-time` | `wait-time`
  ): DirectionsString = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsString]
  }
  
  extension [Self <: DirectionsString](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(
      value: `alt-name` | arrive | branch | `cross-street` | `cumulative-length` | depart | `estimated-arrival-time` | exit | general | length | `service-time` | `street-name` | summary | time | `time-window` | toward | `violation-time` | `wait-time`
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
