package typings.arcgisJsApi.esri

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
  var lighting: js.UndefOr[LightingProperties] = js.undefined
}
object SlideEnvironmentProperties {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SlideEnvironmentProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SlideEnvironmentProperties]
  }
  
  @scala.inline
  implicit class SlideEnvironmentPropertiesMutableBuilder[Self <: SlideEnvironmentProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLighting(value: LightingProperties): Self = StObject.set(x, "lighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightingUndefined: Self = StObject.set(x, "lighting", js.undefined)
  }
}
