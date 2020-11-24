package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`default-curve-extension`
import typings.arcgisJsApi.arcgisJsApiStrings.`keep-end-attributes`
import typings.arcgisJsApi.arcgisJsApiStrings.`no-end-attributes`
import typings.arcgisJsApi.arcgisJsApiStrings.`no-extend-at-from`
import typings.arcgisJsApi.arcgisJsApiStrings.`no-extend-at-to`
import typings.arcgisJsApi.arcgisJsApiStrings.`relocate-ends`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrimExtendParametersProperties extends js.Object {
  
  /**
    * A flag used with the `trimExtend` operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-TrimExtendParameters.html#extendHow)
    */
  var extendHow: js.UndefOr[
    `default-curve-extension` | `relocate-ends` | `keep-end-attributes` | `no-end-attributes` | `no-extend-at-from` | `no-extend-at-to`
  ] = js.native
  
  /**
    * The array of polylines to trim or extend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-TrimExtendParameters.html#polylines)
    */
  var polylines: js.UndefOr[js.Array[PolylineProperties]] = js.native
  
  /**
    * A polyline used as a guide for trimming or extending input polylines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-TrimExtendParameters.html#trimExtendTo)
    */
  var trimExtendTo: js.UndefOr[PolylineProperties] = js.native
}
object TrimExtendParametersProperties {
  
  @scala.inline
  def apply(): TrimExtendParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrimExtendParametersProperties]
  }
  
  @scala.inline
  implicit class TrimExtendParametersPropertiesOps[Self <: TrimExtendParametersProperties] (val x: Self) extends AnyVal {
    
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
    def setExtendHow(
      value: `default-curve-extension` | `relocate-ends` | `keep-end-attributes` | `no-end-attributes` | `no-extend-at-from` | `no-extend-at-to`
    ): Self = this.set("extendHow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendHow: Self = this.set("extendHow", js.undefined)
    
    @scala.inline
    def setPolylinesVarargs(value: PolylineProperties*): Self = this.set("polylines", js.Array(value :_*))
    
    @scala.inline
    def setPolylines(value: js.Array[PolylineProperties]): Self = this.set("polylines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolylines: Self = this.set("polylines", js.undefined)
    
    @scala.inline
    def setTrimExtendTo(value: PolylineProperties): Self = this.set("trimExtendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrimExtendTo: Self = this.set("trimExtendTo", js.undefined)
  }
}
