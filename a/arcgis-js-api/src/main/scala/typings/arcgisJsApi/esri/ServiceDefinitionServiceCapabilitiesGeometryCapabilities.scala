package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceDefinitionServiceCapabilitiesGeometryCapabilities extends StObject {
  
  /**
  		 * The maximum bounding rectangle size along the x-axis.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#serviceCapabilities)
  		 */
  var geometryMaxBoundingRectangleSizeX: Double
  
  /**
  		 * The maximum bounding rectangle size along the y-axis.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#serviceCapabilities)
  		 */
  var geometryMaxBoundingRectangleSizeY: Double
  
  /**
  		 * Specifies what geometry types are supported by the graph such as `Point`, `Multipoint`, `Polyline`, `Polygon`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#serviceCapabilities)
  		 */
  var supportedGeometryTypes: js.Array[String]
  
  /**
  		 * Specifies if the knowledge graph service supports m-values on geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#serviceCapabilities)
  		 */
  var supportsMValues: Double
  
  /**
  		 * Specifies if the knowledge graph service supports z-values on geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#serviceCapabilities)
  		 */
  var supportsZValues: Double
}
object ServiceDefinitionServiceCapabilitiesGeometryCapabilities {
  
  inline def apply(
    geometryMaxBoundingRectangleSizeX: Double,
    geometryMaxBoundingRectangleSizeY: Double,
    supportedGeometryTypes: js.Array[String],
    supportsMValues: Double,
    supportsZValues: Double
  ): ServiceDefinitionServiceCapabilitiesGeometryCapabilities = {
    val __obj = js.Dynamic.literal(geometryMaxBoundingRectangleSizeX = geometryMaxBoundingRectangleSizeX.asInstanceOf[js.Any], geometryMaxBoundingRectangleSizeY = geometryMaxBoundingRectangleSizeY.asInstanceOf[js.Any], supportedGeometryTypes = supportedGeometryTypes.asInstanceOf[js.Any], supportsMValues = supportsMValues.asInstanceOf[js.Any], supportsZValues = supportsZValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDefinitionServiceCapabilitiesGeometryCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceDefinitionServiceCapabilitiesGeometryCapabilities] (val x: Self) extends AnyVal {
    
    inline def setGeometryMaxBoundingRectangleSizeX(value: Double): Self = StObject.set(x, "geometryMaxBoundingRectangleSizeX", value.asInstanceOf[js.Any])
    
    inline def setGeometryMaxBoundingRectangleSizeY(value: Double): Self = StObject.set(x, "geometryMaxBoundingRectangleSizeY", value.asInstanceOf[js.Any])
    
    inline def setSupportedGeometryTypes(value: js.Array[String]): Self = StObject.set(x, "supportedGeometryTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedGeometryTypesVarargs(value: String*): Self = StObject.set(x, "supportedGeometryTypes", js.Array(value*))
    
    inline def setSupportsMValues(value: Double): Self = StObject.set(x, "supportsMValues", value.asInstanceOf[js.Any])
    
    inline def setSupportsZValues(value: Double): Self = StObject.set(x, "supportsZValues", value.asInstanceOf[js.Any])
  }
}
