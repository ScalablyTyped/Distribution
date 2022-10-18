package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ScaleRangeSliderViewModel
import typings.arcgisJsApi.esri.ScaleRangeSliderViewModelConstructor
import typings.arcgisJsApi.esri.ScaleRangeSliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsScaleRangeSliderScaleRangeSliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/ScaleRangeSlider/ScaleRangeSliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ScaleRangeSliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/ScaleRangeSlider/ScaleRangeSliderViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [ScaleRangeSlider](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRangeSliderViewModel.html)
    */
  open class Class ()
    extends StObject
       with ScaleRangeSliderViewModel {
    def this(properties: ScaleRangeSliderViewModelProperties) = this()
  }
  
  type _To = js.Object & ScaleRangeSliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsScaleRangeSliderScaleRangeSliderViewModelMod.foo` */
  override def _to: js.Object & ScaleRangeSliderViewModelConstructor = ^
}
