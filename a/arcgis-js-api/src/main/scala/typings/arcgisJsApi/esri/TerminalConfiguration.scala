package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.bidirectional
import typings.arcgisJsApi.arcgisJsApiStrings.directional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminalConfiguration
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The default terminal configuration path defined.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TerminalConfiguration.html#defaultConfiguration)
  		 */
  var defaultConfiguration: String = js.native
  
  /**
  		 * A unique numeric identifer of the terminal configuration.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TerminalConfiguration.html#id)
  		 */
  var id: Double = js.native
  
  /**
  		 * The name of the terminal configuration.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TerminalConfiguration.html#name)
  		 */
  var name: String = js.native
  
  /**
  		 * An array of [terminals](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-Terminal.html) defined in this configuration.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TerminalConfiguration.html#terminals)
  		 */
  var terminals: js.Array[Terminal] = js.native
  
  /**
  		 * Terminal configurations can be defined as directional or bidirectional.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TerminalConfiguration.html#traversabilityModel)
  		 */
  var traversabilityModel: directional | bidirectional = js.native
}
