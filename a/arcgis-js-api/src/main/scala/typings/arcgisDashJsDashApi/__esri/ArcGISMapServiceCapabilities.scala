package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGISMapServiceCapabilities extends Object {
  /**
    * Indicates options supported by the exportMap operation. Will be `null` if the `supportsExportMap` is `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var exportMap: ArcGISMapServiceCapabilitiesExportMap
  /**
    * Indicates options supported by the exportTiles operation. Will be `null` if the `supportsExportTiles` is `false`.
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
}

