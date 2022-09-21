package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcGISImageServiceCapabilitiesQuery
  extends StObject
     with Object {
  
  /**
    * The maximum number of records that will be returned for a given query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var maxRecordCount: Boolean
  
  /**
    * Indicates if the layer supports queries for distinct values based on fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsDistinct: Boolean
  
  /**
    * Indicates if the layer returned in the query response can be ordered by one or more fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsOrderBy: Boolean
  
  /**
    * Indicates if the layer supports paged queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsPagination: Boolean
  
  /**
    * Indicates if the layer supports use of standardized queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsStandardizedQueriesOnly: Boolean
  
  /**
    * Indicates if the layer supports field-based statistical functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsStatistics: Boolean
}
object ArcGISImageServiceCapabilitiesQuery {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    maxRecordCount: Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsDistinct: Boolean,
    supportsOrderBy: Boolean,
    supportsPagination: Boolean,
    supportsStandardizedQueriesOnly: Boolean,
    supportsStatistics: Boolean
  ): ArcGISImageServiceCapabilitiesQuery = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxRecordCount = maxRecordCount.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsDistinct = supportsDistinct.asInstanceOf[js.Any], supportsOrderBy = supportsOrderBy.asInstanceOf[js.Any], supportsPagination = supportsPagination.asInstanceOf[js.Any], supportsStandardizedQueriesOnly = supportsStandardizedQueriesOnly.asInstanceOf[js.Any], supportsStatistics = supportsStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGISImageServiceCapabilitiesQuery]
  }
  
  extension [Self <: ArcGISImageServiceCapabilitiesQuery](x: Self) {
    
    inline def setMaxRecordCount(value: Boolean): Self = StObject.set(x, "maxRecordCount", value.asInstanceOf[js.Any])
    
    inline def setSupportsDistinct(value: Boolean): Self = StObject.set(x, "supportsDistinct", value.asInstanceOf[js.Any])
    
    inline def setSupportsOrderBy(value: Boolean): Self = StObject.set(x, "supportsOrderBy", value.asInstanceOf[js.Any])
    
    inline def setSupportsPagination(value: Boolean): Self = StObject.set(x, "supportsPagination", value.asInstanceOf[js.Any])
    
    inline def setSupportsStandardizedQueriesOnly(value: Boolean): Self = StObject.set(x, "supportsStandardizedQueriesOnly", value.asInstanceOf[js.Any])
    
    inline def setSupportsStatistics(value: Boolean): Self = StObject.set(x, "supportsStatistics", value.asInstanceOf[js.Any])
  }
}
