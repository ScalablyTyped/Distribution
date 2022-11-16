package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideEnvironment
  extends StObject
     with AnonymousAccessor {
  
  /**
    * Settings for defining the lighting of the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#environment)
    */
  var lighting: js.UndefOr[websceneSunLighting | websceneVirtualLighting] = js.undefined
}
object SlideEnvironment {
  
  inline def apply(
    set: (js.UndefOr[js.Function2[/* propertyName */ String, /* value */ Any, SlideEnvironment]]) & (js.UndefOr[js.Function1[/* props */ HashMap[Any], SlideEnvironment]])
  ): SlideEnvironment = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideEnvironment]
  }
  
  extension [Self <: SlideEnvironment](x: Self) {
    
    inline def setLighting(value: websceneSunLighting | websceneVirtualLighting): Self = StObject.set(x, "lighting", value.asInstanceOf[js.Any])
    
    inline def setLightingUndefined: Self = StObject.set(x, "lighting", js.undefined)
  }
}
