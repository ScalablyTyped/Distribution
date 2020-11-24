package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroundQueryElevationOptions extends Object {
  
  /**
    * The value that appears in the resulting geometry when there is no data available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#queryElevation)
    */
  var noDataValue: js.UndefOr[Double] = js.native
  
  /**
    * Indicates whether to return additional sample information for each sampled coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#queryElevation)
    */
  var returnSampleInfo: js.UndefOr[Boolean] = js.native
}
object GroundQueryElevationOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): GroundQueryElevationOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[GroundQueryElevationOptions]
  }
  
  @scala.inline
  implicit class GroundQueryElevationOptionsOps[Self <: GroundQueryElevationOptions] (val x: Self) extends AnyVal {
    
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
    def setNoDataValue(value: Double): Self = this.set("noDataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDataValue: Self = this.set("noDataValue", js.undefined)
    
    @scala.inline
    def setReturnSampleInfo(value: Boolean): Self = this.set("returnSampleInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnSampleInfo: Self = this.set("returnSampleInfo", js.undefined)
  }
}
