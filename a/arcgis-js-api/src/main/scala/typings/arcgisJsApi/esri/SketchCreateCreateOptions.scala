package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.click
import typings.arcgisJsApi.arcgisJsApiStrings.freehand
import typings.arcgisJsApi.arcgisJsApiStrings.hybrid
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchCreateCreateOptions extends Object {
  
  /**
    * The default z-value of the newly created geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#create)
    */
  var defaultZ: js.UndefOr[Double] = js.native
  
  /**
    * Controls whether the created geometry has z-values or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#create)
    */
  var hasZ: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies how the graphic can be created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#create)
    */
  var mode: js.UndefOr[hybrid | freehand | click] = js.native
}
object SketchCreateCreateOptions {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SketchCreateCreateOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SketchCreateCreateOptions]
  }
  
  @scala.inline
  implicit class SketchCreateCreateOptionsMutableBuilder[Self <: SketchCreateCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultZ(value: Double): Self = StObject.set(x, "defaultZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultZUndefined: Self = StObject.set(x, "defaultZ", js.undefined)
    
    @scala.inline
    def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
    
    @scala.inline
    def setMode(value: hybrid | freehand | click): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
