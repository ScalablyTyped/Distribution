package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionParameters extends StObject {
  
  /**
    * A list of custom parameters appended to the URL of the stream service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#ConnectionParameters)
    */
  var customParameters: js.UndefOr[Any] = js.undefined
  
  /**
    * The SQL where clause used to filter features based on their attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#ConnectionParameters)
    */
  var definitionExpression: js.UndefOr[String] = js.undefined
  
  /**
    * An [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) object used to filter features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#ConnectionParameters)
    */
  var geometryDefinition: js.UndefOr[Extent] = js.undefined
  
  /**
    * The maximum number of attempts to reconnect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#ConnectionParameters)
    */
  var maxReconnectionAttempts: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum time to wait in seconds between attempts to reconnect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#ConnectionParameters)
    */
  var maxReconnectionInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * The spatial reference of the geometries emitted by the connection.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#ConnectionParameters)
    */
  var spatialReference: js.UndefOr[String] = js.undefined
}
object ConnectionParameters {
  
  inline def apply(): ConnectionParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionParameters]
  }
  
  extension [Self <: ConnectionParameters](x: Self) {
    
    inline def setCustomParameters(value: Any): Self = StObject.set(x, "customParameters", value.asInstanceOf[js.Any])
    
    inline def setCustomParametersUndefined: Self = StObject.set(x, "customParameters", js.undefined)
    
    inline def setDefinitionExpression(value: String): Self = StObject.set(x, "definitionExpression", value.asInstanceOf[js.Any])
    
    inline def setDefinitionExpressionUndefined: Self = StObject.set(x, "definitionExpression", js.undefined)
    
    inline def setGeometryDefinition(value: Extent): Self = StObject.set(x, "geometryDefinition", value.asInstanceOf[js.Any])
    
    inline def setGeometryDefinitionUndefined: Self = StObject.set(x, "geometryDefinition", js.undefined)
    
    inline def setMaxReconnectionAttempts(value: Double): Self = StObject.set(x, "maxReconnectionAttempts", value.asInstanceOf[js.Any])
    
    inline def setMaxReconnectionAttemptsUndefined: Self = StObject.set(x, "maxReconnectionAttempts", js.undefined)
    
    inline def setMaxReconnectionInterval(value: Double): Self = StObject.set(x, "maxReconnectionInterval", value.asInstanceOf[js.Any])
    
    inline def setMaxReconnectionIntervalUndefined: Self = StObject.set(x, "maxReconnectionInterval", js.undefined)
    
    inline def setSpatialReference(value: String): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
  }
}
