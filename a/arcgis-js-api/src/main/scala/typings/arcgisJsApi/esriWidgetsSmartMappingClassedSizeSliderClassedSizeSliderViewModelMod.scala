package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ClassedSizeSliderViewModel
import typings.arcgisJsApi.esri.ClassedSizeSliderViewModelConstructor
import typings.arcgisJsApi.esri.ClassedSizeSliderViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSmartMappingClassedSizeSliderClassedSizeSliderViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/smartMapping/ClassedSizeSlider/ClassedSizeSliderViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & ClassedSizeSliderViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/smartMapping/ClassedSizeSlider/ClassedSizeSliderViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [ClassedSizeSlider](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider-ClassedSizeSliderViewModel.html)
    */
  open class Class ()
    extends StObject
       with ClassedSizeSliderViewModel {
    def this(properties: ClassedSizeSliderViewModelProperties) = this()
  }
  
  type _To = js.Object & ClassedSizeSliderViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsSmartMappingClassedSizeSliderClassedSizeSliderViewModelMod.foo` */
  override def _to: js.Object & ClassedSizeSliderViewModelConstructor = ^
}
