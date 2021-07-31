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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightModelInfoProperties extends StObject {
  
  /**
    * The surface type or height model of the vertical coordinate system (VCS).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#heightModel)
    */
  var heightModel: js.UndefOr[`gravity-related-height` | ellipsoidal] = js.undefined
  
  /**
    * The unit of the vertical coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#heightUnit)
    */
  var heightUnit: js.UndefOr[
    meters_ | feet_ | `us-feet` | `clarke-feet` | `clarke-yards` | `clarke-links` | `sears-yards` | `sears-feet` | `sears-chains` | `benoit-1895-b-chains` | `indian-yards` | `indian-1937-yards` | `gold-coast-feet` | `sears-1922-truncated-chains` | `50-kilometers` | `150-kilometers`
  ] = js.undefined
  
  /**
    * The datum realization of the vertical coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-HeightModelInfo.html#vertCRS)
    */
  var vertCRS: js.UndefOr[String] = js.undefined
}
object HeightModelInfoProperties {
  
  @scala.inline
  def apply(): HeightModelInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeightModelInfoProperties]
  }
  
  @scala.inline
  implicit class HeightModelInfoPropertiesMutableBuilder[Self <: HeightModelInfoProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeightModel(value: `gravity-related-height` | ellipsoidal): Self = StObject.set(x, "heightModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightModelUndefined: Self = StObject.set(x, "heightModel", js.undefined)
    
    @scala.inline
    def setHeightUnit(
      value: meters_ | feet_ | `us-feet` | `clarke-feet` | `clarke-yards` | `clarke-links` | `sears-yards` | `sears-feet` | `sears-chains` | `benoit-1895-b-chains` | `indian-yards` | `indian-1937-yards` | `gold-coast-feet` | `sears-1922-truncated-chains` | `50-kilometers` | `150-kilometers`
    ): Self = StObject.set(x, "heightUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUnitUndefined: Self = StObject.set(x, "heightUnit", js.undefined)
    
    @scala.inline
    def setVertCRS(value: String): Self = StObject.set(x, "vertCRS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertCRSUndefined: Self = StObject.set(x, "vertCRS", js.undefined)
  }
}
