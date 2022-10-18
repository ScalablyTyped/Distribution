package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TimeSliderViewModel
import typings.arcgisJsApi.esri.TimeSliderViewModelConstructor
import typings.arcgisJsApi.esri.TimeSliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsTimeSliderTimeSliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/TimeSlider/TimeSliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TimeSliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/TimeSlider/TimeSliderViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [TimeSlider](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider-TimeSliderViewModel.html)
    */
  open class Class ()
    extends StObject
       with TimeSliderViewModel {
    def this(properties: TimeSliderViewModelProperties) = this()
  }
  
  type _To = js.Object & TimeSliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsTimeSliderTimeSliderViewModelMod.foo` */
  override def _to: js.Object & TimeSliderViewModelConstructor = ^
}
