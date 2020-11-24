package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.bevelled
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.mitered
import typings.arcgisJsApi.arcgisJsApiStrings.rounded
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffsetParametersProperties extends js.Object {
  
  /**
    * The `bevelRatio` is multiplied by the offset distance and the result determines how far a mitered offset intersection can be located before it is beveled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#bevelRatio)
    */
  var bevelRatio: js.UndefOr[Double] = js.native
  
  /**
    * The array of geometries to be offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#geometries)
    */
  var geometries: js.UndefOr[js.Array[GeometryProperties]] = js.native
  
  /**
    * Specifies the planar distance for constructing an offset based on the input geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#offsetDistance)
    */
  var offsetDistance: js.UndefOr[Double] = js.native
  
  /**
    * Options that determine how the ends intersect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#offsetHow)
    */
  var offsetHow: js.UndefOr[bevelled | mitered | rounded] = js.native
  
  /**
    * The offset distance unit.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-OffsetParameters.html#offsetUnit)
    */
  var offsetUnit: js.UndefOr[feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards] = js.native
}
object OffsetParametersProperties {
  
  @scala.inline
  def apply(): OffsetParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffsetParametersProperties]
  }
  
  @scala.inline
  implicit class OffsetParametersPropertiesOps[Self <: OffsetParametersProperties] (val x: Self) extends AnyVal {
    
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
    def setBevelRatio(value: Double): Self = this.set("bevelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBevelRatio: Self = this.set("bevelRatio", js.undefined)
    
    @scala.inline
    def setGeometriesVarargs(value: GeometryProperties*): Self = this.set("geometries", js.Array(value :_*))
    
    @scala.inline
    def setGeometries(value: js.Array[GeometryProperties]): Self = this.set("geometries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometries: Self = this.set("geometries", js.undefined)
    
    @scala.inline
    def setOffsetDistance(value: Double): Self = this.set("offsetDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetDistance: Self = this.set("offsetDistance", js.undefined)
    
    @scala.inline
    def setOffsetHow(value: bevelled | mitered | rounded): Self = this.set("offsetHow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetHow: Self = this.set("offsetHow", js.undefined)
    
    @scala.inline
    def setOffsetUnit(value: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards): Self = this.set("offsetUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffsetUnit: Self = this.set("offsetUnit", js.undefined)
  }
}
