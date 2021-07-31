package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildingFilterBlock
  extends StObject
     with Object {
  
  /**
    * The SQL where clause used to match features to this filter block.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#BuildingFilterBlock)
    */
  var filterExpression: String
  
  /**
    * This object contains information about the filter mode of the filter block.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#BuildingFilterBlock)
    */
  var filterMode: js.UndefOr[BuildingFilterBlockFilterMode] = js.undefined
  
  /**
    * Title of the filter for display in UIs, for example when the filter block is edited in ArcGIS Pro.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#BuildingFilterBlock)
    */
  var title: js.UndefOr[String] = js.undefined
}
object BuildingFilterBlock {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    filterExpression: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): BuildingFilterBlock = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], filterExpression = filterExpression.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[BuildingFilterBlock]
  }
  
  @scala.inline
  implicit class BuildingFilterBlockMutableBuilder[Self <: BuildingFilterBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterExpression(value: String): Self = StObject.set(x, "filterExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterMode(value: BuildingFilterBlockFilterMode): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterModeUndefined: Self = StObject.set(x, "filterMode", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
