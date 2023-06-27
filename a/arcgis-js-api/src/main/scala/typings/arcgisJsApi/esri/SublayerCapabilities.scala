package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SublayerCapabilities extends StObject {
  
  /**
  		 * Describes characteristics of the data in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#capabilities)
  		 */
  var data: SublayerCapabilitiesData
  
  /**
  		 * Describes operations that can be performed on features in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#capabilities)
  		 */
  var operations: SublayerCapabilitiesOperations
}
object SublayerCapabilities {
  
  inline def apply(data: SublayerCapabilitiesData, operations: SublayerCapabilitiesOperations): SublayerCapabilities = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SublayerCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SublayerCapabilities] (val x: Self) extends AnyVal {
    
    inline def setData(value: SublayerCapabilitiesData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: SublayerCapabilitiesOperations): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
  }
}
