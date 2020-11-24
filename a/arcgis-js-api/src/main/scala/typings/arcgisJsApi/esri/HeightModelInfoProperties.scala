package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`150-kilometers`
import typings.arcgisJsApi.arcgisJsApiStrings.`50-kilometers`
import typings.arcgisJsApi.arcgisJsApiStrings.`benoit-1895-b-chains`
import typings.arcgisJsApi.arcgisJsApiStrings.`clarke-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`clarke-links`
import typings.arcgisJsApi.arcgisJsApiStrings.`clarke-yards`
import typings.arcgisJsApi.arcgisJsApiStrings.`gold-coast-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`gravity-related-height`
import typings.arcgisJsApi.arcgisJsApiStrings.`indian-1937-yards`
import typings.arcgisJsApi.arcgisJsApiStrings.`indian-yards`
import typings.arcgisJsApi.arcgisJsApiStrings.`sears-1922-truncated-chains`
import typings.arcgisJsApi.arcgisJsApiStrings.`sears-chains`
import typings.arcgisJsApi.arcgisJsApiStrings.`sears-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`sears-yards`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.ellipsoidal
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeightModelInfoProperties extends js.Object {
  
  /**
    * The surface type or height model of the vertical coordinate system (VCS).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#heightModel)
    */
  var heightModel: js.UndefOr[`gravity-related-height` | ellipsoidal] = js.native
  
  /**
    * The unit of the vertical coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#heightUnit)
    */
  var heightUnit: js.UndefOr[
    meters_ | feet_ | `us-feet` | `clarke-feet` | `clarke-yards` | `clarke-links` | `sears-yards` | `sears-feet` | `sears-chains` | `benoit-1895-b-chains` | `indian-yards` | `indian-1937-yards` | `gold-coast-feet` | `sears-1922-truncated-chains` | `50-kilometers` | `150-kilometers`
  ] = js.native
  
  /**
    * The datum realization of the vertical coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#vertCRS)
    */
  var vertCRS: js.UndefOr[String] = js.native
}
object HeightModelInfoProperties {
  
  @scala.inline
  def apply(): HeightModelInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightModelInfoProperties]
  }
  
  @scala.inline
  implicit class HeightModelInfoPropertiesOps[Self <: HeightModelInfoProperties] (val x: Self) extends AnyVal {
    
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
    def setHeightModel(value: `gravity-related-height` | ellipsoidal): Self = this.set("heightModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightModel: Self = this.set("heightModel", js.undefined)
    
    @scala.inline
    def setHeightUnit(
      value: meters_ | feet_ | `us-feet` | `clarke-feet` | `clarke-yards` | `clarke-links` | `sears-yards` | `sears-feet` | `sears-chains` | `benoit-1895-b-chains` | `indian-yards` | `indian-1937-yards` | `gold-coast-feet` | `sears-1922-truncated-chains` | `50-kilometers` | `150-kilometers`
    ): Self = this.set("heightUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightUnit: Self = this.set("heightUnit", js.undefined)
    
    @scala.inline
    def setVertCRS(value: String): Self = this.set("vertCRS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertCRS: Self = this.set("vertCRS", js.undefined)
  }
}
