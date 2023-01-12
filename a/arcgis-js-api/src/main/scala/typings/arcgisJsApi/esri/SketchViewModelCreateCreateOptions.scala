package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.click
import typings.arcgisJsApi.arcgisJsApiStrings.freehand
import typings.arcgisJsApi.arcgisJsApiStrings.hybrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchViewModelCreateCreateOptions extends StObject {
  
  /**
    * The default z-value of the newly created geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#create)
    */
  var defaultZ: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls whether the created geometry has z-values or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#create)
    */
  var hasZ: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies how the graphic can be created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#create)
    */
  var mode: js.UndefOr[hybrid | freehand | click] = js.undefined
}
object SketchViewModelCreateCreateOptions {
  
  inline def apply(): SketchViewModelCreateCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SketchViewModelCreateCreateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchViewModelCreateCreateOptions] (val x: Self) extends AnyVal {
    
    inline def setDefaultZ(value: Double): Self = StObject.set(x, "defaultZ", value.asInstanceOf[js.Any])
    
    inline def setDefaultZUndefined: Self = StObject.set(x, "defaultZ", js.undefined)
    
    inline def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
    
    inline def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
    
    inline def setMode(value: hybrid | freehand | click): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
