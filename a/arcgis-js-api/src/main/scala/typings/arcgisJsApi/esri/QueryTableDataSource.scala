package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`query-table`
import typings.arcgisJsApi.arcgisJsApiStrings.multipatch
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryTableDataSource
  extends StObject
     with Object {
  
  /**
    * The geometry type of each record in the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var geometryType: point | multipoint | polyline | polygon | multipatch
  
  /**
    * The field name(s) containing the unique IDs for each record in the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var oidFields: String
  
  /**
    * The SQL query used to filter records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var query: String
  
  /**
    * The spatial reference of the geometry of each feature in the table source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var spatialReference: SpatialReference
  
  /**
    * This value is always `query-table` and is inferred when the `query` property of this object is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var `type`: `query-table`
  
  /**
    * The workspace where the data resides (defined in ArcGIS Server Manager).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var workspaceId: String
}
object QueryTableDataSource {
  
  inline def apply(
    constructor: js.Function,
    geometryType: point | multipoint | polyline | polygon | multipatch,
    hasOwnProperty: PropertyKey => Boolean,
    oidFields: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    query: String,
    spatialReference: SpatialReference,
    workspaceId: String
  ): QueryTableDataSource = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], geometryType = geometryType.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), oidFields = oidFields.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), query = query.asInstanceOf[js.Any], spatialReference = spatialReference.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("query-table")
    __obj.asInstanceOf[QueryTableDataSource]
  }
  
  extension [Self <: QueryTableDataSource](x: Self) {
    
    inline def setGeometryType(value: point | multipoint | polyline | polygon | multipatch): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    inline def setOidFields(value: String): Self = StObject.set(x, "oidFields", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setSpatialReference(value: SpatialReference): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setType(value: `query-table`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
