package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.websceneSunLightingProper
import typings.arcgisJsApi.anon.websceneVirtualLightingPr
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideEnvironmentProperties
  extends StObject
     with Object {
  
  /**
    * Settings for defining the lighting of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#environment)
    */
  var lighting: js.UndefOr[websceneSunLightingProper | websceneVirtualLightingPr] = js.undefined
}
object SlideEnvironmentProperties {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SlideEnvironmentProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SlideEnvironmentProperties]
  }
  
  extension [Self <: SlideEnvironmentProperties](x: Self) {
    
    inline def setLighting(value: websceneSunLightingProper | websceneVirtualLightingPr): Self = StObject.set(x, "lighting", value.asInstanceOf[js.Any])
    
    inline def setLightingUndefined: Self = StObject.set(x, "lighting", js.undefined)
  }
}
