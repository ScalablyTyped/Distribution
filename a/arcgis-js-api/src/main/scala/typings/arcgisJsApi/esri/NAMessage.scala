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

@js.native
trait NAMessage
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * A description of the network analyst message.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-NAMessage.html#description)
  		 */
  var description: String = js.native
  
  /**
  		 * The network analyst message type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-NAMessage.html#type)
  		 */
  var `type`: informative | `process-definition` | `process-start` | `process-stop` | warning | error | empty | abort = js.native
}
