package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`default-curve-extension`
import typings.arcgisJsApi.arcgisJsApiStrings.`keep-end-attributes`
import typings.arcgisJsApi.arcgisJsApiStrings.`no-end-attributes`
import typings.arcgisJsApi.arcgisJsApiStrings.`no-extend-at-from`
import typings.arcgisJsApi.arcgisJsApiStrings.`no-extend-at-to`
import typings.arcgisJsApi.arcgisJsApiStrings.`relocate-ends`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrimExtendParametersProperties extends StObject {
  
  /**
    * A flag used with the `trimExtend` operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-TrimExtendParameters.html#extendHow)
    */
  var extendHow: js.UndefOr[
    `default-curve-extension` | `relocate-ends` | `keep-end-attributes` | `no-end-attributes` | `no-extend-at-from` | `no-extend-at-to`
  ] = js.undefined
  
  /**
    * The array of polylines to trim or extend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-TrimExtendParameters.html#polylines)
    */
  var polylines: js.UndefOr[js.Array[PolylineProperties]] = js.undefined
  
  /**
    * A polyline used as a guide for trimming or extending input polylines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-TrimExtendParameters.html#trimExtendTo)
    */
  var trimExtendTo: js.UndefOr[PolylineProperties] = js.undefined
}
object TrimExtendParametersProperties {
  
  @scala.inline
  def apply(): TrimExtendParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrimExtendParametersProperties]
  }
  
  @scala.inline
  implicit class TrimExtendParametersPropertiesMutableBuilder[Self <: TrimExtendParametersProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtendHow(
      value: `default-curve-extension` | `relocate-ends` | `keep-end-attributes` | `no-end-attributes` | `no-extend-at-from` | `no-extend-at-to`
    ): Self = StObject.set(x, "extendHow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendHowUndefined: Self = StObject.set(x, "extendHow", js.undefined)
    
    @scala.inline
    def setPolylines(value: js.Array[PolylineProperties]): Self = StObject.set(x, "polylines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylinesUndefined: Self = StObject.set(x, "polylines", js.undefined)
    
    @scala.inline
    def setPolylinesVarargs(value: PolylineProperties*): Self = StObject.set(x, "polylines", js.Array(value :_*))
    
    @scala.inline
    def setTrimExtendTo(value: PolylineProperties): Self = StObject.set(x, "trimExtendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimExtendToUndefined: Self = StObject.set(x, "trimExtendTo", js.undefined)
  }
}
