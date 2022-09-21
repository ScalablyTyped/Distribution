package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ColorSizeSliderViewModel
import typings.arcgisJsApi.esri.ColorSizeSliderViewModelConstructor
import typings.arcgisJsApi.esri.ColorSizeSliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorSizeSliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/ColorSizeSlider/ColorSizeSliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ColorSizeSliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/ColorSizeSlider/ColorSizeSliderViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [ColorSizeSlider](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSizeSlider-ColorSizeSliderViewModel.html)
    */
  open class Class ()
    extends StObject
       with ColorSizeSliderViewModel {
    def this(properties: ColorSizeSliderViewModelProperties) = this()
  }
  
  type _To = js.Object & ColorSizeSliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `colorSizeSliderViewModelMod.foo` */
  override def _to: js.Object & ColorSizeSliderViewModelConstructor = ^
}
