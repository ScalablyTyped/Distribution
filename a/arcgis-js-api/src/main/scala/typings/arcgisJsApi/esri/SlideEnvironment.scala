package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.std.PropertyKey
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
  var lighting: js.UndefOr[Lighting] = js.undefined
}
object SlideEnvironment {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[js.Function2[/* propertyName */ String, /* value */ js.Any, SlideEnvironment]]) & (js.UndefOr[js.Function1[/* props */ HashMap[js.Any], SlideEnvironment]])
  ): SlideEnvironment = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideEnvironment]
  }
  
  @scala.inline
  implicit class SlideEnvironmentMutableBuilder[Self <: SlideEnvironment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLighting(value: Lighting): Self = StObject.set(x, "lighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightingUndefined: Self = StObject.set(x, "lighting", js.undefined)
  }
}
