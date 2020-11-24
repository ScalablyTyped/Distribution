package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcGISImageServiceCapabilitiesQuery extends Object {
  
  /**
    * The maximum number of records that will be returned for a given query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var maxRecordCount: Unit = js.native
  
  /**
    * Indicates if the layer supports queries for distinct values based on fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsDistinct: Unit = js.native
  
  /**
    * Indicates if the layer returned in the query response can be ordered by one or more fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsOrderBy: Unit = js.native
  
  /**
    * Indicates if the layer supports paged queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsPagination: Unit = js.native
  
  /**
    * Indicates if the layer supports use of standardized queries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsStandardizedQueriesOnly: Unit = js.native
  
  /**
    * Indicates if the layer supports field-based statistical functions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#capabilities)
    */
  var supportsStatistics: Unit = js.native
}
object ArcGISImageServiceCapabilitiesQuery {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    maxRecordCount: Unit,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsDistinct: Unit,
    supportsOrderBy: Unit,
    supportsPagination: Unit,
    supportsStandardizedQueriesOnly: Unit,
    supportsStatistics: Unit
  ): ArcGISImageServiceCapabilitiesQuery = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxRecordCount = maxRecordCount.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsDistinct = supportsDistinct.asInstanceOf[js.Any], supportsOrderBy = supportsOrderBy.asInstanceOf[js.Any], supportsPagination = supportsPagination.asInstanceOf[js.Any], supportsStandardizedQueriesOnly = supportsStandardizedQueriesOnly.asInstanceOf[js.Any], supportsStatistics = supportsStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcGISImageServiceCapabilitiesQuery]
  }
  
  @scala.inline
  implicit class ArcGISImageServiceCapabilitiesQueryOps[Self <: ArcGISImageServiceCapabilitiesQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxRecordCount(value: Unit): Self = this.set("maxRecordCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsDistinct(value: Unit): Self = this.set("supportsDistinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsOrderBy(value: Unit): Self = this.set("supportsOrderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsPagination(value: Unit): Self = this.set("supportsPagination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsStandardizedQueriesOnly(value: Unit): Self = this.set("supportsStandardizedQueriesOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsStatistics(value: Unit): Self = this.set("supportsStatistics", value.asInstanceOf[js.Any])
  }
}
