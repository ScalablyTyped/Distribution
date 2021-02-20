package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSVLayerCapabilitiesQueryRelated extends Object {
  
  /**
    * Indicates if the layer's query response includes the number of features or records related to features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsCount: Boolean = js.native
  
  /**
    * Indicates if the related features or records returned in the query response can be ordered by one or more fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsOrderBy: Boolean = js.native
  
  /**
    * Indicates if the query response supports pagination for related features or records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#capabilities)
    */
  var supportsPagination: Boolean = js.native
}
object CSVLayerCapabilitiesQueryRelated {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsCount: Boolean,
    supportsOrderBy: Boolean,
    supportsPagination: Boolean
  ): CSVLayerCapabilitiesQueryRelated = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsCount = supportsCount.asInstanceOf[js.Any], supportsOrderBy = supportsOrderBy.asInstanceOf[js.Any], supportsPagination = supportsPagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSVLayerCapabilitiesQueryRelated]
  }
  
  @scala.inline
  implicit class CSVLayerCapabilitiesQueryRelatedMutableBuilder[Self <: CSVLayerCapabilitiesQueryRelated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSupportsCount(value: Boolean): Self = StObject.set(x, "supportsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsOrderBy(value: Boolean): Self = StObject.set(x, "supportsOrderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsPagination(value: Boolean): Self = StObject.set(x, "supportsPagination", value.asInstanceOf[js.Any])
  }
}
