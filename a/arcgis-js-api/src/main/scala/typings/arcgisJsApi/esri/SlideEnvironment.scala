package typings.arcgisJsApi.esri

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
  
  inline def apply(): SlideEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlideEnvironment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlideEnvironment] (val x: Self) extends AnyVal {
    
    inline def setLighting(value: websceneSunLighting | websceneVirtualLighting): Self = StObject.set(x, "lighting", value.asInstanceOf[js.Any])
    
    inline def setLightingUndefined: Self = StObject.set(x, "lighting", js.undefined)
  }
}
