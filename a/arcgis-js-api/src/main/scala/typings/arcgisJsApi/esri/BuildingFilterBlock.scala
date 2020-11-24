package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingFilterBlock extends Object {
  
  /**
    * The SQL where clause used to match features to this filter block.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#BuildingFilterBlock)
    */
  var filterExpression: String = js.native
  
  /**
    * This object contains information about the filter mode of the filter block.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#BuildingFilterBlock)
    */
  var filterMode: js.UndefOr[BuildingFilterBlockFilterMode] = js.native
  
  /**
    * Title of the filter for display in UIs, for example when the filter block is edited in ArcGIS Pro.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingFilter.html#BuildingFilterBlock)
    */
  var title: js.UndefOr[String] = js.native
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
  implicit class BuildingFilterBlockOps[Self <: BuildingFilterBlock] (val x: Self) extends AnyVal {
    
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
    def setFilterExpression(value: String): Self = this.set("filterExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterMode(value: BuildingFilterBlockFilterMode): Self = this.set("filterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterMode: Self = this.set("filterMode", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
