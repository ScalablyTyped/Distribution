package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.bidirectional
import typings.arcgisJsApi.arcgisJsApiStrings.directional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminalConfigurationProperties extends StObject {
  
  /**
  		 * The default terminal configuration path defined.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TerminalConfiguration.html#defaultConfiguration)
  		 */
  var defaultConfiguration: js.UndefOr[String] = js.undefined
  
  /**
  		 * A unique numeric identifer of the terminal configuration.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TerminalConfiguration.html#id)
  		 */
  var id: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The name of the terminal configuration.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TerminalConfiguration.html#name)
  		 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  		 * An array of [terminals](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-Terminal.html) defined in this configuration.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TerminalConfiguration.html#terminals)
  		 */
  var terminals: js.UndefOr[js.Array[TerminalProperties]] = js.undefined
  
  /**
  		 * Terminal configurations can be defined as directional or bidirectional.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TerminalConfiguration.html#traversabilityModel)
  		 */
  var traversabilityModel: js.UndefOr[directional | bidirectional] = js.undefined
}
object TerminalConfigurationProperties {
  
  inline def apply(): TerminalConfigurationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminalConfigurationProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TerminalConfigurationProperties] (val x: Self) extends AnyVal {
    
    inline def setDefaultConfiguration(value: String): Self = StObject.set(x, "defaultConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDefaultConfigurationUndefined: Self = StObject.set(x, "defaultConfiguration", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTerminals(value: js.Array[TerminalProperties]): Self = StObject.set(x, "terminals", value.asInstanceOf[js.Any])
    
    inline def setTerminalsUndefined: Self = StObject.set(x, "terminals", js.undefined)
    
    inline def setTerminalsVarargs(value: TerminalProperties*): Self = StObject.set(x, "terminals", js.Array(value*))
    
    inline def setTraversabilityModel(value: directional | bidirectional): Self = StObject.set(x, "traversabilityModel", value.asInstanceOf[js.Any])
    
    inline def setTraversabilityModelUndefined: Self = StObject.set(x, "traversabilityModel", js.undefined)
  }
}
