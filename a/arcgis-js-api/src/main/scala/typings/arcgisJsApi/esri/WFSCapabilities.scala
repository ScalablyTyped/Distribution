package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WFSCapabilities
  extends StObject
     with Object {
  
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
  
  inline def apply(
    constructor: js.Function,
    featureTypes: js.Array[WFSFeatureType],
    hasOwnProperty: PropertyKey => Boolean,
    operations: WFSOperations,
    propertyIsEnumerable: PropertyKey => Boolean
  ): WFSCapabilities = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], featureTypes = featureTypes.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), operations = operations.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[WFSCapabilities]
  }
  
  extension [Self <: WFSCapabilities](x: Self) {
    
    inline def setFeatureTypes(value: js.Array[WFSFeatureType]): Self = StObject.set(x, "featureTypes", value.asInstanceOf[js.Any])
    
    inline def setFeatureTypesVarargs(value: WFSFeatureType*): Self = StObject.set(x, "featureTypes", js.Array(value*))
    
    inline def setOperations(value: WFSOperations): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
  }
}
