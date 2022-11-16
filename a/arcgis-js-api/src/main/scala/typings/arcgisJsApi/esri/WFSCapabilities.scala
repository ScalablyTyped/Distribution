package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WFSCapabilities extends StObject {
  
  /**
    * An array of featureTypes (or layers) available in the WFS service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSCapabilities)
    */
  var featureTypes: js.Array[WFSFeatureType]
  
  /**
    * Information about the operations needed to consume the WFS service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#WFSCapabilities)
    */
  var operations: WFSOperations
}
object WFSCapabilities {
  
  inline def apply(featureTypes: js.Array[WFSFeatureType], operations: WFSOperations): WFSCapabilities = {
    val __obj = js.Dynamic.literal(featureTypes = featureTypes.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[WFSCapabilities]
  }
  
  extension [Self <: WFSCapabilities](x: Self) {
    
    inline def setFeatureTypes(value: js.Array[WFSFeatureType]): Self = StObject.set(x, "featureTypes", value.asInstanceOf[js.Any])
    
    inline def setFeatureTypesVarargs(value: WFSFeatureType*): Self = StObject.set(x, "featureTypes", js.Array(value*))
    
    inline def setOperations(value: WFSOperations): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
  }
}
