package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGISMapServiceCapabilities
  extends StObject
     with Object {
  
  /**
    * Indicates options supported by the exportMap operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var exportMap: ArcGISMapServiceCapabilitiesExportMap
  
  /**
    * Indicates options supported by the exportTiles operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var exportTiles: ArcGISMapServiceCapabilitiesExportTiles
  
  /**
    * Indicates operations that can be performed on the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var operations: ArcGISMapServiceCapabilitiesOperations
}
object ArcGISMapServiceCapabilities {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    exportMap: ArcGISMapServiceCapabilitiesExportMap,
    exportTiles: ArcGISMapServiceCapabilitiesExportTiles,
    hasOwnProperty: PropertyKey => Boolean,
    operations: ArcGISMapServiceCapabilitiesOperations,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ArcGISMapServiceCapabilities = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], exportMap = exportMap.asInstanceOf[js.Any], exportTiles = exportTiles.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), operations = operations.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ArcGISMapServiceCapabilities]
  }
  
  @scala.inline
  implicit class ArcGISMapServiceCapabilitiesMutableBuilder[Self <: ArcGISMapServiceCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportMap(value: ArcGISMapServiceCapabilitiesExportMap): Self = StObject.set(x, "exportMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportTiles(value: ArcGISMapServiceCapabilitiesExportTiles): Self = StObject.set(x, "exportTiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: ArcGISMapServiceCapabilitiesOperations): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
  }
}
